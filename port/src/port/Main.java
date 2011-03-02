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


    public static void main(String[] argv){
        if (null != argv){
            try {

                int clock;
                Arch arch;
                File incf, lkrf, tgtf;
                switch(argv.length){

                case 3:
                    clock = Integer.decode(argv[0]);
                    arch = Arch.For(argv[1]);
                    incf = Utils.GetHeader(argv[2]);
                    lkrf = Utils.GetLinkerScript(argv[2]);
                    tgtf = null;
                    break;

                case 4:
                    clock = Integer.decode(argv[0]);
                    arch = Arch.For(argv[1]);
                    incf = Utils.GetHeader(argv[2]);
                    lkrf = Utils.GetLinkerScript(argv[2]);
                    tgtf = new File(argv[3]);
                    break;

                case 5:
                    clock = Integer.decode(argv[0]);
                    arch = Arch.For(argv[1]);
                    incf = Utils.GetHeader(argv[2]);
                    lkrf = Utils.GetLinkerScript(argv[3]);
                    tgtf = new File(argv[4]);
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

                                if (null == tgtf){
                                    tgtf = new File("src/aino/lib/"+inc.name+".java");
                                    File tgtd = tgtf.getParentFile();
                                    if (!tgtd.isDirectory()){

                                        System.err.printf("Error, target directory not found '%s'.%n",tgtd.getPath());
                                        System.exit(1);
                                        return;
                                    }
                                }

                                Lib tgt = new Lib(clock,arch,inc,lkr);
                                tgt.write(tgtf);

                                System.err.printf("Success writing file '%s'.%n",tgtf.getPath());
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
    private final static void Usage(){

        System.err.println("Usage");
        System.err.println();
        System.err.println("  aino.port.Main  <clock>  <arch>  <src.inc>  <src.lkr>  <tgt.java>");
        System.err.println("  aino.port.Main  <clock>  <arch>  <proc.id>  <tgt.java>");
        System.err.println("  aino.port.Main  <clock>  <arch>  <proc.id>  ");
        System.err.println();
        System.err.println("Description");
        System.err.println();
        System.err.println("    clock    -- FOSC, e.g., 4000000");
        System.err.println();
        System.err.println("    arch     -- Element of aino.ano.Arch, e.g. 'p14'.");
        System.err.println();
        System.err.println("    src.inc  -- Assembler constants, e.g. ");
        System.err.println("                    /usr/local/share/gputils/header/p16f873.inc");
        System.err.println();
        System.err.println("    src.lkr  -- Assembler linker script, e.g. ");
        System.err.println("                    /usr/local/share/gputils/lkr/16f873.lkr");
        System.err.println();
        System.err.println("    proc.id  -- Processor name, e.g. p16f873 or 16f873.");
        System.err.println();
        System.err.println("    tgt.java -- Aino lib source, e.g. ");
        System.err.println("                    src/aino/lib/P16F873.java");
        System.err.println();
        System.err.println();
        System.exit(1);
    }
}
