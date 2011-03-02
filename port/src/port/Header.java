package port;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;


public class Header
    extends Reader
{
    public static class Section {

        private final static int ScanToAlpha(String line){
            char[] cary = line.toCharArray();
            final int count = Math.min(15,cary.length);
            char ch;
            for (int cc = 0; cc < count; cc++){
                ch = cary[cc];
                switch(cc){
                case 0:
                    if (';' != ch)
                        return -1;
                    break;
                case 1:
                case 2:
                    if ('-' != ch)
                        return -1;
                    break;
                default:
                    if ('A' <= ch && 'Z' >= ch)
                        return cc;
                }
            }
            return -1;
        }
        private final static int ScanFromAlpha(String line){
            char[] cary = line.toCharArray();
            final int count = cary.length;
            char ch;
            for (int cc = 0; cc < count; cc++){
                ch = cary[cc];
                if ('A' > ch || 'Z' < ch){

                    if (' ' == ch){
                        /*
                         * Permit one space among alpha chars
                         */
                        final int tc = (cc+1);
                        if (tc < count){

                            ch = cary[tc];
                            if ('A' > ch || 'Z' < ch)
                                return cc;
                            else {
                                cc = tc;
                                continue;
                            }
                        }
                    }
                    return cc;
                }
            }
            return -1;
        }
        public final static Section New(Section current, String line){

            line = line.toUpperCase();

            int idx = ScanToAlpha(line);

            if (-1 < idx){
                line = line.substring(idx);

                idx = ScanFromAlpha(line);
                if (-1 < idx){
                    line = line.substring(0,idx);
                }

                idx = line.indexOf(' ');


                if (line.startsWith("REGISTER")){
                    if (null == current || current.symbol != Symbol.REG)
                        return new Section(Symbol.REG);
                }
                else if (line.startsWith("CONFIGURATION")){
                    if (current.symbol != Symbol.CNF)
                        return new Section(Symbol.CNF);
                }
                else if (line.endsWith("BITS")){
                    if (-1 < idx)
                        return new Section(line.substring(0,idx).trim(),Symbol.BIT);
                    else if (current.symbol != Symbol.BIT)
                        return new Section(Symbol.BIT);
                }
                else if (line.endsWith("DEFINITION")){
                    if (current.symbol != Symbol.DEF)
                        return new Section(Symbol.DEF);
                }
            }
            return current;
        }


        public final String register;
        public final Symbol symbol;


        public Section(Symbol s){
            super();
            this.register = null;
            this.symbol = s;
        }
        public Section(String r, Symbol s){
            super();
            this.register = r;
            this.symbol = s;
        }
    }

    public static class Register {

        public final Section section;
        public final String name, valueString;
        public final int value;


        public Register(Section section, String line){
            super();
            this.section = section;
            int idx = line.indexOf("EQU");
            if (0 < idx){
                this.name = line.substring(0,idx).trim();
                this.valueString = Decomment(line.substring(idx+3));
                this.value = Value(this.valueString);
            }
            else
                throw new IllegalArgumentException();
        }


        public final static Register[] Add(Register[] list, Register item){
            if (null == item)
                return list;
            else if (null == list)
                return new Register[]{item};
            else {
                int count = list.length;
                Register[] copier = new Register[count+1];
                System.arraycopy(list,0,copier,0,count);
                copier[count] = item;
                return copier;
            }
        }
        private final static int Value(String string){
            if ('H' == string.charAt(0) && '\'' == string.charAt(1))

                return Integer.parseInt(string.substring(2,string.length()-1),16);
            else
                throw new Error("Unrecognized string "+string);
        }
        private final static String Decomment(String string){
            int idx = string.lastIndexOf(';');
            if (-1 < idx)
                return string.substring(0,idx).trim();
            else
                return string.trim();
        }
    }


    /**
     * ASM INC - derived name, e.g., P16F873
     */
    public final String name;

    public String headline;

    public Register[] registers;


    public Header(File file) throws IOException {
        super(file);
        this.name = BaseName(file);
    }


    public boolean isNotEmpty(){
        return (null != this.registers);
    }
    public void read(BufferedReader p) throws IOException {
        Register[] registers = null;
        boolean list = false;
        int tst;
        Section current = null;
        String headline = null, line;
        while (null != (line = p.readLine())){
            if (0 < line.length()){
                switch (line.charAt(0)){
                case '\t':
                case ' ':
                    tst = line.indexOf("LIST");
                    if (0 < tst){
                        list = ('O' != line.charAt(tst-1));
                    }
                    break;
                case ';':
                    if (list){
                        if (null == headline)
                            headline = line.substring(1).trim();
                    }
                    else if (1 < line.length()){
                        current = Section.New(current,line);
                    }
                    break;
                default:
                    if (null != current){
                        try {
                            registers = Register.Add(registers,new Register(current,line));
                        }
                        catch (RuntimeException exc){
                        }
                    }
                }
            }
        }
        this.registers = registers;
        this.headline = headline;
    }

}
