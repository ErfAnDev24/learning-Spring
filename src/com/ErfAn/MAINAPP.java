package com.ErfAn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public abstract class MAINAPP {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = 
				new AnnotationConfigApplicationContext(BeansConfiguration.class);
		
		Child child = context.getBean(Child.class);
		SecondChild child2 = context.getBean(SecondChild.class);
		
		context.registerShutdownHook();
	}
}
