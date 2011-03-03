package hexf;

import java.io.BufferedReader ;
import java.io.File ;
import java.io.FileInputStream ;
import java.io.InputStream ;
import java.io.InputStreamReader ;
import java.io.IOException ;
import java.io.Reader ;
import java.util.StringTokenizer;

/**
 * 
 */
public class Hexf
    extends hexf.io.FileIO
{
    public final String name;

    private final byte[] code;
    private final int offset, length;


    public Hexf(File file)
	throws IOException
    {
	this(file,(new FileInputStream(file)));
    }
    private Hexf(File file, InputStream in)
	throws IOException
    {
	this(file,(new InputStreamReader(in,"US-ASCII")));
    }
    private Hexf(File file, Reader in)
	throws IOException
    {
	this(file,(new BufferedReader(in)));
    }
    private Hexf(File file, BufferedReader in)
	throws IOException
    {
	super();
	this.name = Basename(file.getName());
	try {
	    int ofs = Integer.MAX_VALUE, len = Integer.MIN_VALUE;

	    int lno = 0;
	    String line;
	    byte[] list = null;
	    Code current = null;
	    boolean children = false;
	    while (null != (line = in.readLine())){
		lno += 1;
		try {
		    current = new Code(file,lno,line);
		    ofs = Math.min(ofs,current.offset);
		    len = Math.max(len,(current.offset+current.length));
		    list = Code.Edit(list,current);
		}
		catch (Skip skip){
		}
	    }
	    this.code = list;
	    this.offset = ofs;
	    this.length = len;
	}
	finally {
	    in.close();
	}
    }

    public CodeStream stream(){
	return new CodeStream(this,this.code,this.offset,this.length);
    }
    public int size(){
	return this.length;
    }
    public byte get(int idx){
	return this.code[idx];
    }
}
