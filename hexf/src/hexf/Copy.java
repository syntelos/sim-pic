package hexf;

/**
 * 
 */
public class Copy
    extends RuntimeException
{

    public Copy(int offset, int length){
	super(String.format("Offset %d mismatched to %d",offset,length));
    }

}
