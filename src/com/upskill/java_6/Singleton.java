package com.upskill.java_6;

public class Singleton {
	
	// Singleton is class that can have only one object

	// Private constructor, it prevents any other from instantiating
	private Singleton(){
	
	}

	//Private static object of the class
	private static Singleton SingletonObj = new Singleton();
	
	public static Singleton getInstance(){
		return Singleton.SingletonObj;
	}
	
	protected static void demo (){
		System.out.println("Demo method for singleton class !!! ");
	}
	//this changes to check git devJoynal
}
