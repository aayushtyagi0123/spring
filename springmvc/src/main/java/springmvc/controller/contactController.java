package springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc.model.User;
import springmvc.service.UserService;

@Controller
public class contactController {

	@Autowired
	private UserService userService;
	
	@ModelAttribute
	public void commmontext(Model m)
	{
		
		m.addAttribute("Header","Welcome to ur web application");
		System.out.println("commmon");
	}
	@RequestMapping("/contact")
	public String displayForm()
	{
		System.out.println("displayForm");
		return "contact";
	}
	
	
	@RequestMapping(path="/userform",method=RequestMethod.POST)
	public String handleForm(
			@ModelAttribute User user,
			Model m
			)
	{
		
		int id=this.userService.createUser(user);
		m.addAttribute("id",id);
		System.out.println(id);
		return "success";
	}
	
	
	
}
