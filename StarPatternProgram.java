package org.org;

public class StarPatternProgram{

	public static void main(String[] args) {

	int rows = 5;
	
	//Outer loop for rows
	
	for (int i = 1; i <= rows; ++i) { 
		
		//Inner loop for Column
	
		for (int j = 1; j <= i; ++j) {

	System.out.print("*"); 

	}

	System.out.println(); 

	}

	}

}
