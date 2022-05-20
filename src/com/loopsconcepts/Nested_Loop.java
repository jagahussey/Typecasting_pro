package com.loopsconcepts;

public class Nested_Loop {
	
	public static void main(String[] args) {
		
	// for loop
		
//		for (int i=1; i<=10; i=i+1) {
//			
//			System.out.println(i);
//		}
		
		
//		  DO WHILE LOOP
		
//		int i = 10;                              // initailze                 
//		do {
//		    System.out.println(i);             // instruction
//		    i--;                               // iteration
//		} while (i>=1);                       // while condition
//		}
//		
//	}
		
for (int i = 1; i<=5; i++) {
			
			for (int j = 1; j<i; j++) {
				
				System.out.println(" ");
				
			}
			
                for (int j=i; j<=5; j++) {
				
				System.out.println("* ");
			
		}
                
                System.out.println();
		
	}

	}
}


