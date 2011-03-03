package lib.mach;

/**
 * Microchip Mid Range MCU instruction set.
 */
public enum P14
    implements Op
{

        NOP( 0x3F9F, 0x0000,    Operand.None),
     RETURN( 0x3FFF, 0x0008,    Operand.None),
     RETFIE( 0x3FFF, 0x0009,    Operand.None),
     OPTION( 0x3FFF, 0x0062,    Operand.None),
     CLRWDT( 0x3FFF, 0x0064,    Operand.None),
      SLEEP( 0x3FFF, 0x0063,    Operand.None),
       TRIS( 0x3FF8, 0x0060,    Operand.TRIS),
      MOVWF( 0x3F80, 0x0080,    Operand.Flag),
       CLRW( 0x3FFF, 0x0103,    Operand.None),
       CLRF( 0x3F80, 0x0180,    Operand.Flag),
      SUBWF( 0x3F00, 0x0200,  Operand.SrcDst),
       DECF( 0x3F00, 0x0300,  Operand.SrcDst),
      IORWF( 0x3F00, 0x0400,  Operand.SrcDst),
      ANDWF( 0x3F00, 0x0500,  Operand.SrcDst),
      XORWF( 0x3F00, 0x0600,  Operand.SrcDst),
      ADDWF( 0x3F00, 0x0700,  Operand.SrcDst),
       MOVF( 0x3F00, 0x0800,  Operand.SrcDst),
       COMF( 0x3F00, 0x0900,  Operand.SrcDst),
       INCF( 0x3F00, 0x0A00,  Operand.SrcDst),
     DECFSZ( 0x3F00, 0x0B00,  Operand.SrcDst),
        RRF( 0x3F00, 0x0C00,  Operand.SrcDst),
        RLF( 0x3F00, 0x0D00,  Operand.SrcDst),
      SWAPF( 0x3F00, 0x0E00,  Operand.SrcDst),
     INCFSZ( 0x3F00, 0x0F00,  Operand.SrcDst),
        BCF( 0x3C00, 0x1000,    Operand.Bits),
        BSF( 0x3C00, 0x1400,    Operand.Bits),
      BTFSC( 0x3C00, 0x1800,    Operand.Bits),
      BTFSS( 0x3C00, 0x1C00,    Operand.Bits),
       CALL( 0x3800, 0x2000, Operand.Address),
       GOTO( 0x3800, 0x2800, Operand.Address),
      MOVLW( 0x3C00, 0x3000, Operand.Literal),
      RETLW( 0x3C00, 0x3400, Operand.Literal),
      IORLW( 0x3F00, 0x3800, Operand.Literal),
      ANDLW( 0x3F00, 0x3900, Operand.Literal),
      XORLW( 0x3F00, 0x3A00, Operand.Literal),
      SUBLW( 0x3E00, 0x3C00, Operand.Literal),
      ADDLW( 0x3E00, 0x3E00, Operand.Literal);



    private final static P14[] Values = P14.values();

    public final static P14 For(int opc){
	for (P14 op: Values){
	    if (op.opcode == (opc & op.bitmask))
		return op;
	}
	return null;
    }

    public final int bitmask;
    public final int opcode;
    public final Operand parameters;

    P14(int bitmask, int opcode, Operand params){
	this.bitmask = bitmask;
	this.opcode = opcode;
	this.parameters = params;
    }


    public int getBitmask(){
	return this.bitmask;
    }
    public int getOpcode(){
	return this.opcode;
    }
    public String getName(){
	return this.name();
    }
    public int getOrdinal(){
	return this.ordinal();
    }
    public Operand getParameters(){
	return this.parameters;
    }
    public int requiredParameters() {
	switch (this.parameters) {
	case Bits:
	    return 2;
	case Flag: 
	case SrcDst:
	case Address:
	case Literal:
	case TRIS:
	    return 1;
	case None:
	default:
	    return 0;
	}
    }
    public int optionalParameters() {
	if (Operand.SrcDst == this.parameters)
	    return 1;
	else
	    return 0;
    }
    public boolean step(AbstractMachine m){
	Instruction instr = m.current();
	switch( ((P14)instr.opcode)){
        case NOP:
	    return m.execNop(instr);
	case RETURN:
	case RETFIE:
	    return m.execReturn(instr);
	case OPTION:
	    return m.execNop(instr);
	case CLRWDT:
	    return m.execNop(instr);
	case SLEEP:
	    return m.execNop(instr);
	case TRIS:
	    return m.execNop(instr);
	case MOVWF:
	    return m.execNop(instr);
	case CLRW:
	    return m.execClrw(instr);
	case CLRF:
	    return m.execClear(instr);
	case SUBWF:
	    return m.execNop(instr);
	case DECF:
	    return m.execNop(instr);
	case IORWF:
	    return m.execNop(instr);
	case ANDWF:
	    return m.execNop(instr);
	case XORWF:
	    return m.execNop(instr);
	case ADDWF:
	    return m.execNop(instr);
	case MOVF:
	    return m.execNop(instr);
	case COMF:
	    return m.execNop(instr);
	case INCF:
	    return m.execNop(instr);
	case DECFSZ:
	    return m.execNop(instr);
        case RRF:
	    return m.execNop(instr);
        case RLF:
	    return m.execNop(instr);
	case SWAPF:
	    return m.execNop(instr);
	case INCFSZ:
	    return m.execNop(instr);
        case BCF:
	    return m.execNop(instr);
        case BSF:
	    return m.execNop(instr);
	case BTFSC:
	    return m.execNop(instr);
	case BTFSS:
	    return m.execNop(instr);
	case CALL:
	    return m.execCall(instr);
	case GOTO:
	    return m.execGoto(instr);
	case MOVLW:
	    return m.execNop(instr);
	case RETLW:
	    return m.execNop(instr);
	case IORLW:
	    return m.execNop(instr);
	case ANDLW:
	    return m.execNop(instr);
	case XORLW:
	    return m.execNop(instr);
	case SUBLW:
	    return m.execNop(instr);
	case ADDLW:
	    return m.execNop(instr);
	default:
	    throw new Error(instr.opcode.getName());
	}
    }
}
