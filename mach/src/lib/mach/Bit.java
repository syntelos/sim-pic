package lib.mach;

public class Bit
    extends Object
{

    public final AbstractMachine machine;

    public final Register register;

    public final String name;

    public final int number;


    public Bit(AbstractMachine m, Register r, String n, int b){
	super();
	this.machine = m;
	this.register = r;
	this.name = n;
	this.number = b;
    }
}
