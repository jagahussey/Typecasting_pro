package com.iteration;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIterator {
	
	public static void main(String[] args) {
		
//		ArrayList<String> car  =  new  ArrayList<String>();
//		
//		car.add("ford");
//		car.add("HONDA");
//		car.add("ford");
//		car.add("audi");
//		
//		
//		Iterator<String> iter= car.iterator();
//		
//		System.out.println(iter.next());
//		
		
		
		ArrayList<Integer> car  =  new  ArrayList<Integer>();
		
		car.add(100);
		car.add(150);
		car.add(200);
		car.add(250);
		
		
		Iterator<Integer> iter= car.iterator();
		
		while(iter.hasNext()) {
			
			int i  =  iter.next();
			if(i>200) {
				iter.remove();
			}
		}
		
		System.out.println(car);
		
		
	}

}
