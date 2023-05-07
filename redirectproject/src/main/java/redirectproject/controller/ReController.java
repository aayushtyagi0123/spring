package redirectproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;


@Controller
public class ReController {

	@RequestMapping("/search/{id}/{username}")

	public String redirect(@PathVariable()int id,String username)
	{
	 
	return "search";
	}
	
	public RedirectView handler(@RequestParam("keyword") String query)
	{
		String str="https://www.google.com/search?q="+query;
		RedirectView rv=new RedirectView();
		rv.setUrl(str);
		return rv;
	}
	
	@ExceptionHandler(value=Exception.class)
	public String handlers()
	{
		return "exceptionhandler";
	}
	
	
}