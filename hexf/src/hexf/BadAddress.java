package hexf;

/**
 * 
 */
public class BadAddress
    extends RuntimeException
{

    public BadAddress(int addr){
	super(String.format("Bad address %d",addr));
    }
    public BadAddress(Hexf hexf, int addr){
	super(String.format("Bad address %d in %s",addr,hexf.name));
    }
    public BadAddress(CodeStream stream, int addr){
	this(stream.hexf,addr);
    }

}
