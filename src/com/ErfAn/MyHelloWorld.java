package com.ErfAn;

public class MyHelloWorld {

	private String message;
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	public void getMessage() {
		System.out.println("Your message is : "+message);
	}
	
	public void destroy() {
		System.out.println("Myyyydestruction!");
	}
	
	public void init() {
		System.out.println("Myyyyyinitialization!");
	}

	
}
