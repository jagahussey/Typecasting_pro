package com.scansubjets;

   import java.util.Scanner;                  

public class AppName {

	public static void main(String[] args) {

		Scanner Rcc = new Scanner(System.in);
	

		System.out.println("Enter App Name");

		 String name = Rcc.nextLine();
		 
		 System.out.println("App Name Is " + name);
		 
		 System.out.println("Enter Product Name");
		 
		String product = Rcc.next();
		
		System.out.println("Product Name Is " + product);
		
		System.out.println("Enter Product Price");
		
		int price = Rcc.nextInt();
		
		System.out.println("Product Price Is " + price);
		
		System.out.println("Enter Discount Price");
		
		float discount = Rcc.nextFloat();
		
		System.out.println("Discount Price Is " + discount);
		
		System.out.println("Enter Flipcart Symbol");
		
		char symbol = Rcc.next().charAt(0);
		
		System.out.println("Flicart Symbol Is " + symbol);
	}

}
