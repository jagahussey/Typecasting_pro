package com.onlyabstration;

public class NissanShowrom extends Nissan {

	@Override
	public void car() {
		
		System.out.println("1996");
		
		
	}

	@Override
	public void carmodel() {
		
		super.carmodel();
		
		
		
	}
	
	public static void main(String[] args) {
		
		NissanShowrom obj = new NissanShowrom();
		obj.car();
		obj.carmodel();
		
	}

}
