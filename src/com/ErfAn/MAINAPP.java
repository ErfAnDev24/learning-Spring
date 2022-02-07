package com.ErfAn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public abstract class MAINAPP {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
		HelloWorld obj1 =(HelloWorld) context.getBean("helloWorld");
		
		obj1.getAddressList();
		
		obj1.getAddressSet();
		
		obj1.getAddressMap();
		
		obj1.getAddressProps();
	}
}
