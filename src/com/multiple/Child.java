package com.multiple;

public class Child extends Father{

	
	int a;
	int b;
	
	
	public Child(int a, int b) {
		
		this.a = a;
		this.b = b;
		
	}
	
	public static void main(String[] args) {
		
		Child c = new Child(1,2);
		
		
		System.out.println(c.a + " " + c.b);
	}
	
}
