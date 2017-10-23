/* 
Name: Zimo Chai
Lab Section:
Lecture Section:
Date:9/1/2016
Assignment:
Description:This program aims at convert temperature in Fahrenheit into temperature in Celciius.
*/

import java.util.Scanner;
public class Lab2Modules {

	public static void main(String[] args) 
	{
	Scanner console = new Scanner(System.in);
	System.out.printf("Please input a temperature in degrees Fahrenheit: ");
	double celcius = console.nextDouble();
	double fahren = cToF(celcius);
	System.out.printf("The temperature in Fahrenheit is: " + fahren);
	}
	
	
	public static double cToF (double cel)
	{
		double fahren = 9./5.*cel+32;
		return fahren; //returns Temperature in Celcius
	}
	
}
