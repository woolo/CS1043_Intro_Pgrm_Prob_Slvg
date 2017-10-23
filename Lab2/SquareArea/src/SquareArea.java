/* 
Name: Zimo Chai
Lab Section:
Lecture Section:
Date:9/1/2016
Assignment:
Description: This program aims at caculating the are of a square.
*/

import java.util.Scanner;

public class SquareArea
{
	public static void main(String[] args) 
	{
		Scanner console = new Scanner(System.in);
		System.out.printf("Please input the base of the square: ");
		double square_base = console.nextDouble();

		
		double area_square= squareArea(square_base);
		System.out.printf("The area of the square is: " + area_square);
	}
	
	public static double squareArea(double base)
	{
		double area = rectangle_Area(base, base);
		return area;
	}
	
	public static double rectangle_Area(double baseOfRectangle, double heightOfRectangle)
	{
		return (baseOfRectangle * heightOfRectangle);
	}
}
