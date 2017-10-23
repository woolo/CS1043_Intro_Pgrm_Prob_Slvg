/* 
Name: Zimo Chai (Jerry)
Lab Section: CS1040
Lecture Section: L1
Date: 8/25/2016
Assignment: coins
Description: This programe aims at providing a convenient way
				to count the money you have
*/

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Abracadabra
{  
public static void main( String[] args )
{
	final double PENNY_VALUE = 0.01;
	final double NICKEL_VALUE = 0.05;
	final double DIME_VALUE = 0.1;
	final double QUARTER_VALUE = 0.25;
	final double HALF_DOLLARS_VALUE = 0.50;
	final double DOLLARS_VALUE = 1.0;
	
	Scanner console = new Scanner ( System.in );
	System.out.printf( "\nHow many pennies do you have?\n");
	int pennys = console.nextInt();
	System.out.printf( "\nHow many nickels do you have?\n");
	int nickels = console.nextInt();
	System.out.printf( "\nHow many nickels do you have?\n");
	int dimes = console.nextInt();
	System.out.printf( "\nHow many quarters do you have?\n");
	int quarters = console.nextInt();
	System.out.printf( "\nHow many half dollars do you have?\n");
	int half_dollars = console.nextInt();
	System.out.printf( "\nHow many dollars do you have?\n");
	int dollars = console.nextInt();
	double total = pennys * PENNY_VALUE + nickels * NICKEL_VALUE + dimes * DIME_VALUE + quarters * QUARTER_VALUE + half_dollars * HALF_DOLLARS_VALUE + dollars * DOLLARS_VALUE;
	// total value of the coins
	NumberFormat formatter= NumberFormat.getCurrencyInstance(Locale.US);
	System.out.printf("Total value = " + formatter.format(total) );
} 
// end main
}    
// end class