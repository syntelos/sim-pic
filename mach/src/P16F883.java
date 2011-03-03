// Generated by sim-pic:port from mach.xtm via hapax2

import lib.mach.Bit;
import lib.mach.Instruction;
import lib.mach.Register;
import lib.mach.Op;
import lib.mach.P14;

/**
 * Generated SimPic Port of P16F883.
 */
public class P16F883
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
    public final Register SSPMSK = new Register(this,"SSPMSK",0x93);
    public final Register MSK = new Register(this,"MSK",0x93);
    public final Register SSPSTAT = new Register(this,"SSPSTAT",0x94);
    public final Register WPUB = new Register(this,"WPUB",0x95);
    public final Register IOCB = new Register(this,"IOCB",0x96);
    public final Register VRCON = new Register(this,"VRCON",0x97);
    public final Register TXSTA = new Register(this,"TXSTA",0x98);
    public final Register SPBRG = new Register(this,"SPBRG",0x99);
    public final Register SPBRGH = new Register(this,"SPBRGH",0x9a);
    public final Register PWM1CON = new Register(this,"PWM1CON",0x9b);
    public final Register ECCPAS = new Register(this,"ECCPAS",0x9c);
    public final Register PSTRCON = new Register(this,"PSTRCON",0x9d);
    public final Register ADRESL = new Register(this,"ADRESL",0x9e);
    public final Register ADCON1 = new Register(this,"ADCON1",0x9f);
    public final Register WDTCON = new Register(this,"WDTCON",0x105);
    public final Register CM1CON0 = new Register(this,"CM1CON0",0x107);
    public final Register CM2CON0 = new Register(this,"CM2CON0",0x108);
    public final Register CM2CON1 = new Register(this,"CM2CON1",0x109);
    public final Register EEDATA = new Register(this,"EEDATA",0x10c);
    public final Register EEDAT = new Register(this,"EEDAT",0x10c);
    public final Register EEADR = new Register(this,"EEADR",0x10d);
    public final Register EEDATH = new Register(this,"EEDATH",0x10e);
    public final Register EEADRH = new Register(this,"EEADRH",0x10f);
    public final Register SRCON = new Register(this,"SRCON",0x185);
    public final Register BAUDCTL = new Register(this,"BAUDCTL",0x187);
    public final Register ANSEL = new Register(this,"ANSEL",0x188);
    public final Register ANSELH = new Register(this,"ANSELH",0x189);
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
    public final Bit T0IE = new Bit(this,this.INTCON,"T0IE",0x5);
    public final Bit TMR0IE = new Bit(this,this.INTCON,"TMR0IE",0x5);
    public final Bit INTE = new Bit(this,this.INTCON,"INTE",0x4);
    public final Bit RBIE = new Bit(this,this.INTCON,"RBIE",0x3);
    public final Bit T0IF = new Bit(this,this.INTCON,"T0IF",0x2);
    public final Bit TMR0IF = new Bit(this,this.INTCON,"TMR0IF",0x2);
    public final Bit INTF = new Bit(this,this.INTCON,"INTF",0x1);
    public final Bit RBIF = new Bit(this,this.INTCON,"RBIF",0x0);
    public final Bit ADIF = new Bit(this,this.INTCON,"ADIF",0x6);
    public final Bit RCIF = new Bit(this,this.INTCON,"RCIF",0x5);
    public final Bit TXIF = new Bit(this,this.INTCON,"TXIF",0x4);
    public final Bit SSPIF = new Bit(this,this.INTCON,"SSPIF",0x3);
    public final Bit CCP1IF = new Bit(this,this.INTCON,"CCP1IF",0x2);
    public final Bit TMR2IF = new Bit(this,this.INTCON,"TMR2IF",0x1);
    public final Bit TMR1IF = new Bit(this,this.INTCON,"TMR1IF",0x0);
    public final Bit OSFIF = new Bit(this,this.INTCON,"OSFIF",0x7);
    public final Bit C2IF = new Bit(this,this.INTCON,"C2IF",0x6);
    public final Bit C1IF = new Bit(this,this.INTCON,"C1IF",0x5);
    public final Bit EEIF = new Bit(this,this.INTCON,"EEIF",0x4);
    public final Bit BCLIF = new Bit(this,this.INTCON,"BCLIF",0x3);
    public final Bit ULPWUIF = new Bit(this,this.INTCON,"ULPWUIF",0x2);
    public final Bit CCP2IF = new Bit(this,this.INTCON,"CCP2IF",0x0);
    public final Bit T1GIV = new Bit(this,this.INTCON,"T1GIV",0x7);
    public final Bit TMR1GE = new Bit(this,this.INTCON,"TMR1GE",0x6);
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
    public final Bit P1M1 = new Bit(this,this.SSPCON,"P1M1",0x7);
    public final Bit P1M0 = new Bit(this,this.SSPCON,"P1M0",0x6);
    public final Bit DC1B1 = new Bit(this,this.SSPCON,"DC1B1",0x5);
    public final Bit CCP1X = new Bit(this,this.SSPCON,"CCP1X",0x5);
    public final Bit DC1B0 = new Bit(this,this.SSPCON,"DC1B0",0x4);
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
    public final Bit DC2B1 = new Bit(this,this.RCSTA,"DC2B1",0x5);
    public final Bit CCP2Y = new Bit(this,this.RCSTA,"CCP2Y",0x4);
    public final Bit DC2B0 = new Bit(this,this.RCSTA,"DC2B0",0x4);
    public final Bit CCP2M3 = new Bit(this,this.RCSTA,"CCP2M3",0x3);
    public final Bit CCP2M2 = new Bit(this,this.RCSTA,"CCP2M2",0x2);
    public final Bit CCP2M1 = new Bit(this,this.RCSTA,"CCP2M1",0x1);
    public final Bit CCP2M0 = new Bit(this,this.RCSTA,"CCP2M0",0x0);
    public final Bit ADCS1 = new Bit(this,this.RCSTA,"ADCS1",0x7);
    public final Bit ADCS0 = new Bit(this,this.RCSTA,"ADCS0",0x6);
    public final Bit CHS3 = new Bit(this,this.RCSTA,"CHS3",0x5);
    public final Bit CHS2 = new Bit(this,this.RCSTA,"CHS2",0x4);
    public final Bit CHS1 = new Bit(this,this.RCSTA,"CHS1",0x3);
    public final Bit CHS0 = new Bit(this,this.RCSTA,"CHS0",0x2);
    public final Bit GO = new Bit(this,this.RCSTA,"GO",0x1);
    public final Bit NOT_DONE = new Bit(this,this.RCSTA,"NOT_DONE",0x1);
    public final Bit GO_DONE = new Bit(this,this.RCSTA,"GO_DONE",0x1);
    public final Bit ADON = new Bit(this,this.RCSTA,"ADON",0x0);
    public final Bit NOT_RBPU = new Bit(this,this.RCSTA,"NOT_RBPU",0x7);
    public final Bit INTEDG = new Bit(this,this.RCSTA,"INTEDG",0x6);
    public final Bit T0CS = new Bit(this,this.RCSTA,"T0CS",0x5);
    public final Bit T0SE = new Bit(this,this.RCSTA,"T0SE",0x4);
    public final Bit PSA = new Bit(this,this.RCSTA,"PSA",0x3);
    public final Bit PS2 = new Bit(this,this.RCSTA,"PS2",0x2);
    public final Bit PS1 = new Bit(this,this.RCSTA,"PS1",0x1);
    public final Bit PS0 = new Bit(this,this.RCSTA,"PS0",0x0);
    public final Bit ADIE = new Bit(this,this.RCSTA,"ADIE",0x6);
    public final Bit RCIE = new Bit(this,this.RCSTA,"RCIE",0x5);
    public final Bit TXIE = new Bit(this,this.RCSTA,"TXIE",0x4);
    public final Bit SSPIE = new Bit(this,this.RCSTA,"SSPIE",0x3);
    public final Bit CCP1IE = new Bit(this,this.RCSTA,"CCP1IE",0x2);
    public final Bit TMR2IE = new Bit(this,this.RCSTA,"TMR2IE",0x1);
    public final Bit TMR1IE = new Bit(this,this.RCSTA,"TMR1IE",0x0);
    public final Bit OSFIE = new Bit(this,this.RCSTA,"OSFIE",0x7);
    public final Bit C2IE = new Bit(this,this.RCSTA,"C2IE",0x6);
    public final Bit C1IE = new Bit(this,this.RCSTA,"C1IE",0x5);
    public final Bit EEIE = new Bit(this,this.RCSTA,"EEIE",0x4);
    public final Bit BCLIE = new Bit(this,this.RCSTA,"BCLIE",0x3);
    public final Bit ULPWUIE = new Bit(this,this.RCSTA,"ULPWUIE",0x2);
    public final Bit CCP2IE = new Bit(this,this.RCSTA,"CCP2IE",0x0);
    public final Bit ULPWUE = new Bit(this,this.PCON,"ULPWUE",0x5);
    public final Bit SBOREN = new Bit(this,this.PCON,"SBOREN",0x4);
    public final Bit NOT_POR = new Bit(this,this.PCON,"NOT_POR",0x1);
    public final Bit NOT_BO = new Bit(this,this.PCON,"NOT_BO",0x0);
    public final Bit NOT_BOR = new Bit(this,this.PCON,"NOT_BOR",0x0);
    public final Bit IRCF2 = new Bit(this,this.OSCCON,"IRCF2",0x6);
    public final Bit IRCF1 = new Bit(this,this.OSCCON,"IRCF1",0x5);
    public final Bit IRCF0 = new Bit(this,this.OSCCON,"IRCF0",0x4);
    public final Bit OSTS = new Bit(this,this.OSCCON,"OSTS",0x3);
    public final Bit HTS = new Bit(this,this.OSCCON,"HTS",0x2);
    public final Bit LTS = new Bit(this,this.OSCCON,"LTS",0x1);
    public final Bit SCS = new Bit(this,this.OSCCON,"SCS",0x0);
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
    public final Bit WPUB7 = new Bit(this,this.WPUB,"WPUB7",0x7);
    public final Bit WPUB6 = new Bit(this,this.WPUB,"WPUB6",0x6);
    public final Bit WPUB5 = new Bit(this,this.WPUB,"WPUB5",0x5);
    public final Bit WPUB4 = new Bit(this,this.WPUB,"WPUB4",0x4);
    public final Bit WPUB3 = new Bit(this,this.WPUB,"WPUB3",0x3);
    public final Bit WPUB2 = new Bit(this,this.WPUB,"WPUB2",0x2);
    public final Bit WPUB1 = new Bit(this,this.WPUB,"WPUB1",0x1);
    public final Bit WPUB0 = new Bit(this,this.WPUB,"WPUB0",0x0);
    public final Bit IOCB7 = new Bit(this,this.IOCB,"IOCB7",0x7);
    public final Bit IOCB6 = new Bit(this,this.IOCB,"IOCB6",0x6);
    public final Bit IOCB5 = new Bit(this,this.IOCB,"IOCB5",0x5);
    public final Bit IOCB4 = new Bit(this,this.IOCB,"IOCB4",0x4);
    public final Bit IOCB3 = new Bit(this,this.IOCB,"IOCB3",0x3);
    public final Bit IOCB2 = new Bit(this,this.IOCB,"IOCB2",0x2);
    public final Bit IOCB1 = new Bit(this,this.IOCB,"IOCB1",0x1);
    public final Bit IOCB0 = new Bit(this,this.IOCB,"IOCB0",0x0);
    public final Bit VREN = new Bit(this,this.VRCON,"VREN",0x7);
    public final Bit VROE = new Bit(this,this.VRCON,"VROE",0x6);
    public final Bit VRR = new Bit(this,this.VRCON,"VRR",0x5);
    public final Bit VRSS = new Bit(this,this.VRCON,"VRSS",0x4);
    public final Bit VR3 = new Bit(this,this.VRCON,"VR3",0x3);
    public final Bit VR2 = new Bit(this,this.VRCON,"VR2",0x2);
    public final Bit VR1 = new Bit(this,this.VRCON,"VR1",0x1);
    public final Bit VR0 = new Bit(this,this.VRCON,"VR0",0x0);
    public final Bit CSRC = new Bit(this,this.TXSTA,"CSRC",0x7);
    public final Bit TX9 = new Bit(this,this.TXSTA,"TX9",0x6);
    public final Bit NOT_TX8 = new Bit(this,this.TXSTA,"NOT_TX8",0x6);
    public final Bit TX8_9 = new Bit(this,this.TXSTA,"TX8_9",0x6);
    public final Bit TXEN = new Bit(this,this.TXSTA,"TXEN",0x5);
    public final Bit SYNC = new Bit(this,this.TXSTA,"SYNC",0x4);
    public final Bit SENDB = new Bit(this,this.TXSTA,"SENDB",0x3);
    public final Bit BRGH = new Bit(this,this.TXSTA,"BRGH",0x2);
    public final Bit TRMT = new Bit(this,this.TXSTA,"TRMT",0x1);
    public final Bit TX9D = new Bit(this,this.TXSTA,"TX9D",0x0);
    public final Bit TXD8 = new Bit(this,this.TXSTA,"TXD8",0x0);
    public final Bit BRG7 = new Bit(this,this.SPBRG,"BRG7",0x7);
    public final Bit BRG6 = new Bit(this,this.SPBRG,"BRG6",0x6);
    public final Bit BRG5 = new Bit(this,this.SPBRG,"BRG5",0x5);
    public final Bit BRG4 = new Bit(this,this.SPBRG,"BRG4",0x4);
    public final Bit BRG3 = new Bit(this,this.SPBRG,"BRG3",0x3);
    public final Bit BRG2 = new Bit(this,this.SPBRG,"BRG2",0x2);
    public final Bit BRG1 = new Bit(this,this.SPBRG,"BRG1",0x1);
    public final Bit BRG0 = new Bit(this,this.SPBRG,"BRG0",0x0);
    public final Bit BRG15 = new Bit(this,this.SPBRGH,"BRG15",0x7);
    public final Bit BRG14 = new Bit(this,this.SPBRGH,"BRG14",0x6);
    public final Bit BRG13 = new Bit(this,this.SPBRGH,"BRG13",0x5);
    public final Bit BRG12 = new Bit(this,this.SPBRGH,"BRG12",0x4);
    public final Bit BRG11 = new Bit(this,this.SPBRGH,"BRG11",0x3);
    public final Bit BRG10 = new Bit(this,this.SPBRGH,"BRG10",0x2);
    public final Bit BRG9 = new Bit(this,this.SPBRGH,"BRG9",0x1);
    public final Bit BRG8 = new Bit(this,this.SPBRGH,"BRG8",0x0);
    public final Bit PRSEN = new Bit(this,this.SPBRGH,"PRSEN",0x7);
    public final Bit PDC6 = new Bit(this,this.SPBRGH,"PDC6",0x6);
    public final Bit PDC5 = new Bit(this,this.SPBRGH,"PDC5",0x5);
    public final Bit PDC4 = new Bit(this,this.SPBRGH,"PDC4",0x4);
    public final Bit PDC3 = new Bit(this,this.SPBRGH,"PDC3",0x3);
    public final Bit PDC2 = new Bit(this,this.SPBRGH,"PDC2",0x2);
    public final Bit PDC1 = new Bit(this,this.SPBRGH,"PDC1",0x1);
    public final Bit PDC0 = new Bit(this,this.SPBRGH,"PDC0",0x0);
    public final Bit ECCPASE = new Bit(this,this.ECCPAS,"ECCPASE",0x7);
    public final Bit ECCPAS2 = new Bit(this,this.ECCPAS,"ECCPAS2",0x6);
    public final Bit ECCPAS1 = new Bit(this,this.ECCPAS,"ECCPAS1",0x5);
    public final Bit ECCPAS0 = new Bit(this,this.ECCPAS,"ECCPAS0",0x4);
    public final Bit PSSAC1 = new Bit(this,this.ECCPAS,"PSSAC1",0x3);
    public final Bit PSSAC0 = new Bit(this,this.ECCPAS,"PSSAC0",0x2);
    public final Bit PSSBD1 = new Bit(this,this.ECCPAS,"PSSBD1",0x1);
    public final Bit PSSBD0 = new Bit(this,this.ECCPAS,"PSSBD0",0x0);
    public final Bit STRSYNC = new Bit(this,this.PSTRCON,"STRSYNC",0x4);
    public final Bit STRD = new Bit(this,this.PSTRCON,"STRD",0x3);
    public final Bit STRC = new Bit(this,this.PSTRCON,"STRC",0x2);
    public final Bit STRB = new Bit(this,this.PSTRCON,"STRB",0x1);
    public final Bit STRA = new Bit(this,this.PSTRCON,"STRA",0x0);
    public final Bit ADFM = new Bit(this,this.PSTRCON,"ADFM",0x7);
    public final Bit VCFG1 = new Bit(this,this.PSTRCON,"VCFG1",0x5);
    public final Bit VCFG0 = new Bit(this,this.PSTRCON,"VCFG0",0x4);
    public final Bit WDTPS3 = new Bit(this,this.WDTCON,"WDTPS3",0x4);
    public final Bit WDTPS2 = new Bit(this,this.WDTCON,"WDTPS2",0x3);
    public final Bit WDTPS1 = new Bit(this,this.WDTCON,"WDTPS1",0x2);
    public final Bit WDTPS0 = new Bit(this,this.WDTCON,"WDTPS0",0x1);
    public final Bit SWDTEN = new Bit(this,this.WDTCON,"SWDTEN",0x0);
    public final Bit C1ON = new Bit(this,this.WDTCON,"C1ON",0x7);
    public final Bit C1OUT = new Bit(this,this.WDTCON,"C1OUT",0x6);
    public final Bit C1OE = new Bit(this,this.WDTCON,"C1OE",0x5);
    public final Bit C1POL = new Bit(this,this.WDTCON,"C1POL",0x4);
    public final Bit C1R = new Bit(this,this.WDTCON,"C1R",0x2);
    public final Bit C1CH1 = new Bit(this,this.WDTCON,"C1CH1",0x1);
    public final Bit C1CH0 = new Bit(this,this.WDTCON,"C1CH0",0x0);
    public final Bit C2ON = new Bit(this,this.WDTCON,"C2ON",0x7);
    public final Bit C2OUT = new Bit(this,this.WDTCON,"C2OUT",0x6);
    public final Bit C2OE = new Bit(this,this.WDTCON,"C2OE",0x5);
    public final Bit C2POL = new Bit(this,this.WDTCON,"C2POL",0x4);
    public final Bit C2R = new Bit(this,this.WDTCON,"C2R",0x2);
    public final Bit C2CH1 = new Bit(this,this.WDTCON,"C2CH1",0x1);
    public final Bit C2CH0 = new Bit(this,this.WDTCON,"C2CH0",0x0);
    public final Bit MC1OUT = new Bit(this,this.WDTCON,"MC1OUT",0x7);
    public final Bit MC2OUT = new Bit(this,this.WDTCON,"MC2OUT",0x6);
    public final Bit C1RSEL = new Bit(this,this.WDTCON,"C1RSEL",0x5);
    public final Bit C2RSEL = new Bit(this,this.WDTCON,"C2RSEL",0x4);
    public final Bit T1GSS = new Bit(this,this.WDTCON,"T1GSS",0x1);
    public final Bit C2SYNC = new Bit(this,this.WDTCON,"C2SYNC",0x0);
    public final Bit SR1 = new Bit(this,this.SRCON,"SR1",0x7);
    public final Bit SR0 = new Bit(this,this.SRCON,"SR0",0x6);
    public final Bit C1SEN = new Bit(this,this.SRCON,"C1SEN",0x5);
    public final Bit C2REN = new Bit(this,this.SRCON,"C2REN",0x4);
    public final Bit PULSS = new Bit(this,this.SRCON,"PULSS",0x3);
    public final Bit PULSR = new Bit(this,this.SRCON,"PULSR",0x2);
    public final Bit FVREN = new Bit(this,this.SRCON,"FVREN",0x0);
    public final Bit ABDOVF = new Bit(this,this.BAUDCTL,"ABDOVF",0x7);
    public final Bit RCIDL = new Bit(this,this.BAUDCTL,"RCIDL",0x6);
    public final Bit SCKP = new Bit(this,this.BAUDCTL,"SCKP",0x4);
    public final Bit BRG16 = new Bit(this,this.BAUDCTL,"BRG16",0x3);
    public final Bit WUE = new Bit(this,this.BAUDCTL,"WUE",0x1);
    public final Bit ABDEN = new Bit(this,this.BAUDCTL,"ABDEN",0x0);
    public final Bit ANS4 = new Bit(this,this.ANSEL,"ANS4",0x4);
    public final Bit ANS3 = new Bit(this,this.ANSEL,"ANS3",0x3);
    public final Bit ANS2 = new Bit(this,this.ANSEL,"ANS2",0x2);
    public final Bit ANS1 = new Bit(this,this.ANSEL,"ANS1",0x1);
    public final Bit ANS0 = new Bit(this,this.ANSEL,"ANS0",0x0);
    public final Bit ANS13 = new Bit(this,this.ANSELH,"ANS13",0x5);
    public final Bit ANS12 = new Bit(this,this.ANSELH,"ANS12",0x4);
    public final Bit ANS11 = new Bit(this,this.ANSELH,"ANS11",0x3);
    public final Bit ANS10 = new Bit(this,this.ANSELH,"ANS10",0x2);
    public final Bit ANS9 = new Bit(this,this.ANSELH,"ANS9",0x1);
    public final Bit ANS8 = new Bit(this,this.ANSELH,"ANS8",0x0);
    public final Bit EEPGD = new Bit(this,this.ANSELH,"EEPGD",0x7);
    public final Bit WRERR = new Bit(this,this.ANSELH,"WRERR",0x3);
    public final Bit WREN = new Bit(this,this.ANSELH,"WREN",0x2);
    public final Bit WR = new Bit(this,this.ANSELH,"WR",0x1);
    public final Bit RD = new Bit(this,this.ANSELH,"RD",0x0);
    public final Bit _CONFIG1 = new Bit(this,this.ANSELH,"_CONFIG1",0x2007);
    public final Bit _CONFIG2 = new Bit(this,this.ANSELH,"_CONFIG2",0x2008);


    public P16F883(){
        super();
        this.initPage(0x0,0x7ff);
        this.initPage(0x800,0xfff);
        this.initConfig(0x2007,0x2008);
        this.initEedata(0x2100,0x21ff);
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
