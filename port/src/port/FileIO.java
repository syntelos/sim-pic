package port;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.IOException;


public abstract class FileIO
{

    public final static String BaseName(File file){
	String string = file.getName();
        int idx = string.lastIndexOf('.');
        if (0 < idx)
            return string.substring(0,idx).toUpperCase();
        else
            throw new IllegalArgumentException(string);
    }
    public final static String[] ReadLines(File file)
	throws IOException
    {
	BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file),"US-ASCII"));
	try {
	    String[] list = null;
	    String line;
	    while (null != (line = reader.readLine())){
		line = line.trim();
		if (0 < line.length() && '#' != line.charAt(0)){
		    if (null == list)
			list = new String[]{line};
		    else {
			final int len = list.length;
			String[] copier = new String[len+1];
			System.arraycopy(list,0,copier,0,len);
			copier[len] = line;
			list = copier;
		    }
		}
	    }
	    return list;
	}
	finally {
	    reader.close();
	}
    }
}
