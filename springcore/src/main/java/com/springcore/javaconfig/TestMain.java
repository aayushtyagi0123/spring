package com.springcore.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext con=new AnnotationConfigApplicationContext(javaconfig.class);
		 Student student=con.getBean("student",Student.class);
		student.study();
	}

}
