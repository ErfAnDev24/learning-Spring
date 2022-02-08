package com.ErfAn;

import org.springframework.stereotype.Component;

public class Child {

	public Child() {
		System.out.println("Child");
	}
	
	public void destroy() {
		System.out.println("destroy Child!");
	}
	
	public void init() {
		System.out.println("init Child!");
	}
}
