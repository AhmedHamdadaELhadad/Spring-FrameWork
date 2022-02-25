package com.spring.Annoation;

import org.springframework.stereotype.Component;

@Component
public class Doctor implements Human  {

	@Override
	public void workName() {
		System.out.println("I am work as Doctor");
		
	}

}
