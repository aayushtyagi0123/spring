package com.spring.AopProject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.AopProject.services.PaymentServiceImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
        ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/AopProject/config.xml");
      PaymentServiceImpl ps=  context.getBean(PaymentServiceImpl.class);
      ps.makepayment(1000);
    }
}