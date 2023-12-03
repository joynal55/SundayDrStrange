package com.upskill.java_4;

import com.upskill.java_1.MethodType;

public class Polymorphism extends MethodType{

	public static void main(String[] args) {
		car(4);	
		
		Polymorphism obj = new Polymorphism();
		obj.annualIncomeVoid();
	}
	
	public void annualIncomeVoid(){
		int pastAnnualIncome = 130000;
		int rentalIncome = 18000;
		int sideIncome = 15000;
		int bonus = 25000;
		int newIncome = pastAnnualIncome + rentalIncome + sideIncome + bonus;
		System.out.println("My Annual Income = " + newIncome);
	}

	public static void car(){
		System.out.println("My car is a Tesla ");
	}

	public static void car(String Color){
		System.out.println("My car is Tesla, its color is " + Color);	
	}
	
	public static void car(String Color, String Seat){
		System.out.println("My car is Tesla, It has seat" + Seat);
		}
	
	public static void car(int door){
			System.out.println("My car is Tesla, It has door " + door);
		
		
	}
}

