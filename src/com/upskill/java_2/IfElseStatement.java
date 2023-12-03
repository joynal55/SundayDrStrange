package com.upskill.java_2;

public class IfElseStatement {					 

	public static void main(String[] args) {
		
		int age = 20;
		
		if (age < 13){
			System.out.println("you are children");			// start with if
			
		} else if (age >=13 && age < 18){					// everything in the middle should be else if
			System.out.println("you are teenager");
		
		} else if (age >= 65){
			if (age >=100){
				System.out.println("you are champian");
			}
			System.out.println("you are senior");
			
		} else {
			System.out.println("you are adult");			// and with else
		}

	}

}