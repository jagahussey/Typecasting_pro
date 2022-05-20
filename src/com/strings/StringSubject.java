package com.strings;

public class StringSubject {
	
	public static void main(String[] args) {
		
	
		
		String s = "Welcome To Java";
		
		int len= s.length();  				//(1) length
		
		System.out.println(len);
		
		boolean equ = s.equals("Welcome To Java");        //(2) equal
		
		
		System.out.println(equ);
		
		boolean equign = s.equalsIgnoreCase("Welcome to java");     //(3) equalignore
		
		System.out.println(equign);
		
		String up = s.toUpperCase();                            //(4)  touppercase
		
		System.out.println(up);
		
	String low= s.toLowerCase();
	
	System.out.println(low);             						//(5) toloweercase
	
	boolean star = s.startsWith("Welcome To Java");
	
	System.out.println(star);									//(6) starswith
	
	boolean ends = s.endsWith("Welcome To Java");
	
	System.out.println(ends);   								// (7) Endswith
	
	boolean cont = s.contains("To");
	
	System.out.println(cont);									//(8) contains
	
	int ind= s.indexOf("T");
	
	System.out.println(ind);									// (9) indexof
	
	int lastIn = s.lastIndexOf("a");
	
	System.out.println(lastIn);  								//(10) lastindex
	
	char cha= s.charAt(5);
	
	System.out.println(cha);  									//(11) charAt
	
	String rep= s.replace("Java", "Jaga");
	
	System.out.println(rep);  									//(12) replace
	
	boolean empty = s.isEmpty();
	
	System.out.println(empty);  								// (13) empty
	
	String sub= s.substring(7);
	
	System.out.println(sub);  									//(14) substring
	
	String trim = s.trim();
	
	System.out.println(trim);  									//(15) trim
	
	String[] sp= s.split("Java");
	
	for (String x : sp) {
	
	System.out.println(x);  									//(16) split
		
	}
		
		
		
		
	}

}
