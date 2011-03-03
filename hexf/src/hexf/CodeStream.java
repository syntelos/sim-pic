package hexf;

public class CodeStream
    extends Object
{

    public final Hexf hexf;

    public final Code[] code;

    public final int count;

    public final int offset, length;

    private int index, address;


    public CodeStream(Hexf hexf){
	this(hexf,hexf.code);
    }
    private CodeStream(Hexf hexf, Code[] code){
	super();
	this.hexf = hexf;
	if (null != code){
	    java.util.Arrays.sort(code);
	    this.code = code;
	    this.count = code.length;
	    {
		Code first = code[0];
		this.offset = first.offset;
	    }
	    {
		Code last = code[this.count-1];
		this.length = (last.offset+last.length);
	    }
	}
	else
	    throw new IllegalStateException(String.format("Empty HEX file '%s'.",hexf.name));
    }


    /**
     * @return Zero-positive complete, Integer.MIN_VALUE or
     * Integer.MAX_VALUE for address miss (under or over).
     */
    public int uint8(int addr){
	if (this.index < this.count){
	    Code code = this.code[this.index];
	    int value = code.uint8(addr);
	    if (-1 < value && value < Integer.MAX_VALUE)
		return value;
	    else if (0 > value)
		return Integer.MIN_VALUE;
	    else {
		this.index += 1;
		return this.uint8(addr);
	    }
	}
	else
	    return Integer.MAX_VALUE;
    }
    /**
     * @return Zero-positive complete, Integer.MIN_VALUE or
     * Integer.MAX_VALUE for address miss (under or over).
     */
    public int uint16(int addr){
	if (this.index < this.count){
	    Code code = this.code[this.index];
	    int value = code.uint16(addr);
	    if (-1 < value && value < Integer.MAX_VALUE)
		return value;
	    else if (0 > value){
		if (Integer.MIN_VALUE == value)
		    return Integer.MIN_VALUE;
		else {
		    this.index += 1;
		    code = this.code[this.index];
		    int value1 = code.uint8(addr);
		    if (-1 < value1 && value1 < Integer.MAX_VALUE)
			return ((-value) | (value1 <<8));
		    else
			throw new BadAddress(hexf,addr);
		}
	    }
	    else {
		this.index += 1;
		return this.uint16(addr);
	    }
	}
	else
	    return Integer.MAX_VALUE;
    }
}
