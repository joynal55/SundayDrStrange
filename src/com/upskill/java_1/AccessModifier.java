package com.upskill.java_1;

public class AccessModifier {
	
	public String name = "joynal";				// public - any class can access
	
	private int age = 36;						// private - only same class can access
	
	protected int ssn = 123456;					// protected - classes in the same package and subclass
	
	String address = "Heritage Tower";			// default - class in same package can access
	
}