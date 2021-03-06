// Generated by sim-pic:port from mach.xtm via hapax2

import lib.mach.Bit;
import lib.mach.Instruction;
import lib.mach.Register;
import lib.mach.Op;
import lib.mach.P14;

/**
 * Generated SimPic Port of P16F818.
 */
public class P16F818
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
    public final Register OSCCON = new Register(this,"OSCCON",0x8f);
    public final Register OSCTUNE = new Register(this,"OSCTUNE",0x90);
    public final Register PR2 = new Register(this,"PR2",0x92);
    public final Register SSPADD = new Register(this,"SSPADD",0x93);
    public final Register SSPSTAT = new Register(this,"SSPSTAT",0x94);
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
    public final Bit GIE = new Bit(this,this.INTCON,"GIE",0x7);
    public final Bit PEIE = new Bit(this,this.INTCON,"PEIE",0x6);
    public final Bit TMR0IE = new Bit(this,this.INTCON,"TMR0IE",0x5);
    public final Bit INTE = new Bit(this,this.INTCON,"INTE",0x4);
    public final Bit RBIE = new Bit(this,this.INTCON,"RBIE",0x3);
    public final Bit TMR0IF = new Bit(this,this.INTCON,"TMR0IF",0x2);
    public final Bit INTF = new Bit(this,this.INTCON,"INTF",0x1);
    public final Bit RBIF = new Bit(this,this.INTCON,"RBIF",0x0);
    public final Bit ADIF = new Bit(this,this.INTCON,"ADIF",0x6);
    public final Bit SSPIF = new Bit(this,this.INTCON,"SSPIF",0x3);
    public final Bit CCP1IF = new Bit(this,this.INTCON,"CCP1IF",0x2);
    public final Bit TMR2IF = new Bit(this,this.INTCON,"TMR2IF",0x1);
    public final Bit TMR1IF = new Bit(this,this.INTCON,"TMR1IF",0x0);
    public final Bit EEIF = new Bit(this,this.INTCON,"EEIF",0x4);
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
    public final Bit CCP1X = new Bit(this,this.SSPCON,"CCP1X",0x5);
    public final Bit CCP1Y = new Bit(this,this.SSPCON,"CCP1Y",0x4);
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
    public final Bit EEIE = new Bit(this,this.SSPCON,"EEIE",0x4);
    public final Bit NOT_POR = new Bit(this,this.PCON,"NOT_POR",0x1);
    public final Bit NOT_BO = new Bit(this,this.PCON,"NOT_BO",0x0);
    public final Bit NOT_BOR = new Bit(this,this.PCON,"NOT_BOR",0x0);
    public final Bit IRCF2 = new Bit(this,this.OSCCON,"IRCF2",0x6);
    public final Bit IRCF1 = new Bit(this,this.OSCCON,"IRCF1",0x5);
    public final Bit IRCF0 = new Bit(this,this.OSCCON,"IRCF0",0x4);
    public final Bit IOFS = new Bit(this,this.OSCCON,"IOFS",0x2);
    public final Bit TUN5 = new Bit(this,this.OSCTUNE,"TUN5",0x5);
    public final Bit TUN4 = new Bit(this,this.OSCTUNE,"TUN4",0x4);
    public final Bit TUN3 = new Bit(this,this.OSCTUNE,"TUN3",0x3);
    public final Bit TUN2 = new Bit(this,this.OSCTUNE,"TUN2",0x2);
    public final Bit TUN1 = new Bit(this,this.OSCTUNE,"TUN1",0x1);
    public final Bit TUN0 = new Bit(this,this.OSCTUNE,"TUN0",0x0);
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
    public final Bit ADFM = new Bit(this,this.SSPSTAT,"ADFM",0x7);
    public final Bit ADCS2 = new Bit(this,this.SSPSTAT,"ADCS2",0x6);
    public final Bit PCFG3 = new Bit(this,this.SSPSTAT,"PCFG3",0x3);
    public final Bit PCFG2 = new Bit(this,this.SSPSTAT,"PCFG2",0x2);
    public final Bit PCFG1 = new Bit(this,this.SSPSTAT,"PCFG1",0x1);
    public final Bit PCFG0 = new Bit(this,this.SSPSTAT,"PCFG0",0x0);
    public final Bit EEPGD = new Bit(this,this.SSPSTAT,"EEPGD",0x7);
    public final Bit FREE = new Bit(this,this.SSPSTAT,"FREE",0x4);
    public final Bit WRERR = new Bit(this,this.SSPSTAT,"WRERR",0x3);
    public final Bit WREN = new Bit(this,this.SSPSTAT,"WREN",0x2);
    public final Bit WR = new Bit(this,this.SSPSTAT,"WR",0x1);
    public final Bit RD = new Bit(this,this.SSPSTAT,"RD",0x0);
    public final Bit _CP_ALL = new Bit(this,this.SSPSTAT,"_CP_ALL",0x1fff);
    public final Bit _CP_OFF = new Bit(this,this.SSPSTAT,"_CP_OFF",0x3fff);
    public final Bit _CCP1_RB2 = new Bit(this,this.SSPSTAT,"_CCP1_RB2",0x3fff);
    public final Bit _CCP1_RB3 = new Bit(this,this.SSPSTAT,"_CCP1_RB3",0x2fff);
    public final Bit _DEBUG_OFF = new Bit(this,this.SSPSTAT,"_DEBUG_OFF",0x3fff);
    public final Bit _DEBUG_ON = new Bit(this,this.SSPSTAT,"_DEBUG_ON",0x37ff);
    public final Bit _WRT_ENABLE_OFF = new Bit(this,this.SSPSTAT,"_WRT_ENABLE_OFF",0x3fff);
    public final Bit _WRT_ENABLE_512 = new Bit(this,this.SSPSTAT,"_WRT_ENABLE_512",0x3dff);
    public final Bit _WRT_ENABLE_1024 = new Bit(this,this.SSPSTAT,"_WRT_ENABLE_1024",0x3bff);
    public final Bit _CPD_ON = new Bit(this,this.SSPSTAT,"_CPD_ON",0x3eff);
    public final Bit _CPD_OFF = new Bit(this,this.SSPSTAT,"_CPD_OFF",0x3fff);
    public final Bit _LVP_ON = new Bit(this,this.SSPSTAT,"_LVP_ON",0x3fff);
    public final Bit _LVP_OFF = new Bit(this,this.SSPSTAT,"_LVP_OFF",0x3f7f);
    public final Bit _BODEN_ON = new Bit(this,this.SSPSTAT,"_BODEN_ON",0x3fff);
    public final Bit _BODEN_OFF = new Bit(this,this.SSPSTAT,"_BODEN_OFF",0x3fbf);
    public final Bit _MCLR_ON = new Bit(this,this.SSPSTAT,"_MCLR_ON",0x3fff);
    public final Bit _MCLR_OFF = new Bit(this,this.SSPSTAT,"_MCLR_OFF",0x3fdf);
    public final Bit _PWRTE_OFF = new Bit(this,this.SSPSTAT,"_PWRTE_OFF",0x3fff);
    public final Bit _PWRTE_ON = new Bit(this,this.SSPSTAT,"_PWRTE_ON",0x3ff7);
    public final Bit _WDT_ON = new Bit(this,this.SSPSTAT,"_WDT_ON",0x3fff);
    public final Bit _WDT_OFF = new Bit(this,this.SSPSTAT,"_WDT_OFF",0x3ffb);
    public final Bit _EXTRC_CLKOUT = new Bit(this,this.SSPSTAT,"_EXTRC_CLKOUT",0x3fff);
    public final Bit _EXTRC_IO = new Bit(this,this.SSPSTAT,"_EXTRC_IO",0x3ffe);
    public final Bit _INTRC_CLKOUT = new Bit(this,this.SSPSTAT,"_INTRC_CLKOUT",0x3ffd);
    public final Bit _INTRC_IO = new Bit(this,this.SSPSTAT,"_INTRC_IO",0x3ffc);
    public final Bit _EXTCLK = new Bit(this,this.SSPSTAT,"_EXTCLK",0x3fef);
    public final Bit _HS_OSC = new Bit(this,this.SSPSTAT,"_HS_OSC",0x3fee);
    public final Bit _XT_OSC = new Bit(this,this.SSPSTAT,"_XT_OSC",0x3fed);
    public final Bit _LP_OSC = new Bit(this,this.SSPSTAT,"_LP_OSC",0x3fec);


    public P16F818(){
        super();
        this.initPage(0x0,0x3ff);
        this.initConfig(0x2007,0x2009);
        this.initEedata(0x2100,0x217f);
        this.initSfr(0x0,0x1f);
        this.initSfr(0x80,0x9f);
        this.initSfr(0x100,0x11f);
        this.initSfr(0x180,0x19f);
        this.initGpr(0xa0,0xbf);
        this.initGpr(0x20,0x3f);
        this.initGpr(0x40,0x7f);
	this.initRegister(this.INDF);
	this.initRegister(this.TMR0);
	this.initRegister(this.PCL);
	this.initRegister(this.STATUS);
	this.initRegister(this.FSR);
	this.initRegister(this.PORTA);
	this.initRegister(this.PORTB);
	this.initRegister(this.PCLATH);
	this.initRegister(this.INTCON);
	this.initRegister(this.PIR1);
	this.initRegister(this.PIR2);
	this.initRegister(this.TMR1L);
	this.initRegister(this.TMR1H);
	this.initRegister(this.T1CON);
	this.initRegister(this.TMR2);
	this.initRegister(this.T2CON);
	this.initRegister(this.SSPBUF);
	this.initRegister(this.SSPCON);
	this.initRegister(this.CCPR1L);
	this.initRegister(this.CCPR1H);
	this.initRegister(this.CCP1CON);
	this.initRegister(this.ADRESH);
	this.initRegister(this.ADCON0);
	this.initRegister(this.OPTION_REG);
	this.initRegister(this.TRISA);
	this.initRegister(this.TRISB);
	this.initRegister(this.PIE1);
	this.initRegister(this.PIE2);
	this.initRegister(this.PCON);
	this.initRegister(this.OSCCON);
	this.initRegister(this.OSCTUNE);
	this.initRegister(this.PR2);
	this.initRegister(this.SSPADD);
	this.initRegister(this.SSPSTAT);
	this.initRegister(this.ADRESL);
	this.initRegister(this.ADCON1);
	this.initRegister(this.EEDATA);
	this.initRegister(this.EEADR);
	this.initRegister(this.EEDATH);
	this.initRegister(this.EEADRH);
	this.initRegister(this.EECON1);
	this.initRegister(this.EECON2);
	this.initBit(this.IRP);
	this.initBit(this.RP1);
	this.initBit(this.RP0);
	this.initBit(this.NOT_TO);
	this.initBit(this.NOT_PD);
	this.initBit(this.Z);
	this.initBit(this.DC);
	this.initBit(this.C);
	this.initBit(this.GIE);
	this.initBit(this.PEIE);
	this.initBit(this.TMR0IE);
	this.initBit(this.INTE);
	this.initBit(this.RBIE);
	this.initBit(this.TMR0IF);
	this.initBit(this.INTF);
	this.initBit(this.RBIF);
	this.initBit(this.ADIF);
	this.initBit(this.SSPIF);
	this.initBit(this.CCP1IF);
	this.initBit(this.TMR2IF);
	this.initBit(this.TMR1IF);
	this.initBit(this.EEIF);
	this.initBit(this.T1CKPS1);
	this.initBit(this.T1CKPS0);
	this.initBit(this.T1OSCEN);
	this.initBit(this.NOT_T1SYNC);
	this.initBit(this.T1INSYNC);
	this.initBit(this.TMR1CS);
	this.initBit(this.TMR1ON);
	this.initBit(this.TOUTPS3);
	this.initBit(this.TOUTPS2);
	this.initBit(this.TOUTPS1);
	this.initBit(this.TOUTPS0);
	this.initBit(this.TMR2ON);
	this.initBit(this.T2CKPS1);
	this.initBit(this.T2CKPS0);
	this.initBit(this.WCOL);
	this.initBit(this.SSPOV);
	this.initBit(this.SSPEN);
	this.initBit(this.CKP);
	this.initBit(this.SSPM3);
	this.initBit(this.SSPM2);
	this.initBit(this.SSPM1);
	this.initBit(this.SSPM0);
	this.initBit(this.CCP1X);
	this.initBit(this.CCP1Y);
	this.initBit(this.CCP1M3);
	this.initBit(this.CCP1M2);
	this.initBit(this.CCP1M1);
	this.initBit(this.CCP1M0);
	this.initBit(this.ADCS1);
	this.initBit(this.ADCS0);
	this.initBit(this.CHS2);
	this.initBit(this.CHS1);
	this.initBit(this.CHS0);
	this.initBit(this.GO);
	this.initBit(this.NOT_DONE);
	this.initBit(this.GO_DONE);
	this.initBit(this.ADON);
	this.initBit(this.NOT_RBPU);
	this.initBit(this.INTEDG);
	this.initBit(this.T0CS);
	this.initBit(this.T0SE);
	this.initBit(this.PSA);
	this.initBit(this.PS2);
	this.initBit(this.PS1);
	this.initBit(this.PS0);
	this.initBit(this.ADIE);
	this.initBit(this.SSPIE);
	this.initBit(this.CCP1IE);
	this.initBit(this.TMR2IE);
	this.initBit(this.TMR1IE);
	this.initBit(this.EEIE);
	this.initBit(this.NOT_POR);
	this.initBit(this.NOT_BO);
	this.initBit(this.NOT_BOR);
	this.initBit(this.IRCF2);
	this.initBit(this.IRCF1);
	this.initBit(this.IRCF0);
	this.initBit(this.IOFS);
	this.initBit(this.TUN5);
	this.initBit(this.TUN4);
	this.initBit(this.TUN3);
	this.initBit(this.TUN2);
	this.initBit(this.TUN1);
	this.initBit(this.TUN0);
	this.initBit(this.SMP);
	this.initBit(this.CKE);
	this.initBit(this.D);
	this.initBit(this.I2C_DATA);
	this.initBit(this.NOT_A);
	this.initBit(this.NOT_ADDRESS);
	this.initBit(this.D_A);
	this.initBit(this.DATA_ADDRESS);
	this.initBit(this.P);
	this.initBit(this.I2C_STOP);
	this.initBit(this.S);
	this.initBit(this.I2C_START);
	this.initBit(this.R);
	this.initBit(this.I2C_READ);
	this.initBit(this.NOT_W);
	this.initBit(this.NOT_WRITE);
	this.initBit(this.R_W);
	this.initBit(this.READ_WRITE);
	this.initBit(this.UA);
	this.initBit(this.BF);
	this.initBit(this.ADFM);
	this.initBit(this.ADCS2);
	this.initBit(this.PCFG3);
	this.initBit(this.PCFG2);
	this.initBit(this.PCFG1);
	this.initBit(this.PCFG0);
	this.initBit(this.EEPGD);
	this.initBit(this.FREE);
	this.initBit(this.WRERR);
	this.initBit(this.WREN);
	this.initBit(this.WR);
	this.initBit(this.RD);
	this.initBit(this._CP_ALL);
	this.initBit(this._CP_OFF);
	this.initBit(this._CCP1_RB2);
	this.initBit(this._CCP1_RB3);
	this.initBit(this._DEBUG_OFF);
	this.initBit(this._DEBUG_ON);
	this.initBit(this._WRT_ENABLE_OFF);
	this.initBit(this._WRT_ENABLE_512);
	this.initBit(this._WRT_ENABLE_1024);
	this.initBit(this._CPD_ON);
	this.initBit(this._CPD_OFF);
	this.initBit(this._LVP_ON);
	this.initBit(this._LVP_OFF);
	this.initBit(this._BODEN_ON);
	this.initBit(this._BODEN_OFF);
	this.initBit(this._MCLR_ON);
	this.initBit(this._MCLR_OFF);
	this.initBit(this._PWRTE_OFF);
	this.initBit(this._PWRTE_ON);
	this.initBit(this._WDT_ON);
	this.initBit(this._WDT_OFF);
	this.initBit(this._EXTRC_CLKOUT);
	this.initBit(this._EXTRC_IO);
	this.initBit(this._INTRC_CLKOUT);
	this.initBit(this._INTRC_IO);
	this.initBit(this._EXTCLK);
	this.initBit(this._HS_OSC);
	this.initBit(this._XT_OSC);
	this.initBit(this._LP_OSC);
    }


    public Instruction createInstruction(int addr, int opc){
        Op op = P14.For(opc);
        if (null != op)
            return new Instruction(this,op,addr,opc);
        else
            throw new IllegalArgumentException(String.format("Opcode 0x%x not found (arch P14, page address 0x%x)",opc,addr));
    }
}
