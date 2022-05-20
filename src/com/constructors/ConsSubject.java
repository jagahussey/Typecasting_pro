package com.constructors;

public class ConsSubject {
	
	public ConsSubject() {                             //     non parametetized construtor
	
		System.out.println("jagadesh");
		
	}
	
	public ConsSubject(int num1,  int num2) {             //   parametetized construtor
		
		System.out.println(num1 +"  " + num2);
	}
	
	public  ConsSubject(int height) {                  //  parametetized construtor
		
		System.out.println(height);
	
	}
	public static void main(String[] args) {
		
		ConsSubject  cs1 = new ConsSubject ();
		
		ConsSubject  cs2 = new ConsSubject (55, 100);
		
		ConsSubject  cs3 = new ConsSubject (22);
		
	}

}
