package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext con=new ClassPathXmlApplicationContext("com/springcore/stereotype/stereotypeconfig.xml");
		Student student=con.getBean("ob",Student.class);
		System.out.println(student);
		
		Student student2=con.getBean("ob",Student.class);
		
		System.out.println(student.hashCode());
		System.out.println(student2.hashCode());
		
		
	}

}
