package com.collections;

import java.util.HashSet;
import java.util.Set;

import javax.print.attribute.HashAttributeSet;

public class SetClass {                     //  SET (Interface)

	public static void main(String[] args) {
		
		Set<Integer> se1 =  new HashSet<Integer>();
		
		se1.add(25);
		se1.add(35);
		se1.add(45);
		se1.add(55);
		
		System.out.println(se1);
		
		//  Size
		
	//	int si = se1.size();
		
	//	System.out.println(si);
		
		//   contains
		
	//	boolean con = se1.contains(25);
		
	//	System.out.println(con);
		
		//   clear
		
	//	se1.clear();
		
	//	System.out.println(se1);
		
		//   empty
		
	//	boolean em = se1.isEmpty();
		
	//	System.out.println(em);
	//	
		//ADDALL
		
		Set<Integer> se2 = new HashSet<Integer>();
		
		se2.add(25);
		se2.add(35);
		se2.add(45);
		se2.add(400);
		
		se1.addAll(se2);
		
		System.out.println(se1);
		
		// retainall
		
	//	se2.retainAll(se1);
		
	//	System.out.println(se1);
		
		//  removeall
		
	//	se2.removeAll(se1);
		
	//	System.out.println(se1);
		
		
		
		
		
		
		

	}

}
