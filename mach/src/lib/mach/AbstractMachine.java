package lib.mach;

import hexf.BadAddress;
import hexf.CodeStream;
import hexf.Command;
import hexf.Machine;

public abstract class AbstractMachine
    extends Object
    implements Machine
{
    private int pageStart = Integer.MAX_VALUE, pageEnd = Integer.MIN_VALUE;
    private int configStart = Integer.MAX_VALUE, configEnd = Integer.MIN_VALUE;
    private int eedataStart = Integer.MAX_VALUE, eedataEnd = Integer.MIN_VALUE;
    private int dataStart = Integer.MAX_VALUE, dataEnd = Integer.MIN_VALUE;

    public enum Space {
	Page, Config, EEData, DATA;

	public static class Bounds {

	    public final int start, end;

	    public Bounds(int s, int e){
		super();
		this.start = s;
		this.end = e;
	    }
	}
    }


    private byte[] config, eedata, data;

    private Instruction[] code;

    private int PC, W;

    private int[] returnStack = new int[16];

    private int returnStackIndex;


    public AbstractMachine(){
        super();
    }


    protected void initPage(int start, int end){
	this.pageStart = Math.min(this.pageStart,start);
	this.pageEnd = Math.max(this.pageEnd,end);
    }
    protected int indexPage(int address){
	return ((address>>1)-this.pageStart);
    }
    protected void initConfig(int start, int end){
	this.configStart = Math.min(this.configStart,start);
	this.configEnd = Math.max(this.configEnd,end);

	int len = (this.configEnd-this.configStart);
	if (null == this.config)
	    this.config = new byte[len];
	else if (this.config.length < len)
	    this.config = new byte[len];
	else
	    throw new BadAddress(end);
    }
    public int uint8Config(int address){
	return this.config[this.indexConfig(address)];
    }
    public int uint8Config(int address, int value){
	return this.config[this.indexConfig(address)] = (byte)value;
    }
    protected int indexConfig(int address){
	return (address-this.configStart);
    }
    protected void initEedata(int start, int end){
	this.eedataStart = Math.min(this.eedataStart,start);
	this.eedataEnd = Math.max(this.eedataEnd,end);

	int len = (this.eedataEnd-this.eedataStart);
	if (null == this.eedata)
	    this.eedata = new byte[len];
	else if (this.eedata.length < end)
	    this.eedata = new byte[len];
	else
	    throw new BadAddress(end);
    }
    protected int indexEedata(int address){
	return (address-this.eedataStart);
    }
    public int uint8Eedata(int address){
	return this.eedata[this.indexEedata(address)];
    }
    public int uint8Eedata(int address, int value){
	return this.eedata[this.indexEedata(address)] = (byte)value;
    }
    protected void initSfr(int start, int end){
	this.dataStart = Math.min(this.dataStart,start);
	this.dataEnd = Math.max(this.dataEnd,end);

	int len = (this.dataEnd-this.dataStart);
	if (null == this.data)
	    this.data = new byte[len];
	else if (this.data.length < len)
	    this.data = new byte[len];
	else
	    throw new BadAddress(end);
    }
    protected int indexSfr(int address){
	return (address-this.dataStart);
    }
    public int uint8Sfr(int address){
	return this.data[this.indexSfr(address)];
    }
    public int uint8Sfr(int address, int value){
	return this.data[this.indexSfr(address)] = (byte)value;
    }
    protected void initGpr(int start, int end){
	this.dataStart = Math.min(this.dataStart,start);
	this.dataEnd = Math.max(this.dataEnd,end);

	int len = (this.dataEnd-this.dataStart);
	if (null == this.data)
	    this.data = new byte[len];
	else if (this.data.length < len)
	    this.data = new byte[len];
	else
	    throw new BadAddress(end);
    }
    protected int indexGpr(int address){
	return (address-this.dataStart);
    }
    public int uint8Gpr(int address){
	return this.data[this.indexGpr(address)];
    }
    public int uint8Gpr(int address, int value){
	return this.data[this.indexGpr(address)] = (byte)value;
    }
    protected int indexData(int address){
	return (address-this.dataStart);
    }
    public int uint8Data(int address){
	return this.data[this.indexData(address)];
    }
    public int uint8Data(int address, int value){
	return this.data[this.indexData(address)] = (byte)value;
    }
    public Space space(int addr){
	if (this.pageStart <= addr && addr <= this.pageEnd)
	    return Space.Page;
	else if (this.configStart <= addr && addr <= this.configEnd)
	    return Space.Config;
	else if (this.eedataStart <= addr && addr <= this.eedataEnd)
	    return Space.EEData;
	else if (this.dataStart <= addr && addr <= this.dataEnd)
	    return Space.DATA;
	else
	    return null;
    }
    public Space.Bounds bounds(Space space){
	switch(space){
	case Page:
	    return new Space.Bounds(this.pageStart,this.pageEnd);
	case Config:
	    return new Space.Bounds(this.configStart,this.configEnd);
	case EEData:
	    return new Space.Bounds(this.eedataStart,this.eedataEnd);
	case DATA:
	    return new Space.Bounds(this.dataStart,this.dataEnd);
	default:
	    throw new Error(space.name());
	}
    }
    public abstract Instruction createInstruction(int addr, int opc);

    public Machine machineInit(CodeStream code){

	for (int addr = code.offset; addr < code.length; addr++){
	    Space space = this.space(addr);
	    if (null == space)
		throw new BadAddress(code,addr);
	    else {
		switch(space){
		case Page:{
		    int opc = code.uint16(addr);
		    if (0 > opc || Integer.MAX_VALUE == opc)
			continue;
		    else {
			Instruction inst = this.createInstruction(addr,opc);
			this.code = Instruction.Add(this.code,inst);
		    }
		}
		    break;
		case Config:{
		    int value = code.uint8(addr);
		    if (0 > value || Integer.MAX_VALUE == value)
			continue;
		    else {
			this.config[this.indexConfig(addr)] = (byte)value;
		    }
		}
		    break;
		case EEData:{
		    int value = code.uint8(addr);
		    if (0 > value || Integer.MAX_VALUE == value)
			continue;
		    else {
			this.eedata[this.indexEedata(addr)] = (byte)value;
		    }
		}
		    break;
		case DATA:{
		    int value = code.uint8(addr);
		    if (0 > value || Integer.MAX_VALUE == value)
			continue;
		    else {
			this.data[this.indexData(addr)] = (byte)value;
		    }
		}
		    break;
		default:
		    throw new Error(space.name());
		}
	    }
	}
	return this;
    }
    public Machine machineReady(){

	return this;
    }
    public boolean machineRun(Command user){

	switch(user.op){
	case STEP:
	    return true;
	case GOTO:
	    return true;
	case RUN:
	    return true;
	case PRINT:
	    return true;
	case HELP:
	    return true;
	case UNKNOWN:
	case EMPTY:
	    return true;
	case QUIT:
	    return false;
	default:
	    throw new Error(user.op.name());
	}
    }
    public Machine machineDestroy(){

	return this;
    }
    public int getPC(){
	return this.PC;
    }
    public int getW(){
	return this.W;
    }
    public void setW(int w){
	this.W = w;
    }
    public Instruction current(){

	return this.code[this.indexPage(this.PC)];
    }
    public boolean execNop(){

	this.PC += 2;

	return (this.PC < this.pageEnd);
    }
    public boolean execNop(Instruction instr){

	return this.execNop();
    }
    public boolean execGoto(int pc){

	this.PC = pc;

	return (this.PC < this.pageEnd);
    }
    public boolean execGoto(Instruction instr){

	return this.execGoto(instr.address);
    }
    public boolean execReturn(Instruction instr){

	this.PC = this.returnStack[this.returnStackIndex--];

	return (this.PC < this.pageEnd);
    }
    public boolean execCall(Instruction instr){

	this.returnStack[this.returnStackIndex++] = (this.PC+2);

	this.PC = instr.address;

	return (this.PC < this.pageEnd);
    }
    public boolean execClrw(Instruction instr){

	this.W = 0;

	this.PC += 2;

	return (this.PC < this.pageEnd);
    }
    public boolean execClear(Instruction instr){

	this.PC += 2;

	return (this.PC < this.pageEnd);
    }
}
