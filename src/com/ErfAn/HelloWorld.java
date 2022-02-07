package com.ErfAn;

public class HelloWorld {

	private Child child;
	
	public void setChild(Child child) {
		System.out.println("setSpellChecker");
		this.child = child;
	}
	
	public void childCheck() {
		child.childChecker();
	}
	
	
}
