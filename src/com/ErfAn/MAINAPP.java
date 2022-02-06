package com.ErfAn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MAINAPP {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
		HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
		
		obj.setMessage("Hello world!");
		obj.getMessage();
		
		HelloWorld obj2 = (HelloWorld) context.getBean("helloWorld");
		obj2.getMessage();
		
	}
}
