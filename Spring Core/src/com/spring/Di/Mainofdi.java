package com.spring.Di;

import org.springframework.beans.BeansException;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Mainofdi {

	public static void main(String[] args) {
	
		
		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext ("context.xml")) {
			Person person=context .getBean("person", Person.class);
			person.name();
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
