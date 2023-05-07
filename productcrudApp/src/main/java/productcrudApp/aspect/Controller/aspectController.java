package productcrudApp.aspect.Controller;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import productcrudApp.Controller.ProductController;

@Aspect
public class aspectController {

	
	
	@Before("execution(* productcrudApp.Controller.*.*(..))")
	public String registerpage()
	{
		System.out.println("project start...");
		return "Register_login";
	}
	
	
}
