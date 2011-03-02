package hexf;

import java.io.File;

/**
 * 
 */
public class Syntax 
    extends RuntimeException
{

    public Syntax(File file, int lno, String input, String msg){
	super(String.format("In %s:%d: %s%n\t%s",file.getPath(),lno,msg,Safe(input)));
    }
    public Syntax(File file, int lno, String msg){
	super(String.format("In %s:%d: %s",file.getPath(),lno,msg));
    }


    public final static String Safe(String input){
	if (null == input)
	    return "";
	else if (40 < input.length())
	    return (input.substring(0,37)+"...");
	else
	    return input;
    }
}
