package com.ErfAn;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class HelloWorld {
	
	private String message;
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	public void getMessage() {
		System.out.println("Your message is : "+message);
	}
	
}
