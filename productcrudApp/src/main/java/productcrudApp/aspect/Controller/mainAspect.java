package productcrudApp.aspect.Controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class mainAspect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  ApplicationContext context=new ClassPathXmlApplicationContext("productcrudApp/aspect/Controller/config.xml");
	      aspectController ac=  context.getBean(aspectController.class);
	      ac.registerpage();

	}

}
