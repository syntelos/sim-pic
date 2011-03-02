package port;

/**
 * Basic ALU word size is configured from {@link Arch}.
 */
public enum Word {
    W8, W16, W32;

    private static Word Arch;

    public final static Word Define(Word arch){
	if (null == arch)
	    throw new IllegalArgumentException();
	else
	    return (Word.Arch = arch);
    }
    public final static Word Define(Arch arch){
	if (null == arch)
	    throw new IllegalArgumentException();
	else {
	    switch (arch){
	    case P14:
		return (Word.Arch = W8);
	    default:
		throw new Error(arch.name());
	    }
	}
    }
    public final static Word Arch(){
	if (null == Word.Arch)
	    throw new IllegalStateException();
	else
	    return Word.Arch;
    }
}
