package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.ci.Person;

public class Life {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context=	new ClassPathXmlApplicationContext("com/springcore/lifecycle/lifecycleconfig.xml");
	     //Pepsi p=(Pepsi)context.getBean("p1");
	     //System.out.println(p);
	     ((AbstractApplicationContext) context).registerShutdownHook();
	        Example e1=(Example)context.getBean("example");
	        System.out.println(e1);

	}

}
