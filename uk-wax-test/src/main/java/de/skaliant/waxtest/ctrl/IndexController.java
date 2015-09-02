package de.skaliant.waxtest.ctrl;

import javax.servlet.http.HttpServletRequest;

import de.skaliant.wax.results.Result;

/**
 * 
 *
 * @author Udo Kastilan
 */
public class IndexController
{
	private String what = null;
	
	
	public String index()
	{
		return "index";
	}
	
	
	public String other()
	{
		return "other";
	}
	
	
	public Object answer(HttpServletRequest req)
	{
		if (what != null)
		{
			req.setAttribute("what", what);
		}
		return Result.redirect(getClass(), "index").build();
	}
	
	
	public void setWhat(String what)
	{
		this.what = what;
	}
}
