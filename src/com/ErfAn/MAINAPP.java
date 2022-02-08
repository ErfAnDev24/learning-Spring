package com.ErfAn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public abstract class MAINAPP {

	public static void main(String[] args) {
		
		ApplicationContext context = 
				new AnnotationConfigApplicationContext(BeansConfiguration.class);
		
		Child child = context.getBean(Child.class);
		SecondChild child2 = context.getBean(SecondChild.class);
		
	}
}
