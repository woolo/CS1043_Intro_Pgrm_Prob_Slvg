
public class ArrayOps {

	 private int[] data;
	
	 public static void main( String [] args )    
	 {   
		 
		 int [] input = { 0, 1, -2, -3, 4, 5, -6, -7, 8, 9 };         
		 ArrayOps testObj = new ArrayOps( input ); // constructor  
	   
		 System.out.println("\nObject's index for the smallest value is: " + testObj.findMin() + "\n" );
		 
	     // 1. Reference the toString-method and print the array.
		 System.out.println(testObj.toString());
		 // 2. Reference the reverse-method to the array order.    
		 testObj.reverse();
		 // 3. Reference the toString-method to display the reversed array.
		 System.out.println(testObj.toString());
		 // 4. Reference the findMin-method to return the index of          
		 //    the smallest value stored in the reversed array:           
		 int mindex = testObj.findMin();  
	        
		 System.out.println("\nObject's index for the smallest value after reverse is : " + mindex + "\n" );   
	  }

	
	 
	 public ArrayOps(int[] array)
	 {
		 data = new int[array.length];
		 for (int index=0;index<array.length;index++) 
		 {
			 data[index]=array[index];
		 }
	 }

	 public String toString()
	 {
		 String str="";
		 
		 for (int index=0;index<data.length;index++) 
		 {
			  str += data[index]+" ";
		 }
		 return str;
	 }
	 
	 //The method should do an in-place reversal of the elements stored in the data array.  
	 //Do not use any additional arrays to reverse the order. See the Swap example on how to swap values. 
	 public void reverse()
	 {
		 for (int index=0;index<(data.length/2);index++) 
		 {
			 int tmp =data[index];
			 data[index] = data[data.length-1-index];
			 data[data.length-1-index] = tmp;
		 }
	 }
	 
	 //The method should locate and return the index of the smallest value stored in the data array. 
	 public int findMin()
	 {
		 int minLocation=-1;
		 int min=99999;
		 
		 for (int index=0;index<data.length;index++) 
		 {
			  if (min>data[index]) 
				  {
				  min = data[index];
				  minLocation=index;
				  }
		 }
		 
		 return minLocation;
	 }
	 
}
