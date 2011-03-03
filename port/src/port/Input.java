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
	name, clock, arch;

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
	List<TemplateDataDictionary> list;
	{
	    list = inc.registers();
	    if (0 < list.size())
		this.sections.put("registers",list);
	    list = inc.bits();
	    if (0 < list.size())
		this.sections.put("bits",list);
	    list = inc.definitions();
	    if (0 < list.size())
		this.sections.put("definitions",list);
	    list = inc.configs();
	    if (0 < list.size())
		this.sections.put("configs",list);
	}
	this.lkr = lkr;
	{
	    list = lkr.gpr();
	    if (0 < list.size())
		this.sections.put("gpr",list);
	    list = lkr.shr();
	    if (0 < list.size())
		this.sections.put("shr",list);
	    list = lkr.pages();
	    if (0 < list.size())
		this.sections.put("pages",list);
	    list = lkr.eedata();
	    if (0 < list.size())
		this.sections.put("eedata",list);
	    list = lkr.config();
	    if (0 < list.size())
		this.sections.put("config",list);
	    list = lkr.idlocs();
	    if (0 < list.size())
		this.sections.put("idlocs",list);
	    list = lkr.sfr();
	    if (0 < list.size())
		this.sections.put("sfr",list);
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
	    case name:
		return this.inc.name;
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
