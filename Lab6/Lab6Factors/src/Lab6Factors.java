/*
Name: Zimo Chai
Lab Section: 1
Lecture Section: 
Date: 9/29/2016
Assignment: 
Description:
*/

import java.util.Scanner;

public class Lab6Factors
{
	
	public static void main(String[] args) 
	{
		System.out.print("Enter the dividend, a numberto factor: " );
		Scanner console = new Scanner( System.in);
		int input= console.nextInt();
		int dividend = input;
		System.out.println();
		// repeat the following code until the number is factored
		{
		System.out.print("Enter a divisor: " ); 
		// prompt for a divisor
		int divisor = console.nextInt();
		// determine if the divisor is a factor of the dividend
		{
		System.out.println( ______________+ " is a factor of " +input );
		__________________;  // reduce the dividend using the divisor
		System.out.println( ____________+ " is the new dividend.\n");
		}
		// ... the dividend is not a factor, 
		{System.out.println(" ____________" );
		}
		}
		System.out.println( "Exit program." );
		console.close();
	}
}