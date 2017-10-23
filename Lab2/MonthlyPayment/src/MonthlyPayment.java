/* 
Name: Zimo Chai
Lab Section:
Lecture Section:
Date:9/1/2016
Assignment:
Description: This program aims at computing a monthly payment on a loan
*/

import java.util.Scanner;
public class MonthlyPayment {

	public static void main(String[] args) 
	{
		Scanner console = new Scanner(System.in);
		System.out.printf("Please input your initial loan amount: ");
		double initialLoan = console.nextDouble();
		
		System.out.printf("Please input the annual percentage rate: ");
		double annualPercentageRate = console.nextDouble();
		double monthlyInterestRate = annualPercentageRate/12./100;
				
		System.out.printf("Please input your loan duration in years: ");
		double loanDuration = console.nextDouble();
		double number = loanDuration*12;
		
		double monthlyPayment = calculation(initialLoan,monthlyInterestRate,number);
		System.out.printf("The monthly payment is: $" + monthlyPayment);
		
	}
	
	public static double calculation (double initialLoan, double monthlyInterestRate, double number)
	{
		double monthlyPayment = initialLoan * monthlyInterestRate * Math.pow(1+ monthlyInterestRate ,number)/(Math.pow(1+monthlyInterestRate, number)-1);
		return monthlyPayment; //returns the monthly payment
	}
	
}
