package com.stringsub;

public class StringTypes {
	
	public static void main(String[] args) {
		
	//	immutable string
		
		String s1 = "Stalin"  ;
		String s2 =  "Stalin" ;
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		System.out.println(s1 + s2);
		System.out.println(System.identityHashCode(s1+s2));
		
	}

}
