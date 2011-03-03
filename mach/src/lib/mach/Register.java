package lib.mach;

public class Register
    extends Object
{

    public final AbstractMachine machine;

    public final String name;

    public final int address;


    public Register(AbstractMachine m, String n, int a){
	super();
	this.machine = m;
	this.name = n;
	this.address = a;
    }
}
