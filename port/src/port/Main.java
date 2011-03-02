package port;

import java.io.File;
import java.io.IOException;

/**
 * Read
 * <pre> //gputils/header/SOURCE.inc </pre>
 * and
 * <pre> //gputils/lkr/SOURCE.lkr </pre>
 */
public class Main {

    private final static void Usage(){

        System.err.println("Usage");
        System.err.println();
        System.err.println("  port.Main  <clock>  <arch>  <inc>  <lkr>  <src>  <tgt>");
        System.err.println("  port.Main  <clock>  <arch>  <proc>  <src>  <tgt>");
        System.err.println();
        System.err.println("Description");
        System.err.println();
        System.err.println("    clock    -- FOSC, e.g., 4000000");
        System.err.println();
        System.err.println("    arch     -- Element of Arch, e.g. 'p14'.");
        System.err.println();
        System.err.println("    inc      -- Assembler constants, e.g. ");
        System.err.println("                    //gputils/header/p16f873.inc");
        System.err.println();
        System.err.println("    lkr      -- Assembler linker script, e.g. ");
        System.err.println("                    //gputils/lkr/16f873.lkr");
        System.err.println();
        System.err.println("    proc     -- Processor name, e.g. p16f873 or 16f873.");
        System.err.println();
        System.err.println("    src      -- Template (source) name");
        System.err.println();
        System.err.println("    tgt      -- Template target (output) file");
        System.err.println();
        System.err.println();
        System.exit(1);
    }

    public static void main(String[] argv){
        if (null != argv){
            try {

                int clock;
                Arch arch;
		String srct;
                File incf, lkrf, tgtf;
                switch(argv.length){

                case 5:
                    clock = Integer.decode(argv[0]);
                    arch = Arch.For(argv[1]);
                    incf = GpUtils.GetHeader(argv[2]);
                    lkrf = GpUtils.GetLinkerScript(argv[2]);
		    srct = argv[3];
                    tgtf = new File(argv[4]);
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

                if (incf.isFile() && incf.canRead()){

                    if (lkrf.isFile() && lkrf.canRead()){

                        Header inc = new Header(incf);

                        if (inc.isNotEmpty()){

                            Lkr lkr = new Lkr(lkrf);

                            if (lkr.isNotEmpty()){



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
