package com.ErfAn;

import javax.annotation.PostConstruct;

public class HelloWorld {
	
	private String message;
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	public void getMessage() {
		System.out.println("your message is : " + message);
	}
	
}
