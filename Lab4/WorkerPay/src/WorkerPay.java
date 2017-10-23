/* 
Name: Zimo Chai
Lab Section: 1
Lecture Section:
Date: 9/15/2016
Assignment:
Description: This is program aiming at calculating the take home pay of workers
*/
import java.util.Scanner;
public class WorkerPay
{
	public static void main( String args [] )
	{
		// 1. Instantiate the object “worker” here using the
		//    no-argument constructor:
			WorkerPay worker = new WorkerPay();
		// 2. Reference the method to prompt for inputs here:
			worker.prompt4data();
		// 3. Reference the method to display the results here:
			System.out.println(worker.toString());
	} // end main
	
	/*
	Students must fill in the code for the private instance fields
	and the two instance methods: grossPay, fedTax, and display.
	Declare the three private instance fields here:                
	*/
	private double hours;
	private double wageRate;
	private int dependents;
	/* Write the no-argument constructor here:
	*/
	public WorkerPay()
	{  // initialize the instance fields to zero.
		hours = 0.0;
		wageRate = 0.0;
		dependents = 0;
	}
	
	public void prompt4data()
	/* this is an instance method */
	{
		// This method should prompt for the input data
		Scanner console = new Scanner( System.in );
		// Fill in the remaining code here by prompting for the 
		// three inputs and assigning the three instance fields.
		System.out.print( "Enter the number of hours worked: " );
		hours = console.nextDouble();
		
		System.out.print( "Enter the hourly wage rate: " );
		wageRate = console.nextDouble();
		
		System.out.print( "Enter the number of dependents that the employee has: " );
		dependents = console.nextInt();
	}
	
	/* Complete the grossPay instance method */
	public double grossPay()
	{
		double grPay;
		if (hours <0) return 0.0;
		if (hours <= 40)
			grPay = wageRate*hours;
			else if (hours <= 60)
				grPay = wageRate*(40.0 + (hours-40)*1.5);
			else grPay = wageRate*(40.0+(60.0-40.0)*1.5+(hours-60)*2);
		return grPay ; // return the gross pay, not zero.
	}
	
	/* Write the fedTax()instance method here:  
	*/
	public double fedTax()
	{
		double fdTax;
		fdTax = 0.1*grossPay()-25.0*dependents;
		if (fdTax<0)
			return 0.0;
			else return fdTax;
	}
	
	/* Write the toString() instance method here: */
	public String toString()
	{
		String str;
		str = "\nThe Hours worked is: "+ hours;
		str += "\nThe Hourly Rate is: "+ wageRate;
		str += "\nThe Number of Dependents is: "+ dependents;
		str += "\nThe Gross income is: "+ grossPay();
		str += "\nThe Federal Tax withheld is: "+ fedTax();
		str += "\nThe Take home pay is: "+ (double)(grossPay()-fedTax());
		
		return str;
	}

}    // end class
