package com.spring.noxml;

import org.springframework.stereotype.Component;

@Component
public class Manger implements MangerInterface {

	@Override
	public void decisionName() {
		System.out.println("Must take bouns to all Employee");
		
	}
	
	
	
	

}
