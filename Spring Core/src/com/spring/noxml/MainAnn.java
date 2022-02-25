package com.spring.noxml;

import java.lang.reflect.AnnotatedArrayType;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContextExtensionsKt;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAnn {

	public static void main(String[] args) {
	
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(SpringConfige.class);
		
		Employee employee  = context.getBean("employee",Employee.class);
		
	System.out.println(	employee.getUsername());
	System.out.println(	employee.getEmail());
		
		employee.name();
		employee.getdeision();
		
		
		
		
		
		
		context.close();
		
		
		
		
		
		
		
		
	}

}
