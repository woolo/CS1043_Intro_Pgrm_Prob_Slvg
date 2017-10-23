/*
Name: Zimo Chai
Lab Section: 1
Lecture Section: 
Date: 9/29/2016
Assignment: 
Description:
*/
import java.util.Scanner;
//
// Import the class that holds the min and max integer values.
public class Lab6Loop
{
	public static void main( String args [] )
	{
		int count=0;
		int score=0;
		String input = null;
		int sum=0;
		double average=0.0;
		int minimum=Integer.MAX_VALUE;
		int maximum=Integer.MIN_VALUE;
		/*
		1.Initialize variables for the: 
		a.�count�, 
		b.minimum,
		c.maximum,
		d.running sum. 
		
		2.Write a while-loop to prompt for each score:
		If the score is not the exit or stop string,then
			a.Count it.
			b.Sum it.
			c.Check to determine if it is the minimum.
			d.Check to determine if it is the maximum.
		4. Compute the Average. This is not part of the loop.
		5. Display your results.
		*/
		Scanner console = new Scanner(System.in);

		System.out.println("Enter the score from 0 to 100 or end by entering stop or exit:");
		input = console.nextLine();
		
		while (!(input.equals("stop") || input.equals("exit")))
		{
			score = Integer.parseInt(input);
			sum += score;
			count++;
			
			System.out.println("Enter the score from 0 to 100 or end by entering stop or exit:");
			input = console.nextLine();
		
		}
		
		average= (double)sum/count;
		
		System.out.println(count + " test scores were read.");
		System.out.println("The total test scores is: "+ sum);
		System.out.println("The average test score is: "+ average);
		System.out.println("The minimum test score is: "+ minimum);
		System.out.println("The maximum test score is: "+ maximum);
		
		
	}
}