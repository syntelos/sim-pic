package hexf;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.StringTokenizer;

/**
 * 
 * 
 */
public class Code
    extends Object
{

    public final String string;

    public final int length, offset, type;

    public final byte[] data;

    /**
     * Parse code
     */
    public Code(File file, int lno, String line){
	super();
	this.string = line;
	if (0 < line.length()){
	    if (':' == line.charAt(0)){
		this.length = HexByte(line,1);
		this.offset = HexWord(line,3);
		this.type = HexByte(line,7);
		if (0 == this.length){

		    this.data = new byte[0];

		    return;
		}
		else if (0 != this.type)
		    throw new Skip(file,lno,line,"Type not zero");
		else {
		    byte chk=(byte)(this.length+this.type+(this.offset & 0xFF)+((this.offset>>8) & 0xFF));
		    int pos = 9;
		    {
			byte[] data = new byte[this.length];

			for (int cc = 0; cc < this.length; cc++){
			    int ind = HexByte(line,pos);
			    chk += (byte)ind;
			    data[cc] = (byte)ind;
			    pos += 2;
			}
			this.data = data;
		    }
		    chk += (byte)HexByte(line,pos);
		    if (0 != chk)
			throw new Syntax(file,lno,line,"Checksum Error");
		    return;
		}
	    }
	    else
		throw new Syntax(file,lno,line,"Bad Format");
	}
	else
	    throw new Syntax(file,lno,"Empty Line");
    }


    public String toString(){
	return this.string;
    }


    private final static int HexByte( String data, int offset )
       throws NumberFormatException
    {
	return Integer.parseInt( data.substring( offset, offset+2 ), 16 );
    }
    private final static int HexWord( String data, int offset )
	throws NumberFormatException
    {
	return Integer.parseInt( data.substring( offset, offset+4 ), 16 );
    }
    public final static byte[] Edit(byte[] list, Code code){
	if (0 < code.length){
	    final int count = (code.offset+code.length);
	    if (null == list){
		if (0 == code.offset)
		    return code.data;
		else {
		    byte[] copy = new byte[count];
		    System.arraycopy(code.data,0,copy,code.offset,code.length);
		    return copy;
		}
	    }
	    else {
		final int listlen = list.length;
		if (count < listlen){
		    System.arraycopy(code.data,0,list,code.offset,code.length);
		    return list;
		}
		else {
		    byte[] copy = new byte[count];
		    System.arraycopy(list,0,copy,0,listlen);
		    System.arraycopy(code.data,0,copy,code.offset,code.length);
		    return copy;
		}
	    }
	}
	else
	    return list;
    }
}
