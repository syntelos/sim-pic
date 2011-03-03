package hexf;

import java.io.File;

/**
 * 
 */
public class Skip 
    extends Syntax
{

    public Skip(File file, int lno, String input, String msg){
	super(file,lno,input,msg);
    }
    public Skip(File file, int lno, String msg){
	super(file,lno,msg);
    }

}
