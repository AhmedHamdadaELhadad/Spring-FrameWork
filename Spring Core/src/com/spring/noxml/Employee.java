package com.spring.noxml;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee implements EmployeeInterface{

	@Autowired
	@Qualifier("consultative")
	private MangerInterface manger;
	
	@Value("${us.name}")
	private String username;
	
	
	@Value("${us.email}")
	private String email;
	
	
	
	
	


	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public void name() {
		System.out.println("I am Engineering");
		
	}

	@Override
	public void getdeision() {
		manger.decisionName();
		
	}


	
	
	
	
	

}
	
	

