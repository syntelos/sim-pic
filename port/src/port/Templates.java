package digi.mv2mic;

import hapax.Template ;
import hapax.TemplateException ;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class Templates
    extends hapax.TemplateResourceLoader
{
    public final static Templates Instance = new Templates();


    private Templates(){
	super("/");
    }

    public void generate(Input input, File target)
	throws TemplateException, IOException
    {

	Template template = this.getTemplate(Options.Instance.getLanguage().name());

	PrintWriter out = new PrintWriter(new OutputStreamWriter(new FileOutputStream(target),"US-ASCII"));
	try {

	    template.render(input,out);
	}
	finally {
	    out.flush();
	    out.close();
	}
    }
    public void generate(Input input, String tn, File target)
	throws TemplateException, IOException
    {

	Template template = this.getTemplate(tn);

	PrintWriter out = new PrintWriter(new OutputStreamWriter(new FileOutputStream(target),"US-ASCII"));
	try {

	    template.render(input,out);
	}
	finally {
	    out.flush();
	    out.close();
	}
    }
}
