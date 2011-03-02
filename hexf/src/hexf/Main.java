package hexf;


import java.io.BufferedReader ;
import java.io.File ;
import java.io.InputStreamReader ;

/**
 */
public class Main
    extends hexf.io.FileIO
{

    public static void Usage(){
	System.out.println("Usage");
	System.out.println();
	System.out.println("    hexf [-m mach.chine] -i file.hex [options]");
	System.out.println();

	System.exit(1);
    }
    public enum Opt {
	H, I, M;

	public static Opt For(String arg){
	    while (0 < arg.length() && '-' == arg.charAt(0))
		arg = arg.substring(1);

	    try {
		return Opt.valueOf(arg.toUpperCase());
	    }
	    catch (RuntimeException exc){
		return Opt.H;
	    }
	}
    }
    public static void main(String[] argv){
	File inf = null;
	Class machineClass = null;
	try {
	    for (int cc = 0, argc = argv.length; cc < argc; cc++){
		String arg = argv[cc];
		Opt opt = Opt.For(arg);
		switch(opt){
		case H:
		    Usage();
		    break;
		case I:
		    cc += 1;
		    if (cc < argc){
			arg = argv[cc];
			inf = new File(arg);
			if (!inf.exists()){
			    System.err.printf("Error, file not found '%s'.%n",inf.getPath());
			    System.exit(1);
			}
		    }
		    else
			Usage();
		    break;
		case M:
		    cc += 1;
		    if (cc < argc){
			arg = argv[cc];
			machineClass = Class.forName(arg);
		    }
		    else
			Usage();
		    break;
		default:
		    throw new Error(opt.name());
		}
	    }
	    if (null != inf){

		Hexf hexf = new Hexf(inf);

		if (null != machineClass){
		    Machine machine = (Machine)machineClass.newInstance();
		    try {
			/*
			 * init
			 */
			for (Code code: hexf)
			    machine.machineInit(code);
			/*
			 * ready
			 */
			machine.machineReady();
			/*
			 * user
			 */
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in,"US-ASCII"));

			System.out.print("> ");

			String cmdline;
			while (null != (cmdline = in.readLine())){
			    Command cmd = new Command(cmdline);
			    if (cmd.isNotEmpty())
				if (!machine.machineRun(cmd))
				    break;

			    System.out.printf("%n> ");
			}
		    }
		    finally {
			machine.machineDestroy();
		    }
		}
		System.exit(0);
	    }
	    else
		Usage();
	}
	catch (Exception exc){

	    exc.printStackTrace();
	    System.exit(1);
	}
    }

}
