// Generated by sim-pic:port from mach.xtm via hapax2

import lib.mach.Bit;
import lib.mach.Instruction;
import lib.mach.Register;
import lib.mach.Op;
import lib.mach.P14;

/**
 * Generated SimPic Port of P16F767.
 */
public class P16F767
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
    public final Register PORTE = new Register(this,"PORTE",0x9);
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
    public final Register RCSTA = new Register(this,"RCSTA",0x18);
    public final Register TXREG = new Register(this,"TXREG",0x19);
    public final Register RCREG = new Register(this,"RCREG",0x1a);
    public final Register CCPR2L = new Register(this,"CCPR2L",0x1b);
    public final Register CCPR2H = new Register(this,"CCPR2H",0x1c);
    public final Register CCP2CON = new Register(this,"CCP2CON",0x1d);
    public final Register ADRESH = new Register(this,"ADRESH",0x1e);
    public final Register ADCON0 = new Register(this,"ADCON0",0x1f);
    public final Register OPTION_REG = new Register(this,"OPTION_REG",0x81);
    public final Register TRISA = new Register(this,"TRISA",0x85);
    public final Register TRISB = new Register(this,"TRISB",0x86);
    public final Register TRISC = new Register(this,"TRISC",0x87);
    public final Register TRISE = new Register(this,"TRISE",0x89);
    public final Register PIE1 = new Register(this,"PIE1",0x8c);
    public final Register PIE2 = new Register(this,"PIE2",0x8d);
    public final Register PCON = new Register(this,"PCON",0x8e);
    public final Register OSCCON = new Register(this,"OSCCON",0x8f);
    public final Register OSCTUNE = new Register(this,"OSCTUNE",0x90);
    public final Register SSPCON2 = new Register(this,"SSPCON2",0x91);
    public final Register PR2 = new Register(this,"PR2",0x92);
    public final Register SSPADD = new Register(this,"SSPADD",0x93);
    public final Register SSPSTAT = new Register(this,"SSPSTAT",0x94);
    public final Register CCPR3L = new Register(this,"CCPR3L",0x95);
    public final Register CCPR3H = new Register(this,"CCPR3H",0x96);
    public final Register CCP3CON = new Register(this,"CCP3CON",0x97);
    public final Register TXSTA = new Register(this,"TXSTA",0x98);
    public final Register SPBRG = new Register(this,"SPBRG",0x99);
    public final Register ADCON2 = new Register(this,"ADCON2",0x9b);
    public final Register CMCON = new Register(this,"CMCON",0x9c);
    public final Register CVRCON = new Register(this,"CVRCON",0x9d);
    public final Register ADRESL = new Register(this,"ADRESL",0x9e);
    public final Register ADCON1 = new Register(this,"ADCON1",0x9f);
    public final Register WDTCON = new Register(this,"WDTCON",0x105);
    public final Register LVDCON = new Register(this,"LVDCON",0x109);
    public final Register PMDATA = new Register(this,"PMDATA",0x10c);
    public final Register PMADR = new Register(this,"PMADR",0x10d);
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
    public final Bit TMR0IE = new Bit(this,this.INTCON,"TMR0IE",0x5);
    public final Bit INTE = new Bit(this,this.INTCON,"INTE",0x4);
    public final Bit INT0IE = new Bit(this,this.INTCON,"INT0IE",0x4);
    public final Bit RBIE = new Bit(this,this.INTCON,"RBIE",0x3);
    public final Bit T0IF = new Bit(this,this.INTCON,"T0IF",0x2);
    public final Bit TMR0IF = new Bit(this,this.INTCON,"TMR0IF",0x2);
    public final Bit INTF = new Bit(this,this.INTCON,"INTF",0x1);
    public final Bit INT0IF = new Bit(this,this.INTCON,"INT0IF",0x1);
    public final Bit RBIF = new Bit(this,this.INTCON,"RBIF",0x0);
    public final Bit PSPIF = new Bit(this,this.INTCON,"PSPIF",0x7);
    public final Bit ADIF = new Bit(this,this.INTCON,"ADIF",0x6);
    public final Bit RCIF = new Bit(this,this.INTCON,"RCIF",0x5);
    public final Bit TXIF = new Bit(this,this.INTCON,"TXIF",0x4);
    public final Bit SSPIF = new Bit(this,this.INTCON,"SSPIF",0x3);
    public final Bit CCP1IF = new Bit(this,this.INTCON,"CCP1IF",0x2);
    public final Bit TMR2IF = new Bit(this,this.INTCON,"TMR2IF",0x1);
    public final Bit TMR1IF = new Bit(this,this.INTCON,"TMR1IF",0x0);
    public final Bit OSFIF = new Bit(this,this.INTCON,"OSFIF",0x7);
    public final Bit CMIF = new Bit(this,this.INTCON,"CMIF",0x6);
    public final Bit LVDIF = new Bit(this,this.INTCON,"LVDIF",0x5);
    public final Bit BCLIF = new Bit(this,this.INTCON,"BCLIF",0x3);
    public final Bit CCP3IF = new Bit(this,this.INTCON,"CCP3IF",0x1);
    public final Bit CCP2IF = new Bit(this,this.INTCON,"CCP2IF",0x0);
    public final Bit T1RUN = new Bit(this,this.INTCON,"T1RUN",0x6);
    public final Bit T1CKPS1 = new Bit(this,this.INTCON,"T1CKPS1",0x5);
    public final Bit T1CKPS0 = new Bit(this,this.INTCON,"T1CKPS0",0x4);
    public final Bit T1OSCEN = new Bit(this,this.INTCON,"T1OSCEN",0x3);
    public final Bit NOT_T1SYNC = new Bit(this,this.INTCON,"NOT_T1SYNC",0x2);
    public final Bit T1INSYNC = new Bit(this,this.INTCON,"T1INSYNC",0x2);
    public final Bit T1SYNC = new Bit(this,this.INTCON,"T1SYNC",0x2);
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
    public final Bit CCP2X = new Bit(this,this.RCSTA,"CCP2X",0x5);
    public final Bit CCP2Y = new Bit(this,this.RCSTA,"CCP2Y",0x4);
    public final Bit CCP2M3 = new Bit(this,this.RCSTA,"CCP2M3",0x3);
    public final Bit CCP2M2 = new Bit(this,this.RCSTA,"CCP2M2",0x2);
    public final Bit CCP2M1 = new Bit(this,this.RCSTA,"CCP2M1",0x1);
    public final Bit CCP2M0 = new Bit(this,this.RCSTA,"CCP2M0",0x0);
    public final Bit ADCS1 = new Bit(this,this.RCSTA,"ADCS1",0x7);
    public final Bit ADCS0 = new Bit(this,this.RCSTA,"ADCS0",0x6);
    public final Bit CHS2 = new Bit(this,this.RCSTA,"CHS2",0x5);
    public final Bit CHS1 = new Bit(this,this.RCSTA,"CHS1",0x4);
    public final Bit CHS0 = new Bit(this,this.RCSTA,"CHS0",0x3);
    public final Bit GO = new Bit(this,this.RCSTA,"GO",0x2);
    public final Bit NOT_DONE = new Bit(this,this.RCSTA,"NOT_DONE",0x2);
    public final Bit GO_DONE = new Bit(this,this.RCSTA,"GO_DONE",0x2);
    public final Bit CHS3 = new Bit(this,this.RCSTA,"CHS3",0x1);
    public final Bit ADON = new Bit(this,this.RCSTA,"ADON",0x0);
    public final Bit NOT_RBPU = new Bit(this,this.RCSTA,"NOT_RBPU",0x7);
    public final Bit INTEDG = new Bit(this,this.RCSTA,"INTEDG",0x6);
    public final Bit T0CS = new Bit(this,this.RCSTA,"T0CS",0x5);
    public final Bit T0SE = new Bit(this,this.RCSTA,"T0SE",0x4);
    public final Bit PSA = new Bit(this,this.RCSTA,"PSA",0x3);
    public final Bit PS2 = new Bit(this,this.RCSTA,"PS2",0x2);
    public final Bit PS1 = new Bit(this,this.RCSTA,"PS1",0x1);
    public final Bit PS0 = new Bit(this,this.RCSTA,"PS0",0x0);
    public final Bit IBF = new Bit(this,this.TRISE,"IBF",0x7);
    public final Bit OBF = new Bit(this,this.TRISE,"OBF",0x6);
    public final Bit IBOV = new Bit(this,this.TRISE,"IBOV",0x5);
    public final Bit PSPMODE = new Bit(this,this.TRISE,"PSPMODE",0x4);
    public final Bit TRISE3 = new Bit(this,this.TRISE,"TRISE3",0x3);
    public final Bit TRISE2 = new Bit(this,this.TRISE,"TRISE2",0x2);
    public final Bit TRISE1 = new Bit(this,this.TRISE,"TRISE1",0x1);
    public final Bit TRISE0 = new Bit(this,this.TRISE,"TRISE0",0x0);
    public final Bit PSPIE = new Bit(this,this.TRISE,"PSPIE",0x7);
    public final Bit ADIE = new Bit(this,this.TRISE,"ADIE",0x6);
    public final Bit RCIE = new Bit(this,this.TRISE,"RCIE",0x5);
    public final Bit TXIE = new Bit(this,this.TRISE,"TXIE",0x4);
    public final Bit SSPIE = new Bit(this,this.TRISE,"SSPIE",0x3);
    public final Bit CCP1IE = new Bit(this,this.TRISE,"CCP1IE",0x2);
    public final Bit TMR2IE = new Bit(this,this.TRISE,"TMR2IE",0x1);
    public final Bit TMR1IE = new Bit(this,this.TRISE,"TMR1IE",0x0);
    public final Bit OSFIE = new Bit(this,this.TRISE,"OSFIE",0x7);
    public final Bit CMIE = new Bit(this,this.TRISE,"CMIE",0x6);
    public final Bit LVDIE = new Bit(this,this.TRISE,"LVDIE",0x5);
    public final Bit BCLIE = new Bit(this,this.TRISE,"BCLIE",0x3);
    public final Bit CCP3IE = new Bit(this,this.TRISE,"CCP3IE",0x1);
    public final Bit CCP2IE = new Bit(this,this.TRISE,"CCP2IE",0x0);
    public final Bit SBOREN = new Bit(this,this.PCON,"SBOREN",0x2);
    public final Bit NOT_POR = new Bit(this,this.PCON,"NOT_POR",0x1);
    public final Bit NOT_BO = new Bit(this,this.PCON,"NOT_BO",0x0);
    public final Bit NOT_BOR = new Bit(this,this.PCON,"NOT_BOR",0x0);
    public final Bit IRCF2 = new Bit(this,this.OSCCON,"IRCF2",0x6);
    public final Bit IRCF1 = new Bit(this,this.OSCCON,"IRCF1",0x5);
    public final Bit IRCF0 = new Bit(this,this.OSCCON,"IRCF0",0x4);
    public final Bit OSTS = new Bit(this,this.OSCCON,"OSTS",0x3);
    public final Bit IOFS = new Bit(this,this.OSCCON,"IOFS",0x2);
    public final Bit SCS1 = new Bit(this,this.OSCCON,"SCS1",0x1);
    public final Bit SCS0 = new Bit(this,this.OSCCON,"SCS0",0x0);
    public final Bit TUN5 = new Bit(this,this.OSCTUNE,"TUN5",0x5);
    public final Bit TUN4 = new Bit(this,this.OSCTUNE,"TUN4",0x4);
    public final Bit TUN3 = new Bit(this,this.OSCTUNE,"TUN3",0x3);
    public final Bit TUN2 = new Bit(this,this.OSCTUNE,"TUN2",0x2);
    public final Bit TUN1 = new Bit(this,this.OSCTUNE,"TUN1",0x1);
    public final Bit TUN0 = new Bit(this,this.OSCTUNE,"TUN0",0x0);
    public final Bit GCEN = new Bit(this,this.OSCTUNE,"GCEN",0x7);
    public final Bit ACKSTAT = new Bit(this,this.OSCTUNE,"ACKSTAT",0x6);
    public final Bit ACKDT = new Bit(this,this.OSCTUNE,"ACKDT",0x5);
    public final Bit ACKEN = new Bit(this,this.OSCTUNE,"ACKEN",0x4);
    public final Bit RCEN = new Bit(this,this.OSCTUNE,"RCEN",0x3);
    public final Bit PEN = new Bit(this,this.OSCTUNE,"PEN",0x2);
    public final Bit RSEN = new Bit(this,this.OSCTUNE,"RSEN",0x1);
    public final Bit SEN = new Bit(this,this.OSCTUNE,"SEN",0x0);
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
    public final Bit CCP3X = new Bit(this,this.SSPSTAT,"CCP3X",0x5);
    public final Bit CCP3Y = new Bit(this,this.SSPSTAT,"CCP3Y",0x4);
    public final Bit CCP3M3 = new Bit(this,this.SSPSTAT,"CCP3M3",0x3);
    public final Bit CCP3M2 = new Bit(this,this.SSPSTAT,"CCP3M2",0x2);
    public final Bit CCP3M1 = new Bit(this,this.SSPSTAT,"CCP3M1",0x1);
    public final Bit CCP3M0 = new Bit(this,this.SSPSTAT,"CCP3M0",0x0);
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
    public final Bit ACQT2 = new Bit(this,this.TXSTA,"ACQT2",0x5);
    public final Bit ACQT1 = new Bit(this,this.TXSTA,"ACQT1",0x4);
    public final Bit ACQT0 = new Bit(this,this.TXSTA,"ACQT0",0x3);
    public final Bit C2OUT = new Bit(this,this.CMCON,"C2OUT",0x7);
    public final Bit C1OUT = new Bit(this,this.CMCON,"C1OUT",0x6);
    public final Bit C2INV = new Bit(this,this.CMCON,"C2INV",0x5);
    public final Bit C1INV = new Bit(this,this.CMCON,"C1INV",0x4);
    public final Bit CIS = new Bit(this,this.CMCON,"CIS",0x3);
    public final Bit CM2 = new Bit(this,this.CMCON,"CM2",0x2);
    public final Bit CM1 = new Bit(this,this.CMCON,"CM1",0x1);
    public final Bit CM0 = new Bit(this,this.CMCON,"CM0",0x0);
    public final Bit CVREN = new Bit(this,this.CVRCON,"CVREN",0x7);
    public final Bit CVROE = new Bit(this,this.CVRCON,"CVROE",0x6);
    public final Bit CVRR = new Bit(this,this.CVRCON,"CVRR",0x5);
    public final Bit CVR3 = new Bit(this,this.CVRCON,"CVR3",0x3);
    public final Bit CVR2 = new Bit(this,this.CVRCON,"CVR2",0x2);
    public final Bit CVR1 = new Bit(this,this.CVRCON,"CVR1",0x1);
    public final Bit CVR0 = new Bit(this,this.CVRCON,"CVR0",0x0);
    public final Bit ADFM = new Bit(this,this.CVRCON,"ADFM",0x7);
    public final Bit ADCS2 = new Bit(this,this.CVRCON,"ADCS2",0x6);
    public final Bit VCFG1 = new Bit(this,this.CVRCON,"VCFG1",0x5);
    public final Bit VCFG0 = new Bit(this,this.CVRCON,"VCFG0",0x4);
    public final Bit PCFG3 = new Bit(this,this.CVRCON,"PCFG3",0x3);
    public final Bit PCFG2 = new Bit(this,this.CVRCON,"PCFG2",0x2);
    public final Bit PCFG1 = new Bit(this,this.CVRCON,"PCFG1",0x1);
    public final Bit PCFG0 = new Bit(this,this.CVRCON,"PCFG0",0x0);
    public final Bit WDTPS3 = new Bit(this,this.WDTCON,"WDTPS3",0x4);
    public final Bit WDTPS2 = new Bit(this,this.WDTCON,"WDTPS2",0x3);
    public final Bit WDTPS1 = new Bit(this,this.WDTCON,"WDTPS1",0x2);
    public final Bit WDTPS0 = new Bit(this,this.WDTCON,"WDTPS0",0x1);
    public final Bit SWDTEN = new Bit(this,this.WDTCON,"SWDTEN",0x0);
    public final Bit SWDTE = new Bit(this,this.WDTCON,"SWDTE",0x0);
    public final Bit IRVST = new Bit(this,this.LVDCON,"IRVST",0x5);
    public final Bit LVDEN = new Bit(this,this.LVDCON,"LVDEN",0x4);
    public final Bit LVDL3 = new Bit(this,this.LVDCON,"LVDL3",0x3);
    public final Bit LVDL2 = new Bit(this,this.LVDCON,"LVDL2",0x2);
    public final Bit LVDL1 = new Bit(this,this.LVDCON,"LVDL1",0x1);
    public final Bit LVDL0 = new Bit(this,this.LVDCON,"LVDL0",0x0);
    public final Bit RD = new Bit(this,this.LVDCON,"RD",0x0);
    public final Bit _CONFIG1 = new Bit(this,this.LVDCON,"_CONFIG1",0x2007);
    public final Bit _CONFIG2 = new Bit(this,this.LVDCON,"_CONFIG2",0x2008);
    public final Bit _CP_ALL = new Bit(this,this.LVDCON,"_CP_ALL",0x1fff);
    public final Bit _CP_OFF = new Bit(this,this.LVDCON,"_CP_OFF",0x3fff);
    public final Bit _CCP2_RC1 = new Bit(this,this.LVDCON,"_CCP2_RC1",0x3fff);
    public final Bit _CCP2_RB3 = new Bit(this,this.LVDCON,"_CCP2_RB3",0x2fff);
    public final Bit _DEBUG_OFF = new Bit(this,this.LVDCON,"_DEBUG_OFF",0x3fff);
    public final Bit _DEBUG_ON = new Bit(this,this.LVDCON,"_DEBUG_ON",0x37ff);
    public final Bit _VBOR_2_0 = new Bit(this,this.LVDCON,"_VBOR_2_0",0x3fff);
    public final Bit _VBOR_2_7 = new Bit(this,this.LVDCON,"_VBOR_2_7",0x3f7f);
    public final Bit _VBOR_4_2 = new Bit(this,this.LVDCON,"_VBOR_4_2",0x3eff);
    public final Bit _VBOR_4_5 = new Bit(this,this.LVDCON,"_VBOR_4_5",0x3e7f);
    public final Bit _BOREN_1 = new Bit(this,this.LVDCON,"_BOREN_1",0x3fff);
    public final Bit _BOREN_0 = new Bit(this,this.LVDCON,"_BOREN_0",0x3fbf);
    public final Bit _MCLR_ON = new Bit(this,this.LVDCON,"_MCLR_ON",0x3fff);
    public final Bit _MCLR_OFF = new Bit(this,this.LVDCON,"_MCLR_OFF",0x3fdf);
    public final Bit _PWRTE_OFF = new Bit(this,this.LVDCON,"_PWRTE_OFF",0x3fff);
    public final Bit _PWRTE_ON = new Bit(this,this.LVDCON,"_PWRTE_ON",0x3ff7);
    public final Bit _WDT_ON = new Bit(this,this.LVDCON,"_WDT_ON",0x3fff);
    public final Bit _WDT_OFF = new Bit(this,this.LVDCON,"_WDT_OFF",0x3ffb);
    public final Bit _EXTRC_CLKOUT = new Bit(this,this.LVDCON,"_EXTRC_CLKOUT",0x3fff);
    public final Bit _EXTRC_IO = new Bit(this,this.LVDCON,"_EXTRC_IO",0x3ffe);
    public final Bit _INTRC_CLKOUT = new Bit(this,this.LVDCON,"_INTRC_CLKOUT",0x3ffd);
    public final Bit _INTRC_IO = new Bit(this,this.LVDCON,"_INTRC_IO",0x3ffc);
    public final Bit _EXTCLK = new Bit(this,this.LVDCON,"_EXTCLK",0x3fef);
    public final Bit _HS_OSC = new Bit(this,this.LVDCON,"_HS_OSC",0x3fee);
    public final Bit _XT_OSC = new Bit(this,this.LVDCON,"_XT_OSC",0x3fed);
    public final Bit _LP_OSC = new Bit(this,this.LVDCON,"_LP_OSC",0x3fec);
    public final Bit _BORSEN_1 = new Bit(this,this.LVDCON,"_BORSEN_1",0x3fff);
    public final Bit _BORSEN_0 = new Bit(this,this.LVDCON,"_BORSEN_0",0x3fbf);
    public final Bit _IESO_ON = new Bit(this,this.LVDCON,"_IESO_ON",0x3fff);
    public final Bit _IESO_OFF = new Bit(this,this.LVDCON,"_IESO_OFF",0x3ffd);
    public final Bit _FCMEN_ON = new Bit(this,this.LVDCON,"_FCMEN_ON",0x3fff);
    public final Bit _FCMEN_OFF = new Bit(this,this.LVDCON,"_FCMEN_OFF",0x3ffe);


    public P16F767(){
        super();
        this.initPage(0x0,0x7ff);
        this.initPage(0x800,0xfff);
        this.initPage(0x1000,0x17ff);
        this.initPage(0x1800,0x1fff);
        this.initConfig(0x2007,0x2009);
        this.initSfr(0x0,0x1f);
        this.initSfr(0x80,0x9f);
        this.initSfr(0x100,0x10f);
        this.initSfr(0x180,0x18f);
        this.initGpr(0x20,0x6f);
        this.initGpr(0xa0,0xef);
        this.initGpr(0x110,0x16f);
        this.initGpr(0x190,0x1ef);
        this.initGpr(0x70,0x7f);
	this.initRegister(this.INDF);
	this.initRegister(this.TMR0);
	this.initRegister(this.PCL);
	this.initRegister(this.STATUS);
	this.initRegister(this.FSR);
	this.initRegister(this.PORTA);
	this.initRegister(this.PORTB);
	this.initRegister(this.PORTC);
	this.initRegister(this.PORTE);
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
	this.initRegister(this.RCSTA);
	this.initRegister(this.TXREG);
	this.initRegister(this.RCREG);
	this.initRegister(this.CCPR2L);
	this.initRegister(this.CCPR2H);
	this.initRegister(this.CCP2CON);
	this.initRegister(this.ADRESH);
	this.initRegister(this.ADCON0);
	this.initRegister(this.OPTION_REG);
	this.initRegister(this.TRISA);
	this.initRegister(this.TRISB);
	this.initRegister(this.TRISC);
	this.initRegister(this.TRISE);
	this.initRegister(this.PIE1);
	this.initRegister(this.PIE2);
	this.initRegister(this.PCON);
	this.initRegister(this.OSCCON);
	this.initRegister(this.OSCTUNE);
	this.initRegister(this.SSPCON2);
	this.initRegister(this.PR2);
	this.initRegister(this.SSPADD);
	this.initRegister(this.SSPSTAT);
	this.initRegister(this.CCPR3L);
	this.initRegister(this.CCPR3H);
	this.initRegister(this.CCP3CON);
	this.initRegister(this.TXSTA);
	this.initRegister(this.SPBRG);
	this.initRegister(this.ADCON2);
	this.initRegister(this.CMCON);
	this.initRegister(this.CVRCON);
	this.initRegister(this.ADRESL);
	this.initRegister(this.ADCON1);
	this.initRegister(this.WDTCON);
	this.initRegister(this.LVDCON);
	this.initRegister(this.PMDATA);
	this.initRegister(this.PMADR);
	this.initRegister(this.PMDATH);
	this.initRegister(this.PMADRH);
	this.initRegister(this.PMCON1);
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
	this.initBit(this.T0IE);
	this.initBit(this.TMR0IE);
	this.initBit(this.INTE);
	this.initBit(this.INT0IE);
	this.initBit(this.RBIE);
	this.initBit(this.T0IF);
	this.initBit(this.TMR0IF);
	this.initBit(this.INTF);
	this.initBit(this.INT0IF);
	this.initBit(this.RBIF);
	this.initBit(this.PSPIF);
	this.initBit(this.ADIF);
	this.initBit(this.RCIF);
	this.initBit(this.TXIF);
	this.initBit(this.SSPIF);
	this.initBit(this.CCP1IF);
	this.initBit(this.TMR2IF);
	this.initBit(this.TMR1IF);
	this.initBit(this.OSFIF);
	this.initBit(this.CMIF);
	this.initBit(this.LVDIF);
	this.initBit(this.BCLIF);
	this.initBit(this.CCP3IF);
	this.initBit(this.CCP2IF);
	this.initBit(this.T1RUN);
	this.initBit(this.T1CKPS1);
	this.initBit(this.T1CKPS0);
	this.initBit(this.T1OSCEN);
	this.initBit(this.NOT_T1SYNC);
	this.initBit(this.T1INSYNC);
	this.initBit(this.T1SYNC);
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
	this.initBit(this.SPEN);
	this.initBit(this.RX9);
	this.initBit(this.RC9);
	this.initBit(this.NOT_RC8);
	this.initBit(this.RC8_9);
	this.initBit(this.SREN);
	this.initBit(this.CREN);
	this.initBit(this.ADDEN);
	this.initBit(this.FERR);
	this.initBit(this.OERR);
	this.initBit(this.RX9D);
	this.initBit(this.RCD8);
	this.initBit(this.CCP2X);
	this.initBit(this.CCP2Y);
	this.initBit(this.CCP2M3);
	this.initBit(this.CCP2M2);
	this.initBit(this.CCP2M1);
	this.initBit(this.CCP2M0);
	this.initBit(this.ADCS1);
	this.initBit(this.ADCS0);
	this.initBit(this.CHS2);
	this.initBit(this.CHS1);
	this.initBit(this.CHS0);
	this.initBit(this.GO);
	this.initBit(this.NOT_DONE);
	this.initBit(this.GO_DONE);
	this.initBit(this.CHS3);
	this.initBit(this.ADON);
	this.initBit(this.NOT_RBPU);
	this.initBit(this.INTEDG);
	this.initBit(this.T0CS);
	this.initBit(this.T0SE);
	this.initBit(this.PSA);
	this.initBit(this.PS2);
	this.initBit(this.PS1);
	this.initBit(this.PS0);
	this.initBit(this.IBF);
	this.initBit(this.OBF);
	this.initBit(this.IBOV);
	this.initBit(this.PSPMODE);
	this.initBit(this.TRISE3);
	this.initBit(this.TRISE2);
	this.initBit(this.TRISE1);
	this.initBit(this.TRISE0);
	this.initBit(this.PSPIE);
	this.initBit(this.ADIE);
	this.initBit(this.RCIE);
	this.initBit(this.TXIE);
	this.initBit(this.SSPIE);
	this.initBit(this.CCP1IE);
	this.initBit(this.TMR2IE);
	this.initBit(this.TMR1IE);
	this.initBit(this.OSFIE);
	this.initBit(this.CMIE);
	this.initBit(this.LVDIE);
	this.initBit(this.BCLIE);
	this.initBit(this.CCP3IE);
	this.initBit(this.CCP2IE);
	this.initBit(this.SBOREN);
	this.initBit(this.NOT_POR);
	this.initBit(this.NOT_BO);
	this.initBit(this.NOT_BOR);
	this.initBit(this.IRCF2);
	this.initBit(this.IRCF1);
	this.initBit(this.IRCF0);
	this.initBit(this.OSTS);
	this.initBit(this.IOFS);
	this.initBit(this.SCS1);
	this.initBit(this.SCS0);
	this.initBit(this.TUN5);
	this.initBit(this.TUN4);
	this.initBit(this.TUN3);
	this.initBit(this.TUN2);
	this.initBit(this.TUN1);
	this.initBit(this.TUN0);
	this.initBit(this.GCEN);
	this.initBit(this.ACKSTAT);
	this.initBit(this.ACKDT);
	this.initBit(this.ACKEN);
	this.initBit(this.RCEN);
	this.initBit(this.PEN);
	this.initBit(this.RSEN);
	this.initBit(this.SEN);
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
	this.initBit(this.CCP3X);
	this.initBit(this.CCP3Y);
	this.initBit(this.CCP3M3);
	this.initBit(this.CCP3M2);
	this.initBit(this.CCP3M1);
	this.initBit(this.CCP3M0);
	this.initBit(this.CSRC);
	this.initBit(this.TX9);
	this.initBit(this.NOT_TX8);
	this.initBit(this.TX8_9);
	this.initBit(this.TXEN);
	this.initBit(this.SYNC);
	this.initBit(this.BRGH);
	this.initBit(this.TRMT);
	this.initBit(this.TX9D);
	this.initBit(this.TXD8);
	this.initBit(this.ACQT2);
	this.initBit(this.ACQT1);
	this.initBit(this.ACQT0);
	this.initBit(this.C2OUT);
	this.initBit(this.C1OUT);
	this.initBit(this.C2INV);
	this.initBit(this.C1INV);
	this.initBit(this.CIS);
	this.initBit(this.CM2);
	this.initBit(this.CM1);
	this.initBit(this.CM0);
	this.initBit(this.CVREN);
	this.initBit(this.CVROE);
	this.initBit(this.CVRR);
	this.initBit(this.CVR3);
	this.initBit(this.CVR2);
	this.initBit(this.CVR1);
	this.initBit(this.CVR0);
	this.initBit(this.ADFM);
	this.initBit(this.ADCS2);
	this.initBit(this.VCFG1);
	this.initBit(this.VCFG0);
	this.initBit(this.PCFG3);
	this.initBit(this.PCFG2);
	this.initBit(this.PCFG1);
	this.initBit(this.PCFG0);
	this.initBit(this.WDTPS3);
	this.initBit(this.WDTPS2);
	this.initBit(this.WDTPS1);
	this.initBit(this.WDTPS0);
	this.initBit(this.SWDTEN);
	this.initBit(this.SWDTE);
	this.initBit(this.IRVST);
	this.initBit(this.LVDEN);
	this.initBit(this.LVDL3);
	this.initBit(this.LVDL2);
	this.initBit(this.LVDL1);
	this.initBit(this.LVDL0);
	this.initBit(this.RD);
	this.initBit(this._CONFIG1);
	this.initBit(this._CONFIG2);
	this.initBit(this._CP_ALL);
	this.initBit(this._CP_OFF);
	this.initBit(this._CCP2_RC1);
	this.initBit(this._CCP2_RB3);
	this.initBit(this._DEBUG_OFF);
	this.initBit(this._DEBUG_ON);
	this.initBit(this._VBOR_2_0);
	this.initBit(this._VBOR_2_7);
	this.initBit(this._VBOR_4_2);
	this.initBit(this._VBOR_4_5);
	this.initBit(this._BOREN_1);
	this.initBit(this._BOREN_0);
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
	this.initBit(this._BORSEN_1);
	this.initBit(this._BORSEN_0);
	this.initBit(this._IESO_ON);
	this.initBit(this._IESO_OFF);
	this.initBit(this._FCMEN_ON);
	this.initBit(this._FCMEN_OFF);
    }


    public Instruction createInstruction(int addr, int opc){
        Op op = P14.For(opc);
        if (null != op)
            return new Instruction(this,op,addr,opc);
        else
            throw new IllegalArgumentException(String.format("Opcode 0x%x not found (arch P14, page address 0x%x)",opc,addr));
    }
}
