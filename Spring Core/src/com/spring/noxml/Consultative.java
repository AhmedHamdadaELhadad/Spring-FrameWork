package com.spring.noxml;

import org.springframework.stereotype.Component;

@Component
public class Consultative  implements MangerInterface{

	@Override
	public void decisionName() {
		System.out.println("50% increasing Salary for Engineer");
		
	}

}
