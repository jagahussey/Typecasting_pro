package com.loopsconcepts;

public class NestedLoops {
	
	public static void main(String[] args) {
		
		
		
		for (int i = 1; i<=5; i++) {
			
			for (int j = 1; j < i; j++) {
				
				System.out.println(" ");
			}
                for (int j=i; j<=5; j++) {
				
				System.out.println("* ");
			
		}
                
                System.out.println();
		
	}

	}
}
