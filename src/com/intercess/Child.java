package com.intercess;

public class Child implements Father, Mother {

	@Override
	public void helicopter() {
		
		System.out.println("super helic");
		
	}

	@Override
	public void bike() {
		
		System.out.println("racer bike");
	}

	@Override
	public void aeroplane() {
		
		System.out.println("super aero");
		
	}

	@Override
	public void car() {
		
		System.out.println("BENZ Car");
		
	}
	
	public static void main(String[] args) {
		
		Child objj = new Child();
		objj.aeroplane();
		objj.car();
		objj.bike();
		objj.helicopter();
		
	}

}
