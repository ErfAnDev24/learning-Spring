package com.ErfAn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MAINAPP {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
		System.out.println("Hi");
		
		HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
		Hello2World obj2 = (Hello2World) context.getBean("hello2World");
		
		
	}
}
