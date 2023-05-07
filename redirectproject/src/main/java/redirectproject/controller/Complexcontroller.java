package redirectproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import redirectproject.Model.Student;

@Controller
public class Complexcontroller {

	@RequestMapping("/complex")
	public String form()
	{
		return "complex_form";
		
	}
	
	@RequestMapping(path="/handlerform",method=RequestMethod.POST)
	public String handler(@ModelAttribute Student student,BindingResult result)
	{
		
		if(result.hasErrors())
		{
			return "complex_form";
		}
		System.out.println(student);
		return "success";
	}
	
	
	
}


