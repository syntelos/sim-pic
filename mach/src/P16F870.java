// Generated by sim-pic:port from mach.xtm via hapax2

import lib.mach.Bit;
import lib.mach.Instruction;
import lib.mach.Register;
import lib.mach.Op;
import lib.mach.P14;

/**
 * Generated SimPic Port of P16F870.
 */
public class P16F870
    extends lib.mach.AbstractMachine
{

    public final Register INDF = new Register(this,"INDF",0x0);
    public final Register TMR0 = new Register(this,"TMR0",0x1);
    public final Register PCL = new Register(this,"PCL",0x2);
    public final Register STATUS = new Register(this,"STATUS",0x3);
    public final Register FSR = new Register(this,"FSR",0x4);
    public final Register PORTA = new Register(this,"PORTA",0x5);
    public final Register PORTB = new Register(this,"PORTB",0x6);
    public final Register PORTC = new Register(this,"PORTC",0x7);
    public final Register PCLATH = new Register(this,"PCLATH",0xa);
    public final Register INTCON = new Register(this,"INTCON",0xb);
    public final Register PIR1 = new Register(this,"PIR1",0xc);
    public final Register PIR2 = new Register(this,"PIR2",0xd);
    public final Register TMR1L = new Register(this,"TMR1L",0xe);
    public final Register TMR1H = new Register(this,"TMR1H",0xf);
    public final Register T1CON = new Register(this,"T1CON",0x10);
    public final Register TMR2 = new Register(this,"TMR2",0x11);
    public final Register T2CON = new Register(this,"T2CON",0x12);
    public final Register CCPR1L = new Register(this,"CCPR1L",0x15);
    public final Register CCPR1H = new Register(this,"CCPR1H",0x16);
    public final Register CCP1CON = new Register(this,"CCP1CON",0x17);
    public final Register RCSTA = new Register(this,"RCSTA",0x18);
    public final Register TXREG = new Register(this,"TXREG",0x19);
    public final Register RCREG = new Register(this,"RCREG",0x1a);
    public final Register ADRESH = new Register(this,"ADRESH",0x1e);
    public final Register ADCON0 = new Register(this,"ADCON0",0x1f);
    public final Register OPTION_REG = new Register(this,"OPTION_REG",0x81);
    public final Register TRISA = new Register(this,"TRISA",0x85);
    public final Register TRISB = new Register(this,"TRISB",0x86);
    public final Register TRISC = new Register(this,"TRISC",0x87);
    public final Register PIE1 = new Register(this,"PIE1",0x8c);
    public final Register PIE2 = new Register(this,"PIE2",0x8d);
    public final Register PCON = new Register(this,"PCON",0x8e);
    public final Register PR2 = new Register(this,"PR2",0x92);
    public final Register TXSTA = new Register(this,"TXSTA",0x98);
    public final Register SPBRG = new Register(this,"SPBRG",0x99);
    public final Register ADRESL = new Register(this,"ADRESL",0x9e);
    public final Register ADCON1 = new Register(this,"ADCON1",0x9f);
    public final Register EEDATA = new Register(this,"EEDATA",0x10c);
    public final Register EEADR = new Register(this,"EEADR",0x10d);
    public final Register EEDATH = new Register(this,"EEDATH",0x10e);
    public final Register EEADRH = new Register(this,"EEADRH",0x10f);
    public final Register EECON1 = new Register(this,"EECON1",0x18c);
    public final Register EECON2 = new Register(this,"EECON2",0x18d);

    public final Bit IRP = new Bit(this,this.STATUS,"IRP",0x7);
    public final Bit RP1 = new Bit(this,this.STATUS,"RP1",0x6);
    public final Bit RP0 = new Bit(this,this.STATUS,"RP0",0x5);
    public final Bit NOT_TO = new Bit(this,this.STATUS,"NOT_TO",0x4);
    public final Bit NOT_PD = new Bit(this,this.STATUS,"NOT_PD",0x3);
    public final Bit Z = new Bit(this,this.STATUS,"Z",0x2);
    public final Bit DC = new Bit(this,this.STATUS,"DC",0x1);
    public final Bit C = new Bit(this,this.STATUS,"C",0x0);
    public final Bit NOT_RBPU = new Bit(this,this.STATUS,"NOT_RBPU",0x7);
    public final Bit INTEDG = new Bit(this,this.STATUS,"INTEDG",0x6);
    public final Bit T0CS = new Bit(this,this.STATUS,"T0CS",0x5);
    public final Bit T0SE = new Bit(this,this.STATUS,"T0SE",0x4);
    public final Bit PSA = new Bit(this,this.STATUS,"PSA",0x3);
    public final Bit PS2 = new Bit(this,this.STATUS,"PS2",0x2);
    public final Bit PS1 = new Bit(this,this.STATUS,"PS1",0x1);
    public final Bit PS0 = new Bit(this,this.STATUS,"PS0",0x0);
    public final Bit GIE = new Bit(this,this.INTCON,"GIE",0x7);
    public final Bit PEIE = new Bit(this,this.INTCON,"PEIE",0x6);
    public final Bit T0IE = new Bit(this,this.INTCON,"T0IE",0x5);
    public final Bit INTE = new Bit(this,this.INTCON,"INTE",0x4);
    public final Bit RBIE = new Bit(this,this.INTCON,"RBIE",0x3);
    public final Bit T0IF = new Bit(this,this.INTCON,"T0IF",0x2);
    public final Bit INTF = new Bit(this,this.INTCON,"INTF",0x1);
    public final Bit RBIF = new Bit(this,this.INTCON,"RBIF",0x0);
    public final Bit ADIE = new Bit(this,this.INTCON,"ADIE",0x6);
    public final Bit RCIE = new Bit(this,this.INTCON,"RCIE",0x5);
    public final Bit TXIE = new Bit(this,this.INTCON,"TXIE",0x4);
    public final Bit CCP1IE = new Bit(this,this.INTCON,"CCP1IE",0x2);
    public final Bit TMR2IE = new Bit(this,this.INTCON,"TMR2IE",0x1);
    public final Bit TMR1IE = new Bit(this,this.INTCON,"TMR1IE",0x0);
    public final Bit ADIF = new Bit(this,this.INTCON,"ADIF",0x6);
    public final Bit RCIF = new Bit(this,this.INTCON,"RCIF",0x5);
    public final Bit TXIF = new Bit(this,this.INTCON,"TXIF",0x4);
    public final Bit CCP1IF = new Bit(this,this.INTCON,"CCP1IF",0x2);
    public final Bit TMR2IF = new Bit(this,this.INTCON,"TMR2IF",0x1);
    public final Bit TMR1IF = new Bit(this,this.INTCON,"TMR1IF",0x0);
    public final Bit EEIE = new Bit(this,this.INTCON,"EEIE",0x4);
    public final Bit EEIF = new Bit(this,this.INTCON,"EEIF",0x4);
    public final Bit NOT_POR = new Bit(this,this.PCON,"NOT_POR",0x1);
    public final Bit NOT_BO = new Bit(this,this.PCON,"NOT_BO",0x0);
    public final Bit NOT_BOR = new Bit(this,this.PCON,"NOT_BOR",0x0);
    public final Bit EEPGD = new Bit(this,this.PCON,"EEPGD",0x7);
    public final Bit WRERR = new Bit(this,this.PCON,"WRERR",0x3);
    public final Bit WREN = new Bit(this,this.PCON,"WREN",0x2);
    public final Bit WR = new Bit(this,this.PCON,"WR",0x1);
    public final Bit RD = new Bit(this,this.PCON,"RD",0x0);
    public final Bit T1CKPS1 = new Bit(this,this.PCON,"T1CKPS1",0x5);
    public final Bit T1CKPS0 = new Bit(this,this.PCON,"T1CKPS0",0x4);
    public final Bit T1OSCEN = new Bit(this,this.PCON,"T1OSCEN",0x3);
    public final Bit NOT_T1SYNC = new Bit(this,this.PCON,"NOT_T1SYNC",0x2);
    public final Bit T1INSYNC = new Bit(this,this.PCON,"T1INSYNC",0x2);
    public final Bit T1SYNC = new Bit(this,this.PCON,"T1SYNC",0x2);
    public final Bit TMR1CS = new Bit(this,this.PCON,"TMR1CS",0x1);
    public final Bit TMR1ON = new Bit(this,this.PCON,"TMR1ON",0x0);
    public final Bit TOUTPS3 = new Bit(this,this.PCON,"TOUTPS3",0x6);
    public final Bit TOUTPS2 = new Bit(this,this.PCON,"TOUTPS2",0x5);
    public final Bit TOUTPS1 = new Bit(this,this.PCON,"TOUTPS1",0x4);
    public final Bit TOUTPS0 = new Bit(this,this.PCON,"TOUTPS0",0x3);
    public final Bit TMR2ON = new Bit(this,this.PCON,"TMR2ON",0x2);
    public final Bit T2CKPS1 = new Bit(this,this.PCON,"T2CKPS1",0x1);
    public final Bit T2CKPS0 = new Bit(this,this.PCON,"T2CKPS0",0x0);
    public final Bit CCP1X = new Bit(this,this.PCON,"CCP1X",0x5);
    public final Bit CCP1Y = new Bit(this,this.PCON,"CCP1Y",0x4);
    public final Bit CCP1M3 = new Bit(this,this.PCON,"CCP1M3",0x3);
    public final Bit CCP1M2 = new Bit(this,this.PCON,"CCP1M2",0x2);
    public final Bit CCP1M1 = new Bit(this,this.PCON,"CCP1M1",0x1);
    public final Bit CCP1M0 = new Bit(this,this.PCON,"CCP1M0",0x0);
    public final Bit CSRC = new Bit(this,this.TXSTA,"CSRC",0x7);
    public final Bit TX9 = new Bit(this,this.TXSTA,"TX9",0x6);
    public final Bit NOT_TX8 = new Bit(this,this.TXSTA,"NOT_TX8",0x6);
    public final Bit TX8_9 = new Bit(this,this.TXSTA,"TX8_9",0x6);
    public final Bit TXEN = new Bit(this,this.TXSTA,"TXEN",0x5);
    public final Bit SYNC = new Bit(this,this.TXSTA,"SYNC",0x4);
    public final Bit BRGH = new Bit(this,this.TXSTA,"BRGH",0x2);
    public final Bit TRMT = new Bit(this,this.TXSTA,"TRMT",0x1);
    public final Bit TX9D = new Bit(this,this.TXSTA,"TX9D",0x0);
    public final Bit TXD8 = new Bit(this,this.TXSTA,"TXD8",0x0);
    public final Bit SPEN = new Bit(this,this.RCSTA,"SPEN",0x7);
    public final Bit RX9 = new Bit(this,this.RCSTA,"RX9",0x6);
    public final Bit RC9 = new Bit(this,this.RCSTA,"RC9",0x6);
    public final Bit NOT_RC8 = new Bit(this,this.RCSTA,"NOT_RC8",0x6);
    public final Bit RC8_9 = new Bit(this,this.RCSTA,"RC8_9",0x6);
    public final Bit SREN = new Bit(this,this.RCSTA,"SREN",0x5);
    public final Bit CREN = new Bit(this,this.RCSTA,"CREN",0x4);
    public final Bit ADDEN = new Bit(this,this.RCSTA,"ADDEN",0x3);
    public final Bit FERR = new Bit(this,this.RCSTA,"FERR",0x2);
    public final Bit OERR = new Bit(this,this.RCSTA,"OERR",0x1);
    public final Bit RX9D = new Bit(this,this.RCSTA,"RX9D",0x0);
    public final Bit RCD8 = new Bit(this,this.RCSTA,"RCD8",0x0);
    public final Bit ADCS1 = new Bit(this,this.RCSTA,"ADCS1",0x7);
    public final Bit ADCS0 = new Bit(this,this.RCSTA,"ADCS0",0x6);
    public final Bit CHS2 = new Bit(this,this.RCSTA,"CHS2",0x5);
    public final Bit CHS1 = new Bit(this,this.RCSTA,"CHS1",0x4);
    public final Bit CHS0 = new Bit(this,this.RCSTA,"CHS0",0x3);
    public final Bit GO = new Bit(this,this.RCSTA,"GO",0x2);
    public final Bit NOT_DONE = new Bit(this,this.RCSTA,"NOT_DONE",0x2);
    public final Bit GO_DONE = new Bit(this,this.RCSTA,"GO_DONE",0x2);
    public final Bit ADON = new Bit(this,this.RCSTA,"ADON",0x0);
    public final Bit ADFM = new Bit(this,this.RCSTA,"ADFM",0x7);
    public final Bit PCFG3 = new Bit(this,this.RCSTA,"PCFG3",0x3);
    public final Bit PCFG2 = new Bit(this,this.RCSTA,"PCFG2",0x2);
    public final Bit PCFG1 = new Bit(this,this.RCSTA,"PCFG1",0x1);
    public final Bit PCFG0 = new Bit(this,this.RCSTA,"PCFG0",0x0);
    public final Bit _CP_ALL = new Bit(this,this.RCSTA,"_CP_ALL",0xfcf);
    public final Bit _CP_OFF = new Bit(this,this.RCSTA,"_CP_OFF",0x3fff);
    public final Bit _DEBUG_ON = new Bit(this,this.RCSTA,"_DEBUG_ON",0x37ff);
    public final Bit _DEBUG_OFF = new Bit(this,this.RCSTA,"_DEBUG_OFF",0x3fff);
    public final Bit _WRT_ENABLE_ON = new Bit(this,this.RCSTA,"_WRT_ENABLE_ON",0x3fff);
    public final Bit _WRT_ENABLE_OFF = new Bit(this,this.RCSTA,"_WRT_ENABLE_OFF",0x3dff);
    public final Bit _CPD_ON = new Bit(this,this.RCSTA,"_CPD_ON",0x3eff);
    public final Bit _CPD_OFF = new Bit(this,this.RCSTA,"_CPD_OFF",0x3fff);
    public final Bit _LVP_ON = new Bit(this,this.RCSTA,"_LVP_ON",0x3fff);
    public final Bit _LVP_OFF = new Bit(this,this.RCSTA,"_LVP_OFF",0x3f7f);
    public final Bit _BODEN_ON = new Bit(this,this.RCSTA,"_BODEN_ON",0x3fff);
    public final Bit _BODEN_OFF = new Bit(this,this.RCSTA,"_BODEN_OFF",0x3fbf);
    public final Bit _PWRTE_OFF = new Bit(this,this.RCSTA,"_PWRTE_OFF",0x3fff);
    public final Bit _PWRTE_ON = new Bit(this,this.RCSTA,"_PWRTE_ON",0x3ff7);
    public final Bit _WDT_ON = new Bit(this,this.RCSTA,"_WDT_ON",0x3fff);
    public final Bit _WDT_OFF = new Bit(this,this.RCSTA,"_WDT_OFF",0x3ffb);
    public final Bit _LP_OSC = new Bit(this,this.RCSTA,"_LP_OSC",0x3ffc);
    public final Bit _XT_OSC = new Bit(this,this.RCSTA,"_XT_OSC",0x3ffd);
    public final Bit _HS_OSC = new Bit(this,this.RCSTA,"_HS_OSC",0x3ffe);
    public final Bit _RC_OSC = new Bit(this,this.RCSTA,"_RC_OSC",0x3fff);


    public P16F870(){
        super();
        this.initPage(0x0,0x7ff);
        this.initConfig(0x2007,0x2007);
        this.initEedata(0x2100,0x213f);
        this.initSfr(0x0,0x1f);
        this.initSfr(0x80,0x9f);
        this.initSfr(0x100,0x10f);
        this.initSfr(0x180,0x18f);
        this.initGpr(0x20,0x6f);
        this.initGpr(0xa0,0xbf);
        this.initGpr(0x70,0x7f);
    }


    public Instruction createInstruction(int addr, int opc){
        Op op = P14.For(opc);
        if (null != op)
            return new Instruction(this,op,addr,opc);
        else
            throw new IllegalArgumentException(String.format("0x%x",addr));
    }
}