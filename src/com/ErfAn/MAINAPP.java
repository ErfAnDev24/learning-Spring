package com.ErfAn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MAINAPP {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
		HelloWorld obj1 = (HelloWorld) context.getBean("helloWorld");
		Child obj2 = (Child) context.getBean("child");
		
		obj1.getMessage1();
		obj1.getMessage2();
		
		obj2.getMessage1();
		obj2.getMessage2();
		obj2.getMessage3();
	}
}
