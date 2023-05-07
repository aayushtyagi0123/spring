package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class javaconfig {

	
	
	@Bean
	public Samosa getSamosa()
	{
		return new Samosa();
	}
	@Bean("student")
	public Student getStudent()
	{
		Student student=new Student(getSamosa());
		return student;
	}
}
