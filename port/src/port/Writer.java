package port;

import java.io.PrintWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;


public abstract class Writer
    extends FileIO
{

    private final static String CS = "ISO-8859-1";


    protected Writer(){
        super();
    }


    public void write(File file) throws IOException {
        PrintWriter w = new PrintWriter(new OutputStreamWriter(new FileOutputStream(file),CS));
        try {
            this.write(w);
        }
        finally {
            w.close();
        }
    }
    public abstract void write(PrintWriter r) throws IOException;    

}
