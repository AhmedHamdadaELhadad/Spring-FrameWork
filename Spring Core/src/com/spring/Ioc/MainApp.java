package com.spring.Ioc;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class MainApp {

	public static void main(String[] args) {
		

		
	
		
		try (ClassPathXmlApplicationContext  con = new ClassPathXmlApplicationContext("applicationContext.xml")) {
			
			 Animal a=con.getBean("myAnmail", Animal.class);
			 a.eat();
		
			 con.close();
			 
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
		
		
		
		
		
		/*	Animal cat=new Cat();
		cat.eat();
		
		Animal dog=new Dog();
		dog.eat();*/
		
	}


