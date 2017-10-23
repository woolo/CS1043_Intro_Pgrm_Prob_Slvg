/*
Name: Zimo Chai
Lab Section: 1
Lecture Section: 
Date: 10/6/2016
Assignment: 
Description:
*/
import java.util.Scanner;

public class NestedLoops {

	public static void main(String[] args) 
	{	
		Scanner console = new Scanner(System.in);
		
		System.out.print( "Please enter an odd-number of output-lines (enter zero to exit the program): "); 
		
		int input = console.nextInt();
		
		if(input%2!=1 || input<=0) 
			System.exit(0);	
		
		final int nrows=input/2+1;
		int i,j,k;
		
		for(i=nrows; i>=1; i--)
		{
			for(j=(nrows-1); j>=i; j--)
			{
				System.out.print(" ");
			}
			for(k=1; k<=(2*i-1); k++)
			{
				System.out.print("*");
			}
			System.out.println("");
		
		}
		
		for(i=2; i<=nrows; i++)
		{
			for(j=(nrows-1); j>=i; j--)
			{
				System.out.print(" ");
			}
			for(k=1; k<=(2*i-1); k++)
			{
				System.out.print("*");
			}
			System.out.println("");
		
		}
	}
}
