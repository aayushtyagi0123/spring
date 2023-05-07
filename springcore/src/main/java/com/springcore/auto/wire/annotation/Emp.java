package com.springcore.auto.wire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {

	@Autowired
	@Qualifier("address")
	private Address address;

	public Address getAddress() {
		return address;
	}

	
	public void setAddress(Address address) {
		System.out.println("setting method");
		this.address = address;
	}

	
	public Emp(Address address) {
		super();
		System.out.println("Inside constructor");
		this.address = address;
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}
	
	
	
}
