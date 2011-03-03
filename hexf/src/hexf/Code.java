package hexf;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.StringTokenizer;

/**
 * 
 * 
 * @author John Pritchard <jdp@ulsf.net>
 */
public class Code
    extends Object
    implements Comparable<Code>
{

    public final String string;

    public final int length, offset, type;

    private final byte[] data;

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
		    throw new Syntax(file,lno,line,"Bad Format (type not zero)");
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


    /**
     * @return Zero-positive complete, Integer.MAX_VALUE for overflow and
     * Integer.MIN_VALUE for underflow.
     */
    public int uint8(int addr){
	final int idx = (addr-this.offset);
	if (0 > idx)
	    return Integer.MIN_VALUE;
	else if (idx < this.length)
	    return (this.data[idx] & 0xFF);
	else
	    return Integer.MAX_VALUE;
    }
    /**
     * @return Zero-positive complete, negative continuation,
     * Integer.MAX_VALUE for overflow and Integer.MIN_VALUE for
     * underflow.
     */
    public int uint16(int addr){
	final int idx = (addr-this.offset);
	if (0 > idx)
	    return Integer.MIN_VALUE;
	else if (idx < this.length){
	    final int idx1 = (idx+1);
	    if (idx1 < this.length){
		return ((this.data[idx] & 0xFF) | 
			(this.data[idx1] & 0xFF)<<8);
	    }
	    else
		return -(this.data[idx] & 0xFF);
	}
	else
	    return Integer.MAX_VALUE;
    }
    public int index(int idx){

	if (-1 < idx && idx < this.length)
	    return (this.data[idx] & 0xFF);
	else
	    throw new ArrayIndexOutOfBoundsException(String.valueOf(idx));
    }
    public byte[] copy(){
	if (0 == this.length)
	    return new byte[0];
	else {
	    byte[] copy = new byte[this.length];
	    System.arraycopy(this.data,0,copy,0,this.length);
	    return copy;
	}
    }
    public byte[] copy(byte[] buf){
	if (null == buf){
	    if (0 == this.offset)
		return this.copy();
	    else {
		final int copylen = this.offset+this.length;
		byte[] copy = new byte[copylen];
		System.arraycopy(this.data,0,copy,this.offset,this.length);
		return copy;
	    }
	}
	else {
	    final int copylen = this.offset+this.length;
	    final int buflen = buf.length;
	    if (copylen <= buflen){
		System.arraycopy(this.data,0,buf,this.offset,this.length);
		return buf;
	    }
	    else {
		byte[] copy = new byte[copylen];
		System.arraycopy(buf,0,copy,0,buflen);
		System.arraycopy(this.data,0,copy,this.offset,this.length);
		return copy;
	    }
	}
    }
    public int compareTo(Code that){
	if (this.offset == that.offset)
	    return 0;
	else if (this.offset < that.offset)
	    return -1;
	else
	    return 1;
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
    public final static Code[] Add(Code[] list, Code item){
	if (null == item)
	    return list;
	else if (null == list)
	    return new Code[]{item};
	else {
	    int len = list.length;
	    Code[] copier = new Code[len+1];
	    System.arraycopy(list,0,copier,0,len);
	    copier[len] = item;
	    return copier;
	}
    }
    public final static Code[] Tail(Code[] list){
	if (null == list)
	    return null;
	else {
	    int len = (list.length-1);
	    if (0 < len){
		Code[] copier = new Code[len];
		System.arraycopy(list,1,copier,0,len);
		return copier;
	    }
	    else
		return null;
	}
    }
    /**
     * 
     */
    public static class Iterator
	extends Object
	implements java.lang.Iterable<Code>, java.util.Iterator<Code>
    {

	private final Code[] list;
	private final int length;
	private int index;


	public Iterator(Code[] list){
	    super();
	    if (null == list){
		this.list = null;
		this.length = 0;
	    }
	    else {
		this.list = list;
		this.length = list.length;
	    }
	}


	public boolean hasNext(){
	    return (this.index < this.length);
	}
	public Code next(){
	    return this.list[this.index++];
	}
	public void remove(){
	    throw new UnsupportedOperationException();
	}
	public java.util.Iterator<Code> iterator(){
	    return this;
	}
    }
    /**
     * 
     */
    public static class Iterable
	extends Object
	implements java.lang.Iterable<Code>
    {
	private final Code[] list;


	public Iterable(Code[] list){
	    super();
	    this.list = list;
	}

	public java.util.Iterator<Code> iterator(){
	    return new Code.Iterator(this.list);
	}
    }
}
