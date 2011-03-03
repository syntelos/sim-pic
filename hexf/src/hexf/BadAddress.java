package hexf;

/**
 * 
 */
public class BadAddress
    extends RuntimeException
{

    public BadAddress(int addr){
	super(String.format("Bad address 0x%x",addr));
    }
    public BadAddress(Hexf hexf, int addr){
	super(String.format("Bad address 0x%x in %s",addr,hexf.name));
    }
    public BadAddress(CodeStream stream, int addr){
	this(stream.hexf,addr);
    }

}
