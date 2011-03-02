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
 * Parse a gEDA/gaf file into a list of codes.
 */
public class Hexf
    extends hexf.io.FileIO
    implements Iterable<Code>
{
    public final String name;

    public Code[] codes;


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
	    int lno = 0;
	    String line;
	    Code[] list = null;
	    Code current = null;
	    boolean children = false;
	    while (null != (line = in.readLine())){
		lno += 1;
		current = new Code(file,lno,line);
		list = Code.Add(list,current);
	    }
	    this.codes = list;
	}
	finally {
	    in.close();
	}
    }


    public int size(){
	if (null != this.codes)
	    return this.codes.length;
	else
	    return 0;
    }
    public Code get(int idx){
	if (-1 < idx && idx < this.size())
	    return this.codes[idx];
	else
	    return null;
    }
    public Code first(){
	if (null != this.codes)
	    return this.codes[0];
	else
	    return null;
    }
    public Code[] tail(){
	if (null != this.codes)
	    return Code.Tail(this.codes);
	else
	    return null;
    }
    public java.util.Iterator<Code> iterator(){
	return new Code.Iterator(this.codes);
    }
}
