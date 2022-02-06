package com.ErfAn;

import javax.annotation.PostConstruct;

public class HelloWorld {
	
	
	@PostConstruct
	public void MyMethod() {
		System.out.println("Second");
	}
	
}
