// Generated by sim-pic:port from mach.xtm via hapax2

import lib.mach.Bit;
import lib.mach.Instruction;
import lib.mach.Register;
import lib.mach.Op;
import lib.mach.P14;

/**
 * Generated SimPic Port of P16F84A.
 */
public class P16F84A
    extends lib.mach.AbstractMachine
{

    public final Register INDF = new Register(this,"INDF",0x0);
    public final Register TMR0 = new Register(this,"TMR0",0x1);
    public final Register PCL = new Register(this,"PCL",0x2);
    public final Register STATUS = new Register(this,"STATUS",0x3);
    public final Register FSR = new Register(this,"FSR",0x4);
    public final Register PORTA = new Register(this,"PORTA",0x5);
    public final Register PORTB = new Register(this,"PORTB",0x6);
    public final Register EEDATA = new Register(this,"EEDATA",0x8);
    public final Register EEADR = new Register(this,"EEADR",0x9);
    public final Register PCLATH = new Register(this,"PCLATH",0xa);
    public final Register INTCON = new Register(this,"INTCON",0xb);
    public final Register OPTION_REG = new Register(this,"OPTION_REG",0x81);
    public final Register TRISA = new Register(this,"TRISA",0x85);
    public final Register TRISB = new Register(this,"TRISB",0x86);
    public final Register EECON1 = new Register(this,"EECON1",0x88);
    public final Register EECON2 = new Register(this,"EECON2",0x89);

    public final Bit IRP = new Bit(this,this.STATUS,"IRP",0x7);
    public final Bit RP1 = new Bit(this,this.STATUS,"RP1",0x6);
    public final Bit RP0 = new Bit(this,this.STATUS,"RP0",0x5);
    public final Bit NOT_TO = new Bit(this,this.STATUS,"NOT_TO",0x4);
    public final Bit NOT_PD = new Bit(this,this.STATUS,"NOT_PD",0x3);
    public final Bit Z = new Bit(this,this.STATUS,"Z",0x2);
    public final Bit DC = new Bit(this,this.STATUS,"DC",0x1);
    public final Bit C = new Bit(this,this.STATUS,"C",0x0);
    public final Bit GIE = new Bit(this,this.INTCON,"GIE",0x7);
    public final Bit EEIE = new Bit(this,this.INTCON,"EEIE",0x6);
    public final Bit T0IE = new Bit(this,this.INTCON,"T0IE",0x5);
    public final Bit INTE = new Bit(this,this.INTCON,"INTE",0x4);
    public final Bit RBIE = new Bit(this,this.INTCON,"RBIE",0x3);
    public final Bit T0IF = new Bit(this,this.INTCON,"T0IF",0x2);
    public final Bit INTF = new Bit(this,this.INTCON,"INTF",0x1);
    public final Bit RBIF = new Bit(this,this.INTCON,"RBIF",0x0);
    public final Bit NOT_RBPU = new Bit(this,this.INTCON,"NOT_RBPU",0x7);
    public final Bit INTEDG = new Bit(this,this.INTCON,"INTEDG",0x6);
    public final Bit T0CS = new Bit(this,this.INTCON,"T0CS",0x5);
    public final Bit T0SE = new Bit(this,this.INTCON,"T0SE",0x4);
    public final Bit PSA = new Bit(this,this.INTCON,"PSA",0x3);
    public final Bit PS2 = new Bit(this,this.INTCON,"PS2",0x2);
    public final Bit PS1 = new Bit(this,this.INTCON,"PS1",0x1);
    public final Bit PS0 = new Bit(this,this.INTCON,"PS0",0x0);
    public final Bit EEIF = new Bit(this,this.INTCON,"EEIF",0x4);
    public final Bit WRERR = new Bit(this,this.INTCON,"WRERR",0x3);
    public final Bit WREN = new Bit(this,this.INTCON,"WREN",0x2);
    public final Bit WR = new Bit(this,this.INTCON,"WR",0x1);
    public final Bit RD = new Bit(this,this.INTCON,"RD",0x0);
    public final Bit _CP_ON = new Bit(this,this.INTCON,"_CP_ON",0xf);
    public final Bit _CP_OFF = new Bit(this,this.INTCON,"_CP_OFF",0x3fff);
    public final Bit _PWRTE_ON = new Bit(this,this.INTCON,"_PWRTE_ON",0x3ff7);
    public final Bit _PWRTE_OFF = new Bit(this,this.INTCON,"_PWRTE_OFF",0x3fff);
    public final Bit _WDT_ON = new Bit(this,this.INTCON,"_WDT_ON",0x3fff);
    public final Bit _WDT_OFF = new Bit(this,this.INTCON,"_WDT_OFF",0x3ffb);
    public final Bit _LP_OSC = new Bit(this,this.INTCON,"_LP_OSC",0x3ffc);
    public final Bit _XT_OSC = new Bit(this,this.INTCON,"_XT_OSC",0x3ffd);
    public final Bit _HS_OSC = new Bit(this,this.INTCON,"_HS_OSC",0x3ffe);
    public final Bit _RC_OSC = new Bit(this,this.INTCON,"_RC_OSC",0x3fff);


    public P16F84A(){
        super();
        this.initPage(0x0,0x3ff);
        this.initConfig(0x2007,0x2007);
        this.initEedata(0x2100,0x213f);
        this.initSfr(0x0,0xb);
        this.initSfr(0x80,0x8b);
        this.initGpr(0xc,0x4f);
    }


    public Instruction createInstruction(int addr, int opc){
        Op op = P14.For(opc);
        if (null != op)
            return new Instruction(this,op,addr,opc);
        else
            throw new IllegalArgumentException(String.format("0x%x",addr));
    }
}