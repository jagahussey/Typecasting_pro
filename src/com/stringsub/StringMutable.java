package com.stringsub;

public class StringMutable {  

	public static void main(String[] args) {  
		
		StringBuffer ss1 = new StringBuffer("uncle");  
		
		StringBuffer ss2 = new StringBuffer("uncle");
		
		System.out.println(System.identityHashCode(ss1));
		
		System.out.println(System.identityHashCode(ss2));
		
		System.out.println(ss1.append(ss2));
		
		System.out.println(System.identityHashCode(ss2.append(ss1)));
		

	}

}
