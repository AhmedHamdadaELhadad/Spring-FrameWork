package com.spring.Annoation;

import org.springframework.beans.BeansException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAnn {

	public static void main(String[] args) {
	
		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext ("annotaioncontext.xml")) {
			MasterInterface master=context .getBean("master", MasterInterface.class);
			//master.getPosition();	master.nameTitle();
			master.getNamework();
			
		} catch (BeansException e) {
			
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
	}

}
