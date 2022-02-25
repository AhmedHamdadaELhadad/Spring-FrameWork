package com.spring.Di;

public class Person  implements PersonType{

	
	private User usertype;
	
	public Person(User usertype){
		
		this.usertype=usertype;
		
		
	}
	
	@Override
	public void name() {
		System.out.println("Name "+usertype.getName());
		System.out.println("Email "+usertype.getEmail());
		
	}

	

	@Override
	public void getpersontype() {
		usertype.type();
		
	}
	
}
