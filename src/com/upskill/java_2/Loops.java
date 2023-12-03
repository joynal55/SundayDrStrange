package com.upskill.java_2;

public class Loops {
	
/*
 * Type of Loops
  	1. For Loop
  	2. While Loop
  	3. Do While Loop
  	4. Infinite Loop
 */

	public static void main(String[] args) {
	//practiceForLoop();
	//practiceWhileLoop ();
	//practiceDoWhileLoop();
	//preacticeNestedForLoop();
	}
	
	public static void practiceForLoop(){						// for loop - do again and again up to the upper limit
		int i;													// Initialize the variable
		for (i=1; i<=10; i++){									// setting lower limit, upper limit, increment or decrement
			System.out.println("For Loops number = " + i);		// statement
		}
	}

		public static void practiceWhileLoop (){					//while loop - do again and again upto condition match
			int i = 1;												//initialize the variable
			while (i<10){											//setting condition
				System.out.println("While Loops number = " + i);	// statement
				i++;												// increment or decrement
			}
			
		}
		
		public static void practiceDoWhileLoop(){					// Do While Loop - do action then match condition
			int i = 1;												// Initialize the variable
			do{														
				System.out.println("Do While Loops number = " + i);	//statement
				i++;												// Increment or Decrement
			} while (i<=10);										// checking condition
			
		}

		public static void practiceInfiniteLoop(){						// Infinite Loop - never ending
			int i;													// Initialize the variable
			for (i=1; i<=10; i++){									// setting no upper limit
				System.out.println("Infinite Loops number = " + i);		// statement
			}
		}
		
		public static void practiceNestedForLoop(){					//Nested Loop - loop inside another loop
			int i;													//Initialize i for loop 1
			int j;													//Initialize j for loop 2
			for (i=1; i<=10; i++){									//First loop for i
				for (j=1; j<=10; j++){								//Second loop for j
					int multipicationTable = i * j;					//Statement for loop 2
					System.out.print(multipicationTable + " ");
				}
			  System.out.println(" ");								//Statement for loop 1
			}
		}

}