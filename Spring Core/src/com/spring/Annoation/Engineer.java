package com.spring.Annoation;

import org.springframework.stereotype.Component;

@Component
public class Engineer implements Human {

	@Override
	public void workName() {
		System.out.println("I am work as Engineer");
		
	}

}
