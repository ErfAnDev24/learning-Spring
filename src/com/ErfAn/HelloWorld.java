package com.ErfAn;

import javax.annotation.PostConstruct;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class HelloWorld{
	
	private String message;
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	public void getMessage() {
		System.out.println("Your message is : "+message);
	}
	
	public void destroy() {
		System.out.println("destruction!");
	}
	
	public void init() {
		System.out.println("initialization!");
	}

	
	
}
