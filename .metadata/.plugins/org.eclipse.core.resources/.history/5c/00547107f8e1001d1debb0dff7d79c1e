package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class ReController {

	@RequestMapping("/one")
	public RedirectView One()
	{
		System.out.println("first handler");
		RedirectView rv=new RedirectView();
		rv.setUrl("enjoy");
		return rv;
	}
	
	@RequestMapping("/enjoy")
	public String second()
	{
		System.out.println("second handler!");
		return "contact";
		
	}
}
