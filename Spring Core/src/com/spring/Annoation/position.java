package com.spring.Annoation;

import org.springframework.stereotype.Component;

@Component
public class position implements positionInterface {

	@Override
	public void namePosition() {
		System.out.println("junior");
		
	}

}
