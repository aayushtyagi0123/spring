package com.springcore.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 ApplicationContext context=	new ClassPathXmlApplicationContext("com/springcore/ci/ciconfig.xml");
     Person p=(Person)context.getBean("person");
     System.out.println(p);
     
               Addition a=(Addition)context.getBean("add");
                              a.dosum();
	}

}
