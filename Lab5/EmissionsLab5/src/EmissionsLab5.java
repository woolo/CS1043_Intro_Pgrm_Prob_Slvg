/* 
Name: Zimo Chai
Lab Section:1
Lecture Section:
Date:9/23/2016
Assignment:5
Description: This program aims at checking whether the emission of pollutant is under the limitation.
*/
import java.util.Scanner;

public class EmissionsLab5
{
	public static void main( String [] args )
	{// Declare ALL your variables here:
		int pollutantNumber;
		
		double grams;
		double mileage;
		
		double firstGramLimit=0;
		double secondGramLimit=0;
		
		double firstMileageLimit=0;
		double secondMileageLimit=0;
		
		Scanner input = new Scanner(System.in);
		// display the 4 pollutant choices: CO, HC, NO, other
		System.out.println( "Please choose the pollutant by entering the interger brefore it: 1-CO, 2-HC, 3-NO, 4-Non-methane hydrocarbons" );
		System.out.println( "Enter pollutant number => ");
		// Prompt for the three inputs: pollutant #, grams,mileage
		pollutantNumber = input.nextInt();
		
		System.out.println( "Enter number of grams emitted per mile =>");
		grams = input.nextDouble();
		
		System.out.println( "Enter odometer reading =>");
		mileage = input.nextDouble();
		
		// Create a switch
		switch (pollutantNumber)
		{
			case 1:
				firstGramLimit = 3.4;
				secondGramLimit = 4.2;
				firstMileageLimit = 50000;
				secondMileageLimit = 100000;
				break;
			case 2: 
				firstGramLimit = 0.31;
				secondGramLimit = 0.39;
				firstMileageLimit = 50000;
				secondMileageLimit = 100000;
				break;
			case 3: 
				firstGramLimit = 0.4;
				secondGramLimit = 0.5;
				firstMileageLimit = 50000;
				secondMileageLimit = 100000;
				break;
			case 4: 
				firstGramLimit = 0.25;
				secondGramLimit = 0.31;
				firstMileageLimit = 50000;
				secondMileageLimit = 100000;
				break;
			default : 
				System.out.println("Invalid input value.");
		}
		
		boolean result = mileageGramsLogic(grams, mileage, firstGramLimit, secondGramLimit, firstMileageLimit, secondMileageLimit);
		if ( result )
		// display message
			System.out.println("Emissions are within the permitted level.");
		else
			System.out.println("Emissions exceed the permitted level.");
		// display other message
	}
	
	public static boolean mileageGramsLogic(double grams, double mileage, double firstGramLimit, double secondGramLimit, double firstMileageLimit, double secondMileageLimit)
	{
		// use a nested-if control structure and separate the
		// logic for mileage and pollutant grams.
				if (mileage <= firstMileageLimit)
					return (grams <= firstGramLimit);
				else 
					{if (mileage <= secondMileageLimit)
						return (grams <= secondGramLimit);
					else 
						{
							return true;//Note there is no emission limit for mileage beyond 100000 miles.
						}
					}
	}
}