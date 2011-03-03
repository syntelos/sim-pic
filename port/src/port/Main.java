package port;

import java.io.File;
import java.io.IOException;

/**
 * Read
 * <pre> //gputils/header/SOURCE.inc </pre>
 * and
 * <pre> //gputils/lkr/SOURCE.lkr </pre>
 */
public class Main
    extends FileIO
{

    private final static void Usage(){

        System.err.println("Usage");
        System.err.println();
        System.err.println("  port.Main  <clock.n>   <arch.n>   <inc.f>   <lkr.f>  <src.n>   <tgt.f>");
        System.err.println("  port.Main  <clock.n>   <arch.n>   <proc.n>  <src.n>  <tgt.f>");
        System.err.println("  port.Main  <clock.n>   <arch.n>   <proc.f>  <src.n>  <tgt.d>");
        System.err.println();
        System.err.println("Description");
        System.err.println();
        System.err.println("    clock.n  -- FOSC number, e.g., 4000000");
        System.err.println();
        System.err.println("    arch.n   -- Arch name, e.g. 'P14'.");
        System.err.println();
        System.err.println("    inc.f    -- Header file, e.g. ");
        System.err.println("                    //gputils/header/p16f873.inc");
        System.err.println();
        System.err.println("    lkr.f    -- Linker script file, e.g. ");
        System.err.println("                    //gputils/lkr/16f873.lkr");
        System.err.println();
        System.err.println("    proc.n   -- Processor name, e.g. p16f873 or 16f873.");
        System.err.println();
        System.err.println("    proc.f   -- Processor name file, one per line in plain text.");
        System.err.println();
        System.err.println("    src.n    -- Template (source) name");
        System.err.println();
        System.err.println("    tgt.f    -- Template target (output) file");
        System.err.println();
        System.err.println("    tgt.d    -- Template target (output) directory");
        System.err.println();
        System.err.println();
        System.exit(1);
    }

    public static void main(String[] argv){
        if (null != argv){
            try {
                int clock = 0;
                Arch arch = null;
		String srct = null;
                File procf = null, incf = null, lkrf = null, tgtf = null, tgtd = null;
                switch(argv.length){

                case 5:
                    clock = Integer.decode(argv[0]);
                    arch = Arch.For(argv[1]);
		    procf = new File(argv[2]);
		    if (procf.isFile()){
			srct = argv[3];
			tgtd = new File(argv[4]);
			if (!tgtd.isDirectory())
			    Usage();
		    }
		    else {
			procf = null;
			incf = GpUtils.GetHeader(argv[2]);
			lkrf = GpUtils.GetLinkerScript(argv[2]);
			srct = argv[3];
			tgtf = new File(argv[4]);
			if (tgtf.isDirectory())
			    Usage();
		    }
                    break;

                case 6:
                    clock = Integer.decode(argv[0]);
                    arch = Arch.For(argv[1]);
                    incf = GpUtils.GetHeader(argv[2]);
                    lkrf = GpUtils.GetLinkerScript(argv[3]);
		    srct = argv[4];
                    tgtf = new File(argv[5]);
                    break;

                default:
                    Usage();
                    return;
                }
		Word.Define(arch);

		if (null != procf && null != tgtd){

		    String[] proclist = ReadLines(procf);
		    if (null == proclist)
			Usage();
		    else {
			for (String procn: proclist){
			    incf = GpUtils.GetHeader(procn);
			    lkrf = GpUtils.GetLinkerScript(procn);

			    if (incf.isFile() && incf.canRead()){

				if (lkrf.isFile() && lkrf.canRead()){

				    Header inc = new Header(incf);

				    if (inc.isNotEmpty()){

					Lkr lkr = new Lkr(lkrf);

					if (lkr.isNotEmpty()){

					    Input input = new Input(clock,arch,inc,lkr);

					    tgtf = new File(tgtd,inc.name+".java");

					    Templates.Instance.generate(input,srct,tgtf);

					    System.err.printf("Wrote file '%s'.%n",tgtf.getPath());
					}
					else {
					    System.err.printf("Warning, error parsing file '%s'.%n",lkrf.getPath());
					}
				    }
				    else {
					System.err.printf("Warning, error parsing file '%s'.%n",incf.getPath());
				    }
				}
				else {
				    System.err.printf("Warning, file not found '%s'.%n",lkrf.getPath());
				}
			    }
			    else {
				System.err.printf("Warning, file not found '%s'.%n",incf.getPath());
			    }
			}
			System.exit(0);
		    }
		}
                else if (null != incf && null != lkrf){
		    if (incf.isFile() && incf.canRead()){

			if (lkrf.isFile() && lkrf.canRead()){

			    Header inc = new Header(incf);

			    if (inc.isNotEmpty()){

				Lkr lkr = new Lkr(lkrf);

				if (lkr.isNotEmpty()){

				    Input input = new Input(clock,arch,inc,lkr);

				    Templates.Instance.generate(input,srct,tgtf);

				    System.err.printf("Wrote file '%s'.%n",tgtf.getPath());
				    System.exit(0);
				}
				else {
				    System.err.printf("Error parsing file '%s'.%n",lkrf.getPath());
				    System.exit(1);
				}
			    }
			    else {
				System.err.printf("Error parsing file '%s'.%n",incf.getPath());
				System.exit(1);
			    }
			}
			else {
			    System.err.printf("Error, file not found '%s'.%n",lkrf.getPath());
			    System.exit(1);
			}
		    }
		    else {
			System.err.printf("Error, file not found '%s'.%n",incf.getPath());
			System.exit(1);
		    }
		}
		else
		    Usage();
            }
            catch (Throwable exc){
                exc.printStackTrace();
                System.exit(1);
            }
        }
        else {
            Usage();
        }
    }
}
