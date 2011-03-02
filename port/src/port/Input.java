package port;

import hapax.TemplateDataDictionary;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 */
public class Input
    extends hapax.TemplateDictionary
{
    public enum Var {
	clock, arch;

	public final static Var For(String name){
	    try {
		return Var.valueOf(name);
	    }
	    catch (RuntimeException exc){
		return null;
	    }
	}
    }

    private final int clock;
    private final Arch arch;
    private final Header inc;
    private final Lkr lkr;


    public Input(int clock, Arch arch, Header inc, Lkr lkr)
	throws IOException
    {
	super();
	this.clock = clock;
	this.arch = arch;
	this.inc = inc;
	{
	    this.sections.put("registers",inc.registers());
	    this.sections.put("bits",inc.bits());
	    this.sections.put("definitions",inc.definitions());
	    this.sections.put("configs",inc.configs());
	}
	this.lkr = lkr;
	{
	    this.sections.put("gpr",lkr.gpr());
	    this.sections.put("shr",lkr.shr());
	    this.sections.put("pages",lkr.pages());
	    this.sections.put("eprom",lkr.eprom());
	    this.sections.put("config",lkr.config());
	    this.sections.put("idlocs",lkr.idlocs());
	    this.sections.put("sfr",lkr.sfr());
	}
    }


    public void renderComplete(){
    }
    public boolean hasVariable(String name){
	if (null != Var.For(name))
	    return true;
	else
	    return super.hasVariable(name);
    }
    public String getVariable(String name){
	Var var = Var.For(name);
	if (null != var){
	    switch(var){
	    case clock:
		return String.valueOf(this.clock);
	    case arch:
		return this.arch.name();
	    default:
		throw new Error(var.name());
	    }
	}
	else
	    return super.getVariable(name);
    }
}
