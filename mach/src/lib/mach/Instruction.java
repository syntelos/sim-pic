package lib.mach;

public class Instruction
    extends Object
{

    private final AbstractMachine machine;

    public final Op opcode;

    public final int pageAddress;

    public final int register, literal, address, bits, mask;

    public final boolean dstW, dstF;



    public Instruction(AbstractMachine m, Op o, int a, int v){
	super();
	if (null != m && null != o){
	    this.machine = m;
	    this.opcode = o;
	    this.pageAddress = a;

	    this.register = (v & 0x07F);
	    this.literal  = (v & 0x0FF);
	    this.address  = (v & 0x7FF);
	    this.bits = ((v >> 7) & 0x007);
	    this.mask = (1<<bits);
	    this.dstW = (0 == (v & 0x080));
	    this.dstF = (!this.dstW);
	}
	else
	    throw new IllegalArgumentException();
    }


    public final static Instruction[] Add(Instruction[] list, Instruction item){
	if (null == item)
	    return list;
	else if (null == list)
	    return new Instruction[]{item};
	else {
	    int count = list.length;
	    Instruction[] copier = new Instruction[count+1];
	    System.arraycopy(list,0,copier,0,count);
	    copier[count] = item;
	    return copier;
	}
    }
}
