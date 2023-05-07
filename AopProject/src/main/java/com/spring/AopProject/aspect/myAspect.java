package com.spring.AopProject.aspect;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before; 

@Aspect
public class myAspect {

	@Before("execution(* com.spring.AopProject.services.PaymentServiceImpl.*(..))")
	public void beforepayment()
	{
        System.out.println("Payment started..");		
	}
	
	@After("execution(* com.spring.AopProject.services.PaymentServiceImpl.*(..))")
	public void afterpayment()
	{
        System.out.println("Payment done..");		
	}
}
