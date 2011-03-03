package hexf;

import java.util.StringTokenizer;

public class Command {

    public enum Op {
	STEP, GOTO, RUN, PRINT, HELP, UNKNOWN, EMPTY, QUIT;

	public final static Op For(String op){
	    try {
		return Op.valueOf(op.toUpperCase());
	    }
	    catch (RuntimeException exc){
		return Op.UNKNOWN;
	    }
	}
    }
    public final static Object[] ArgsEmpty = new Object[0];


    public final Op op;

    public final Object[] args;


    public Command(String cmdline){
	super();
	if (0 < cmdline.length()){
	    StringTokenizer strtok = new StringTokenizer(cmdline," ");
	    this.op = Op.For(strtok.nextToken());
	    final int count = strtok.countTokens();
	    if (0 < count){
		Object[] args = new Object[count];
		for (int cc = 0; cc < count; cc++){
		    String sarg = strtok.nextToken();
		    try {
			args[cc] = Integer.decode(sarg);
		    }
		    catch (RuntimeException exc){
			args[cc] = sarg;
		    }
		}
		this.args = args;
	    }
	    else
		this.args = ArgsEmpty;
	}
	else {
	    this.op = Op.EMPTY;
	    this.args = ArgsEmpty;
	}
    }


    public boolean isEmpty(){
	return (Op.EMPTY == this.op);
    }
    public boolean isNotEmpty(){
	return (Op.EMPTY != this.op);
    }
    public boolean hasArgs(){
	return (ArgsEmpty != this.args);
    }
    public boolean hasNotArgs(){
	return (ArgsEmpty == this.args);
    }
}
