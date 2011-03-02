package port;

import java.io.File;


public abstract class FileIO
{

    public final static String BaseName(File file){
	String string = file.getPath();
        int idx = string.lastIndexOf('.');
        if (0 < idx)
            return string.substring(0,idx).toUpperCase();
        else
            throw new IllegalArgumentException(string);
    }
}
