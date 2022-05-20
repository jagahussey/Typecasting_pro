package com.collections;

import java.util.ArrayList;
import java.util.List;

public class CollectionList {
	
	public static void main(String[] args) {
	
		List<Object> cc1 = new ArrayList<Object>();
		
		//  LIST TYPE
		// 1) ADD 
		
		cc1.add("kamesh");
		
		cc1.add(1992);
		
		cc1.add(5.6);
		
		cc1.add('s');
		
		System.out.println(cc1);
		
		// 2) SIZE
		
	//	int si = cc1.size();
		
	//	System.out.println(si);
		
		//  3) GET
		
	//	Object obj = cc1.get(3);
		
	//	System.out.println(obj);
		
		//  4)  SET
		
	// cc1.set(3, "jagadesh");
		
	//	System.out.println(cc1);
		
		//  5)  REMOVE
	//	
	//	cc1.remove(2);
		
		 //System.out.println(cc1);
		
		//   6)  INDEXOF
		
	////	int ind = cc1.indexOf("kamesh");
		
	//	System.out.println(ind);
		
		//  7) contains
		
	//	boolean con = cc1.contains('s');
		
	//	System.out.println(con);
		
		//  8)  CLEAR
		
	//	cc1.clear();
		
	//	System.out.println(cc1);
	//	
		// second add all
		
		List<Object>  cc2 = new ArrayList<Object>();
		
	cc2.add("suesh");
	cc2.add(1990);
	cc2.add(5.1);
	cc2.add('s');
	
	
	//  9) ADDALL
	
	cc1.addAll(cc2);
	
	System.out.println(cc1);
	
	// 10) RETAINALL
	
//	cc2.retainAll(cc1);
	
//	System.out.println(cc2);
	
	// 11) REMOVEALL
	
	cc2.removeAll(cc1);
	
	System.out.println(cc2);
	
	
	
	
	
	
	
	
		
		
		
		
		
		
		
		
	}

}
