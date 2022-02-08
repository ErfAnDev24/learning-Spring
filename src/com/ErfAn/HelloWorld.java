package com.ErfAn;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class HelloWorld {
	
	private Child child;
	
	@Autowired
	@Qualifier("child1")
	public void setChild(Child child) {
		this.child = child;
	}
	
	public void print() {
		child.setName("ErfAn");
		System.out.println("your child name is : "+child.getName());
	}
}
