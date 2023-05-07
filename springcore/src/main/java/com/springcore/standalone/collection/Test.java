package com.springcore.standalone.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext con=new ClassPathXmlApplicationContext("com/springcore/standalone/collection/aloneconfig.xml");
                  Person p1=con.getBean("p1",Person.class);
                  System.out.println(p1);
                  System.out.println(p1.getFriends().getClass().getName());
	}

}
