package com.spring.AopProject.services;

public class PaymentServiceImpl implements PaymentService{

	public void makepayment(int amount) {
		// TODO Auto-generated method stub
		System.out.println("Payment debit"+amount);
		//
		//
		System.out.println("Payment credit"+amount);
	}

	

}
