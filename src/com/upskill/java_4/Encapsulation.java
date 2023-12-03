package com.upskill.java_4;

public class Encapsulation {
	
	//Encapsulation used to hide the data using setter and getter method

	private String name = "UpSkill";				//write and read
	private int ssn = 123456;						//write only
	private String username = "raselalam";			//read only
	
	
	//Setter Method - ssn							//setter data, write
	public void setSSN(int value){
		ssn = value;
	}
	
	//Getter Method - username						//get the data, read
	public String getUserName(){
		return username;	
	}
	
	public void setName(String value){
		name = value;
	}
	public String getName(){
			return name;
	}
	
	public static void main(String[] args) {
		Encapsulation obj = new Encapsulation ();
		System.out.println(obj.getName());
		System.out.println(obj.getUserName());
		
		obj.setName("joynal");
		obj.setSSN(123456);
	
	}
}
