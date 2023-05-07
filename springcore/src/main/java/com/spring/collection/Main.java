package com.spring.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/collection/collectionconfig.xml");
	                      Emp Emp1=(Emp)context.getBean("Emp1");
	                      System.out.println(Emp1.getName());
	                      System.out.println(Emp1.getPhones());
	                      System.out.println(Emp1.getAddress());
	                      System.out.println(Emp1.getCourses());
	                      System.out.println(Emp1.getProps());
	                      
	}

}
;