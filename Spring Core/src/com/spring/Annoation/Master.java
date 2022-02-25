package com.spring.Annoation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("master")
public class Master implements MasterInterface{
	
	
	@Autowired
	@Qualifier("engineer")
	private Human human;
	
	
	
	





	@Autowired
	private positionInterface interface1;
	
	
	
	/*
	@Autowired
	public Master(positionInterface interface1) {
		
		this.interface1 = interface1;
	}
*/
	
	
	
	/*
	@Autowired
	public positionInterface getInterface1() {
		return interface1;
	}*/






	public void setInterface1(positionInterface interface1) {
		this.interface1 = interface1;
	}



   


	@Override
	public void nameTitle() {
		System.out.println("I am SoftwareEngineering");
		
	}
	
	
	public void getPosition () 
	{
	
	interface1.namePosition();
	
	
	
	}

	@PostConstruct
		public void init() {
			System.out.println("hell0");
			
		}


	@Override
	public void getNamework() {
	
		human.workName();
	}
	
	
	
	
	@PreDestroy
		public void finsh() {
			System.out.println("Finssshh");
			
		}
}
	
	

