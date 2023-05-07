package com.springcore.ci;

import java.util.List;

public class Person {

	private String name;
	private int personId;
	private Cert cert;
	private List<String> list;
	public Person(String name, int personId,Cert cert,List<String> list) {
		
		this.name = name;
		this.personId = personId;
		this.cert=cert;
	    this.list=list;	
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", personId=" + personId + ", cert=" + cert + ", list=" + list + "]";
	}
	
	

	
	
	
	
	
	
	
	
}
