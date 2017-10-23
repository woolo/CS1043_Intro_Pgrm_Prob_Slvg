/* 
Name: Zimo Chai
Lab Section:1
Lecture Section:
Date:9/8/2016
Assignment:3
Description: This program aims at practicing calling methods.
*/
public class BoxDriver 
{
	public static void main( String[] args )
	{
		Box box1 = new Box(); // this references the no-arg constructor
		Box box2 = new Box(20.,	30., 40., "green" );
	
	// Instantiate an object of type Box and name it box3. Set the dimensions
	// to be height = 18, width = 36, depth = 18. The color is blue. 
		Box box3 = new Box(18.,	36., 18., "blue" );
	
	// Instantiate an object of type Box using the copy constructor. Name the object
	// box4. box4 should be a deep copy of box3.
		Box box4 = new Box(box3);
	
	// Change the box color for box1 to red:
	box1.setColor("red");
	
	// Change the width dimension of box1 to 24. :
	box1.setWidth(24);
	
	// Display the surface area of each box and label your output by box color.
	System.out.println("The surface area of the " + box1.getColor() + " box is " + box1.area() + ".");
	System.out.println("The surface area of the " + box2.getColor() + " box is " + box2.area() + ".");
	System.out.println("The surface area of the " + box3.getColor() + " box is " + box3.area() + ".");
	System.out.println("The surface area of another " + box4.getColor() + " box is " + box4.area() + ".\n");
	
	// Display the total surface area of all the combined boxes:
	System.out.println("The total surface area of all the combined boxes is " + (double)(box1.area()+box2.area()+box3.area() +box4.area()) + ".\n");
	
	// Display the volume of each box and label the box by color:
	System.out.println("The surface area of the " + box1.getColor() + " box is " + box1.volume() + ".");
	System.out.println("The surface area of the " + box2.getColor() + " box is " + box2.volume() + ".");
	System.out.println("The surface area of the " + box3.getColor() + " box is " + box3.volume() + ".");
	System.out.println("The surface area of another " + box4.getColor() + " box is " + box4.volume() + ".\n");
	
	// Display the total storage volume of all the combined boxes:
	System.out.println("The total storage volume of all the combined boxes is " + (double)(box1.volume()+box2.volume()+box3.volume() +box4.volume()) + ".\n");
	
	// Change the color of box4 to yellow and change its height to 15.
	box4.setColor("yellow");
	box4.setHeight(15);
	
	// Use the Box toString	method to show the state of each object.
	System.out.println(box1.toString());
	System.out.println(box2.toString());
	System.out.println(box3.toString());
	System.out.println(box4.toString()+"\n");
	} // end main 
}

class Box//declaration of The BoxClass header line
{
	//These are the declarations for the private instance fields:
	private String color_;    
	private double height_;
	private double width_ ;
	private double depth_;  //Complete this declaration correctly

	public Box()//This is the no-argument constructor.
	{
		//Set the instance fields here:
		//1. Set the box color to white.
		color_="white";
				
		//2. Set each dimension of the box to 12.0;
		height_=12.0;
		width_=12.0;
		depth_=12.0;
	} // end of the no-argument constructor
	
	//Complete the next constructor; it should have formal input parameters
	//for the height, width, depth, and color respectively.
	public Box(double height, double width, double depth, String color)
	{ 
		//set the instance fields using the input parameters from the header line.
		color_=color;
		height_=height;
		width_=width;
		depth_=depth;
	} // end the constructor with the formal input parameters
	
	//Write a copy constructor for the Box class here:
	public Box(Box aBox)
	{
		color_=aBox.getColor();
		height_=aBox.getHeight();
		width_=aBox.getWidth();
		depth_=aBox.getDepth();
	}
	
	//Write accessor-methods for each private instance field (getter-methods).
	public String getColor()
	{
		return color_;
	}
	
	public double getHeight()
	{
		return height_;
	}
	
	public double getWidth()
	{
		return width_;
	}
	
	public double getDepth()
	{
		return depth_;
	}
	
	//Write mutator-methods for each private instance field (setter-methods).
	public void setColor(String color)
	{
		color_ = color;
	}
	

	public void setHeight(double height)
	{
		height_ = height;
	}
	
	public void setWidth(double width)
	{
		width_ = width;
	}
	
	public void setDepth(double depth)
	{
		depth_ = depth;
	}
	//Write separate methods for computing the area and the volume.
	public double area()
	{
		return 2*(height_*width_+height_*depth_+width_*depth_);
	}
	
	public double volume()
	{
		return height_*width_*depth_;
	}
	//Write a method named toString to return all the instance fields as a String.
	public String toString()
	{
		return "The height of the "+color_+" box is "+ height_ +".\n"+
					"The width of the "+color_+" box is "+ width_ +".\n"+
					"The depth of the "+color_+" box is "+ depth_ +".\n";
	}
	//Use concatenation to build the String.
}// end Box class declaration 