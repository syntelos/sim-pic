package port;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.util.StringTokenizer;


public class Lkr
    extends Reader
{
    public enum Kind {
        CODEPAGE, DATABANK, SHAREBANK, SECTION;
    }

    public static class Descriptor {

        public final Kind kind;
        public final String name;
        public final int start, end;
        public final boolean protection;


        public Descriptor(String line){
            super();
            StringTokenizer strtok = new StringTokenizer(line," \t");
            this.kind = Kind.valueOf(strtok.nextToken());
            this.name = Name(strtok.nextToken());
            this.start = Start(strtok.nextToken());
            this.end = End(strtok.nextToken());
            this.protection = Protection(strtok);
        }


        public boolean isGPR(){
            if (this.protection)
                return false;
            else {
                switch (this.kind){
                case DATABANK:
                case SHAREBANK:
                    return true;
                default:
                    return false;
                }
            }
        }
        public boolean isShr(){
            if (this.protection)
                return false;
            else 
                return (Kind.SHAREBANK == this.kind);
        }

        public final static Descriptor[] Add(Descriptor[] list, Descriptor item){
            if (null == item)
                return list;
            else if (null == list)
                return new Descriptor[]{item};
            else {
                int count = list.length;
                Descriptor[] copier = new Descriptor[count+1];
                System.arraycopy(list,0,copier,0,count);
                copier[count] = item;
                return copier;
            }
        }
        private final static String Name(String string){
            if (string.startsWith("NAME="))
                return string.substring("NAME=".length());
            else
                throw new IllegalArgumentException(string);
        }
        private final static int Start(String string){
            if (string.startsWith("START="))
                return Integer.decode( string.substring("START=".length()));
            else
                throw new IllegalArgumentException(string);
        }
        private final static int End(String string){
            if (string.startsWith("END="))
                return Integer.decode( string.substring("END=".length()));
            else
                throw new IllegalArgumentException(string);
        }
        private final static boolean Protection(StringTokenizer strtok){
            if (strtok.hasMoreTokens()){
                String string = strtok.nextToken();
                if ("PROTECTED".equals(string))
                    return true;
                else
                    throw new Error("Unrecognized string '"+string+"'");
            }
            else
                return false;
        }
    }


    /**
     * Linker script - derived name, e.g., 16F873
     */
    public final String name;

    public Descriptor[] descriptors;


    public Lkr(File file) throws IOException {
        super(file);
        this.name = BaseName(file);
    }


    public boolean isNotEmpty(){
        return (null != this.descriptors);
    }
    public void read(BufferedReader p) throws IOException {
        Descriptor[] descriptors = null;
        String line;
        while (null != (line = p.readLine())){
            if (0 < line.length()){
                switch (line.charAt(0)){
                case '\t':
                case ' ':
                case ';':
                    break;
                default:
                    try {
                        descriptors = Descriptor.Add(descriptors,new Descriptor(line));
                    }
                    catch (RuntimeException exc){
                    }
                }
            }
        }
        this.descriptors = descriptors;
    }
}
