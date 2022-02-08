package com.ErfAn;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
@Scope()
public class Child {

	private String message;
	
	
	public void getMessage() {
		System.out.println("your message is : "+message);;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
}
