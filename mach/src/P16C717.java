// Generated by sim-pic:port from mach.xtm via hapax2

import lib.mach.Bit;
import lib.mach.Instruction;
import lib.mach.Register;
import lib.mach.Op;
import lib.mach.P14;

/**
 * Generated SimPic Port of P16C717.
 */
public class P16C717
    extends lib.mach.AbstractMachine
{

    public final Register INDF = new Register(this,"INDF",0x0);
    public final Register TMR0 = new Register(this,"TMR0",0x1);
    public final Register PCL = new Register(this,"PCL",0x2);
    public final Register STATUS = new Register(this,"STATUS",0x3);
    public final Register FSR = new Register(this,"FSR",0x4);
    public final Register PORTA = new Register(this,"PORTA",0x5);
    public final Register PORTB = new Register(this,"PORTB",0x6);
    public final Register PCLATH = new Register(this,"PCLATH",0xa);
    public final Register INTCON = new Register(this,"INTCON",0xb);
    public final Register PIR1 = new Register(this,"PIR1",0xc);
    public final Register PIR2 = new Register(this,"PIR2",0xd);
    public final Register TMR1L = new Register(this,"TMR1L",0xe);
    public final Register TMR1H = new Register(this,"TMR1H",0xf);
    public final Register T1CON = new Register(this,"T1CON",0x10);
    public final Register TMR2 = new Register(this,"TMR2",0x11);
    public final Register T2CON = new Register(this,"T2CON",0x12);
    public final Register SSPBUF = new Register(this,"SSPBUF",0x13);
    public final Register SSPCON = new Register(this,"SSPCON",0x14);
    public final Register CCPR1L = new Register(this,"CCPR1L",0x15);
    public final Register CCPR1H = new Register(this,"CCPR1H",0x16);
    public final Register CCP1CON = new Register(this,"CCP1CON",0x17);
    public final Register ADRESH = new Register(this,"ADRESH",0x1e);
    public final Register ADCON0 = new Register(this,"ADCON0",0x1f);
    public final Register OPTION_REG = new Register(this,"OPTION_REG",0x81);
    public final Register TRISA = new Register(this,"TRISA",0x85);
    public final Register TRISB = new Register(this,"TRISB",0x86);
    public final Register PIE1 = new Register(this,"PIE1",0x8c);
    public final Register PIE2 = new Register(this,"PIE2",0x8d);
    public final Register PCON = new Register(this,"PCON",0x8e);
    public final Register SSPCON2 = new Register(this,"SSPCON2",0x91);
    public final Register PR2 = new Register(this,"PR2",0x92);
    public final Register SSPADD = new Register(this,"SSPADD",0x93);
    public final Register SSPSTAT = new Register(this,"SSPSTAT",0x94);
    public final Register WPUB = new Register(this,"WPUB",0x95);
    public final Register IOCB = new Register(this,"IOCB",0x96);
    public final Register P1DEL = new Register(this,"P1DEL",0x97);
    public final Register REFCON = new Register(this,"REFCON",0x9b);
    public final Register LVDCON = new Register(this,"LVDCON",0x9c);
    public final Register ANSEL = new Register(this,"ANSEL",0x9d);
    public final Register ADRESL = new Register(this,"ADRESL",0x9e);
    public final Register ADCON1 = new Register(this,"ADCON1",0x9f);
    public final Register PMDATL = new Register(this,"PMDATL",0x10c);
    public final Register PMADRL = new Register(this,"PMADRL",0x10d);
    public final Register PMDATH = new Register(this,"PMDATH",0x10e);
    public final Register PMADRH = new Register(this,"PMADRH",0x10f);
    public final Register PMCON1 = new Register(this,"PMCON1",0x18c);

    public final Bit IRP = new Bit(this,this.STATUS,"IRP",0x7);
    public final Bit RP1 = new Bit(this,this.STATUS,"RP1",0x6);
    public final Bit RP0 = new Bit(this,this.STATUS,"RP0",0x5);
    public final Bit NOT_TO = new Bit(this,this.STATUS,"NOT_TO",0x4);
    public final Bit NOT_PD = new Bit(this,this.STATUS,"NOT_PD",0x3);
    public final Bit Z = new Bit(this,this.STATUS,"Z",0x2);
    public final Bit DC = new Bit(this,this.STATUS,"DC",0x1);
    public final Bit C = new Bit(this,this.STATUS,"C",0x0);
    public final Bit GIE = new Bit(this,this.INTCON,"GIE",0x7);
    public final Bit PEIE = new Bit(this,this.INTCON,"PEIE",0x6);
    public final Bit T0IE = new Bit(this,this.INTCON,"T0IE",0x5);
    public final Bit INTE = new Bit(this,this.INTCON,"INTE",0x4);
    public final Bit RBIE = new Bit(this,this.INTCON,"RBIE",0x3);
    public final Bit T0IF = new Bit(this,this.INTCON,"T0IF",0x2);
    public final Bit INTF = new Bit(this,this.INTCON,"INTF",0x1);
    public final Bit RBIF = new Bit(this,this.INTCON,"RBIF",0x0);
    public final Bit ADIF = new Bit(this,this.INTCON,"ADIF",0x6);
    public final Bit SSPIF = new Bit(this,this.INTCON,"SSPIF",0x3);
    public final Bit CCP1IF = new Bit(this,this.INTCON,"CCP1IF",0x2);
    public final Bit TMR2IF = new Bit(this,this.INTCON,"TMR2IF",0x1);
    public final Bit TMR1IF = new Bit(this,this.INTCON,"TMR1IF",0x0);
    public final Bit LVDIF = new Bit(this,this.INTCON,"LVDIF",0x7);
    public final Bit BCLIF = new Bit(this,this.INTCON,"BCLIF",0x3);
    public final Bit T1CKPS1 = new Bit(this,this.INTCON,"T1CKPS1",0x5);
    public final Bit T1CKPS0 = new Bit(this,this.INTCON,"T1CKPS0",0x4);
    public final Bit T1OSCEN = new Bit(this,this.INTCON,"T1OSCEN",0x3);
    public final Bit NOT_T1SYNC = new Bit(this,this.INTCON,"NOT_T1SYNC",0x2);
    public final Bit T1INSYNC = new Bit(this,this.INTCON,"T1INSYNC",0x2);
    public final Bit TMR1CS = new Bit(this,this.INTCON,"TMR1CS",0x1);
    public final Bit TMR1ON = new Bit(this,this.INTCON,"TMR1ON",0x0);
    public final Bit TOUTPS3 = new Bit(this,this.INTCON,"TOUTPS3",0x6);
    public final Bit TOUTPS2 = new Bit(this,this.INTCON,"TOUTPS2",0x5);
    public final Bit TOUTPS1 = new Bit(this,this.INTCON,"TOUTPS1",0x4);
    public final Bit TOUTPS0 = new Bit(this,this.INTCON,"TOUTPS0",0x3);
    public final Bit TMR2ON = new Bit(this,this.INTCON,"TMR2ON",0x2);
    public final Bit T2CKPS1 = new Bit(this,this.INTCON,"T2CKPS1",0x1);
    public final Bit T2CKPS0 = new Bit(this,this.INTCON,"T2CKPS0",0x0);
    public final Bit WCOL = new Bit(this,this.SSPCON,"WCOL",0x7);
    public final Bit SSPOV = new Bit(this,this.SSPCON,"SSPOV",0x6);
    public final Bit SSPEN = new Bit(this,this.SSPCON,"SSPEN",0x5);
    public final Bit CKP = new Bit(this,this.SSPCON,"CKP",0x4);
    public final Bit SSPM3 = new Bit(this,this.SSPCON,"SSPM3",0x3);
    public final Bit SSPM2 = new Bit(this,this.SSPCON,"SSPM2",0x2);
    public final Bit SSPM1 = new Bit(this,this.SSPCON,"SSPM1",0x1);
    public final Bit SSPM0 = new Bit(this,this.SSPCON,"SSPM0",0x0);
    public final Bit PWM1M1 = new Bit(this,this.SSPCON,"PWM1M1",0x7);
    public final Bit PWM1M0 = new Bit(this,this.SSPCON,"PWM1M0",0x6);
    public final Bit DC1B1 = new Bit(this,this.SSPCON,"DC1B1",0x5);
    public final Bit DC1B0 = new Bit(this,this.SSPCON,"DC1B0",0x4);
    public final Bit CCP1M3 = new Bit(this,this.SSPCON,"CCP1M3",0x3);
    public final Bit CCP1M2 = new Bit(this,this.SSPCON,"CCP1M2",0x2);
    public final Bit CCP1M1 = new Bit(this,this.SSPCON,"CCP1M1",0x1);
    public final Bit CCP1M0 = new Bit(this,this.SSPCON,"CCP1M0",0x0);
    public final Bit ADCS1 = new Bit(this,this.SSPCON,"ADCS1",0x7);
    public final Bit ADCS0 = new Bit(this,this.SSPCON,"ADCS0",0x6);
    public final Bit CHS2 = new Bit(this,this.SSPCON,"CHS2",0x5);
    public final Bit CHS1 = new Bit(this,this.SSPCON,"CHS1",0x4);
    public final Bit CHS0 = new Bit(this,this.SSPCON,"CHS0",0x3);
    public final Bit GO = new Bit(this,this.SSPCON,"GO",0x2);
    public final Bit NOT_DONE = new Bit(this,this.SSPCON,"NOT_DONE",0x2);
    public final Bit GO_DONE = new Bit(this,this.SSPCON,"GO_DONE",0x2);
    public final Bit CHS3 = new Bit(this,this.SSPCON,"CHS3",0x1);
    public final Bit ADON = new Bit(this,this.SSPCON,"ADON",0x0);
    public final Bit NOT_RBPU = new Bit(this,this.SSPCON,"NOT_RBPU",0x7);
    public final Bit INTEDG = new Bit(this,this.SSPCON,"INTEDG",0x6);
    public final Bit T0CS = new Bit(this,this.SSPCON,"T0CS",0x5);
    public final Bit T0SE = new Bit(this,this.SSPCON,"T0SE",0x4);
    public final Bit PSA = new Bit(this,this.SSPCON,"PSA",0x3);
    public final Bit PS2 = new Bit(this,this.SSPCON,"PS2",0x2);
    public final Bit PS1 = new Bit(this,this.SSPCON,"PS1",0x1);
    public final Bit PS0 = new Bit(this,this.SSPCON,"PS0",0x0);
    public final Bit ADIE = new Bit(this,this.SSPCON,"ADIE",0x6);
    public final Bit SSPIE = new Bit(this,this.SSPCON,"SSPIE",0x3);
    public final Bit CCP1IE = new Bit(this,this.SSPCON,"CCP1IE",0x2);
    public final Bit TMR2IE = new Bit(this,this.SSPCON,"TMR2IE",0x1);
    public final Bit TMR1IE = new Bit(this,this.SSPCON,"TMR1IE",0x0);
    public final Bit LVDIE = new Bit(this,this.SSPCON,"LVDIE",0x7);
    public final Bit BCLIE = new Bit(this,this.SSPCON,"BCLIE",0x3);
    public final Bit OSCF = new Bit(this,this.PCON,"OSCF",0x3);
    public final Bit NOT_POR = new Bit(this,this.PCON,"NOT_POR",0x1);
    public final Bit NOT_BO = new Bit(this,this.PCON,"NOT_BO",0x0);
    public final Bit NOT_BOR = new Bit(this,this.PCON,"NOT_BOR",0x0);
    public final Bit GCEN = new Bit(this,this.PCON,"GCEN",0x7);
    public final Bit ACKSTAT = new Bit(this,this.PCON,"ACKSTAT",0x6);
    public final Bit ACKDT = new Bit(this,this.PCON,"ACKDT",0x5);
    public final Bit ACKEN = new Bit(this,this.PCON,"ACKEN",0x4);
    public final Bit RCEN = new Bit(this,this.PCON,"RCEN",0x3);
    public final Bit PEN = new Bit(this,this.PCON,"PEN",0x2);
    public final Bit RSEN = new Bit(this,this.PCON,"RSEN",0x1);
    public final Bit SEN = new Bit(this,this.PCON,"SEN",0x0);
    public final Bit SMP = new Bit(this,this.SSPSTAT,"SMP",0x7);
    public final Bit CKE = new Bit(this,this.SSPSTAT,"CKE",0x6);
    public final Bit D = new Bit(this,this.SSPSTAT,"D",0x5);
    public final Bit I2C_DATA = new Bit(this,this.SSPSTAT,"I2C_DATA",0x5);
    public final Bit NOT_A = new Bit(this,this.SSPSTAT,"NOT_A",0x5);
    public final Bit NOT_ADDRESS = new Bit(this,this.SSPSTAT,"NOT_ADDRESS",0x5);
    public final Bit D_A = new Bit(this,this.SSPSTAT,"D_A",0x5);
    public final Bit DATA_ADDRESS = new Bit(this,this.SSPSTAT,"DATA_ADDRESS",0x5);
    public final Bit P = new Bit(this,this.SSPSTAT,"P",0x4);
    public final Bit I2C_STOP = new Bit(this,this.SSPSTAT,"I2C_STOP",0x4);
    public final Bit S = new Bit(this,this.SSPSTAT,"S",0x3);
    public final Bit I2C_START = new Bit(this,this.SSPSTAT,"I2C_START",0x3);
    public final Bit R = new Bit(this,this.SSPSTAT,"R",0x2);
    public final Bit I2C_READ = new Bit(this,this.SSPSTAT,"I2C_READ",0x2);
    public final Bit NOT_W = new Bit(this,this.SSPSTAT,"NOT_W",0x2);
    public final Bit NOT_WRITE = new Bit(this,this.SSPSTAT,"NOT_WRITE",0x2);
    public final Bit R_W = new Bit(this,this.SSPSTAT,"R_W",0x2);
    public final Bit READ_WRITE = new Bit(this,this.SSPSTAT,"READ_WRITE",0x2);
    public final Bit UA = new Bit(this,this.SSPSTAT,"UA",0x1);
    public final Bit BF = new Bit(this,this.SSPSTAT,"BF",0x0);
    public final Bit VRHEN = new Bit(this,this.REFCON,"VRHEN",0x7);
    public final Bit VRLEN = new Bit(this,this.REFCON,"VRLEN",0x6);
    public final Bit VRHOEN = new Bit(this,this.REFCON,"VRHOEN",0x5);
    public final Bit VRLOEN = new Bit(this,this.REFCON,"VRLOEN",0x4);
    public final Bit BGST = new Bit(this,this.LVDCON,"BGST",0x5);
    public final Bit LVDEN = new Bit(this,this.LVDCON,"LVDEN",0x4);
    public final Bit LV3 = new Bit(this,this.LVDCON,"LV3",0x3);
    public final Bit LV2 = new Bit(this,this.LVDCON,"LV2",0x2);
    public final Bit LV1 = new Bit(this,this.LVDCON,"LV1",0x1);
    public final Bit LV0 = new Bit(this,this.LVDCON,"LV0",0x0);
    public final Bit ADFM = new Bit(this,this.LVDCON,"ADFM",0x7);
    public final Bit VCFG2 = new Bit(this,this.LVDCON,"VCFG2",0x6);
    public final Bit VCFG1 = new Bit(this,this.LVDCON,"VCFG1",0x5);
    public final Bit VCFG0 = new Bit(this,this.LVDCON,"VCFG0",0x4);
    public final Bit RD = new Bit(this,this.LVDCON,"RD",0x0);
    public final Bit _BODEN_ON = new Bit(this,this.LVDCON,"_BODEN_ON",0x3fff);
    public final Bit _BODEN_OFF = new Bit(this,this.LVDCON,"_BODEN_OFF",0x3fbf);
    public final Bit _CP_ALL = new Bit(this,this.LVDCON,"_CP_ALL",0xcff);
    public final Bit _CP_OFF = new Bit(this,this.LVDCON,"_CP_OFF",0x3fff);
    public final Bit _VBOR_25 = new Bit(this,this.LVDCON,"_VBOR_25",0x3fff);
    public final Bit _VBOR_27 = new Bit(this,this.LVDCON,"_VBOR_27",0x3bff);
    public final Bit _VBOR_42 = new Bit(this,this.LVDCON,"_VBOR_42",0x37ff);
    public final Bit _VBOR_45 = new Bit(this,this.LVDCON,"_VBOR_45",0x33ff);
    public final Bit _PWRTE_OFF = new Bit(this,this.LVDCON,"_PWRTE_OFF",0x3fff);
    public final Bit _PWRTE_ON = new Bit(this,this.LVDCON,"_PWRTE_ON",0x3fef);
    public final Bit _MCLRE_OFF = new Bit(this,this.LVDCON,"_MCLRE_OFF",0x3fdf);
    public final Bit _MCLRE_ON = new Bit(this,this.LVDCON,"_MCLRE_ON",0x3fff);
    public final Bit _WDT_ON = new Bit(this,this.LVDCON,"_WDT_ON",0x3fff);
    public final Bit _WDT_OFF = new Bit(this,this.LVDCON,"_WDT_OFF",0x3ff7);
    public final Bit _ER_OSC_CLKOUT = new Bit(this,this.LVDCON,"_ER_OSC_CLKOUT",0x3fff);
    public final Bit _ER_OSC_NOCLKOUT = new Bit(this,this.LVDCON,"_ER_OSC_NOCLKOUT",0x3ffe);
    public final Bit _INTRC_OSC_CLKOUT = new Bit(this,this.LVDCON,"_INTRC_OSC_CLKOUT",0x3ffd);
    public final Bit _INTRC_OSC_NOCLKOUT = new Bit(this,this.LVDCON,"_INTRC_OSC_NOCLKOUT",0x3ffc);
    public final Bit _EXTCLK_OSC = new Bit(this,this.LVDCON,"_EXTCLK_OSC",0x3ffb);
    public final Bit _HS_OSC = new Bit(this,this.LVDCON,"_HS_OSC",0x3ffa);
    public final Bit _XT_OSC = new Bit(this,this.LVDCON,"_XT_OSC",0x3ff9);
    public final Bit _LP_OSC = new Bit(this,this.LVDCON,"_LP_OSC",0x3ff8);


    public P16C717(){
        super();
        this.initPage(0x0,0x7ff);
        this.initConfig(0x2007,0x2007);
        this.initSfr(0x0,0x1f);
        this.initSfr(0x80,0x9f);
        this.initSfr(0x100,0x10f);
        this.initSfr(0x180,0x18f);
        this.initGpr(0x20,0x6f);
        this.initGpr(0xa0,0xef);
        this.initGpr(0x120,0x16f);
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
