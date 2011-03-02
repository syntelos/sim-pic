package port;

/**
 * An architecture class identifies a unique instruction set.  
 * 
 * The membership and ordering of this enum will change.
 */
public enum Arch {

    USR(Arch.Class.USR),
    P14(Arch.Class.PIC);


    public final Arch.Class aclass;


    public enum Class {

        USR,
        PIC;

        public final static Arch.Class For(String string){

            string = string.toUpperCase();

            if (3 < string.length()){
                try {
                    return Arch.Class.valueOf(string.substring(0,3));
                }
                catch (Exception exc){
                }
            }
            return Arch.Class.USR;
        }
    }



    public final static Arch For(String string){

        string = string.toUpperCase();

        final Arch.Class arcs = Arch.Class.For(string);
        switch(arcs){
        case USR:
            break;
        case PIC:
            string = "P"+string.substring(3);
            break;
        default:
            throw new Error();
        }

        return Arch.valueOf(string);
    }


    private Arch(Arch.Class ac){
        this.aclass = ac;
    }
}
