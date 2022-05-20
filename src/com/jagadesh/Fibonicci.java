package com.jagadesh;

import java.util.Scanner;

public class Fibonicci {
	
	public static void main(String[] args) {
		
		int k, a=1, b=1;
 //		Scanner sc = new Scanner(System.in);
		
		k=0;
	//	System.out.println("Enter Any Number");
		
	//	int nl = sc.nextInt();
		
		System.out.print("1 1 ");
	//	while(k<=nl)
		while(k<=100)
		{
			k=a+b;
			System.out.print(k + " ");
			a=b;
			b=k;
		}
		
	}

}
