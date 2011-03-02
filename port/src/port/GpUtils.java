package port;

import java.io.File;
import java.io.IOException;

/**
 * Find assembler and components.
 */
public class GpUtils {

    /**
     * A collection of known assembler locations.
     */
    public abstract static class Location
        extends java.io.File
    {

        private final static Location[] Locations = {
            new Location.Usr(),
            new Location.UsrLocal(),
            new Location.Home(),
            new Location.Default()
        };


        public static class Usr
            extends Location
        {
            public Usr(){
                super("/usr/share/gputils");
            }

            public File getAssembler(){
                return new File("/usr/bin/gpasm");
            }
            public File getHeaders(){
                return new File(this,"header");
            }
            public File getLinkerScripts(){
                return new File(this,"lkr");
            }
        }
        public static class UsrLocal
            extends Location
        {
            public UsrLocal(){
                super("/usr/local/share/gputils");
            }

            public File getAssembler(){
                return new File("/usr/local/bin/gpasm");
            }
            public File getHeaders(){
                return new File(this,"header");
            }
            public File getLinkerScripts(){
                return new File(this,"lkr");
            }
        }
        public static class Home
            extends Location
        {
            public Home(){
                super(System.getProperty("user.home")+"/gputils");
            }


            public File getAssembler(){
                return new File(this,"gpasm");
            }
            public File getHeaders(){
                return new File(this,"header");
            }
            public File getLinkerScripts(){
                return new File(this,"lkr");
            }
        }
        public static class Default
            extends Location
        {

            public Default(){
                super(".");
            }


            public File getAssembler(){
                return new File("gpasm");
            }
            public File getHeaders(){
                return null;
            }
            public File getLinkerScripts(){
                return null;
            }
        }

        public Location(String path){
            super(path);
        }


        public abstract File getAssembler();

        public abstract File getHeaders();

        public abstract File getLinkerScripts();

        public final File getHeader(String pid){
            File test = new File(pid);
            if (test.isFile())
                return test;
            else {
                pid = pid.toLowerCase();

                File def = new File(this.getHeaders(),pid+".inc");
                if (def.isFile())
                    return def;

                else {
                    test = new File(this.getHeaders(),"p"+pid+".inc");
                    if (test.isFile())
                        return test;
                    else
                        return def;
                }
            }
        }
        public final File getLinkerScript(String pid){
            File test = new File(pid);
            if (test.isFile())
                return test;
            else {
                pid = pid.toLowerCase();

                File def = new File(this.getLinkerScripts(),pid+".lkr");
                if (def.isFile())
                    return def;

                else {
                    test = new File(this.getLinkerScripts(),pid.substring(1)+".lkr");
                    if (test.isFile())
                        return test;
                    else
                        return def;
                }
            }
        }
    }


    public final static Location Location;

    public final static File Assembler, Headers, LinkerScripts;
    static {
        Location Loc = null;
        for (Location loc: GpUtils.Location.Locations){
            if (loc.isDirectory() && loc.canRead()){
                Loc = loc;
                break;
            }
        }

        Location = Loc;
        Assembler = Loc.getAssembler();
        Headers = Loc.getHeaders();
        LinkerScripts = Loc.getLinkerScripts();
    }
    public final static boolean HasLocation(){
        return (null != Location);
    }
    public final static Location GetLocation(){
        return Location;
    }
    public final static boolean HasAssembler(){
        return (null != Assembler);
    }
    public final static File GetAssembler(){
        return Assembler;
    }
    public final static boolean HasHeaders(){
        return (null != Headers);
    }
    public final static File GetHeaders(){
        return Headers;
    }
    public final static File GetHeader(String pid){
        if (HasLocation())
            return Location.getHeader(pid);
        else
            return new File(pid);
    }
    public final static boolean HasLinkerScripts(){
        return (null != LinkerScripts);
    }
    public final static File GetLinkerScripts(){
        return LinkerScripts;
    }
    public final static File GetLinkerScript(String pid){
        if (HasLocation())
            return Location.getLinkerScript(pid);
        else
            return new File(pid);
    }
    /**
     * @param src Required ASM file 
     * @return May be null for assembler location not found.
     */
    public final static Process Assemble(File src) throws IOException {
        if (null != src && src.isFile()){
            if (HasLocation()){
                String[] cmd = new String[]{
                    Assembler.getPath(),
                    src.getPath()
                };
                return Runtime.getRuntime().exec(cmd);
            }
            else
                return null;
        }
        else
            throw new IllegalArgumentException();
    }
}
