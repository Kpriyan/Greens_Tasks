package com.daily.cls;

// child

public class B extends A {
	
	String  JAVA;
	String Application;
	
	public B() {
		
		this.JAVA = "Programming";
		this.Application="google";
		
		//super();
		
		System.out.println("B");
		
		
	}
	


	public static void main(String[] args) {
		B obj = new B();
		
	System.out.println(obj.JAVA);
	System.out.println(obj.Application);
	
		

	}

}
