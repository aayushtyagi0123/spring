package springmvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping("/index")
	public String display(Model m)
	{
		m.addAttribute("name","Aayush Tyagi");
		List<String> friends=new ArrayList<String>();
		friends.add("sohan");
		friends.add("mohan");
		friends.add("kriti");
		friends.add("kavata");
		m.addAttribute("f", friends);
		m.addAttribute("Id",1234);
		System.out.println("This is controller page");
		return "index";
	}
	
	@RequestMapping("/help")
	public ModelAndView helppage()
	{
	  
		ModelAndView modelview=new ModelAndView();
		modelview.addObject("name","komal");
		modelview.addObject("Id",2345);
		LocalDateTime time=LocalDateTime.now();
		modelview.addObject("Time",time);
		modelview.setViewName("help");
		
		return modelview;
		
		
		
	}
}
