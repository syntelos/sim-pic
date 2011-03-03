package lib.mach;

public interface Op {

    public String getName();

    public int getOrdinal();

    public int getBitmask();

    public int getOpcode();

    public Operand getParameters();

    public int requiredParameters();

    public int optionalParameters();

    public boolean step(AbstractMachine m);
}
