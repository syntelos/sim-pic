package hexf;

public class CodeStream
    extends Object
{

    public final Hexf hexf;

    private final byte[] code;

    public final int offset, length;


    CodeStream(Hexf hexf, byte[] code, int ofs, int len){
	super();
	this.hexf = hexf;
	if (null != code){
	    this.code = code;
	    this.offset = ofs;
	    this.length = len;
	}
	else
	    throw new IllegalStateException(String.format("Empty HEX file '%s'.",hexf.name));
    }


    public int uint8(int addr){

	return (this.code[addr-this.offset] & 0xFF);
    }
    public int uint16(int addr){
	int idx = (addr-this.offset);
	final int value0 = (this.code[idx] & 0xFF);
	idx += 1;
	final int value1 = (this.code[idx] & 0xFF);

	return (value0 | (value1 <<8));
    }
}
