/* 
Name: Zimo Chai
Lab Section:1
Lecture Section:
Date:10/27/2016
Assignment:10
Description: This program aims at checking the magic square.
*/
public class MagicSquare {    
	public static void main( String []  args )    
	{
		int [][] square4 = { {16, 3, 2, 13},{5, 10, 11, 8}, {9, 6, 7, 12}, {4, 15, 14, 1} };
		int [][] square3 = { {1, 6, 4}, {8, 2, 9}, {5, 7, 3} };  
		
		MagicSquare case1 = new MagicSquare( square3 );  
		MagicSquare case2 = new MagicSquare( square4 );  
		
		String table1 = case1.toString( );
		String table2 = case2.toString( );
		
		// Display the table  
		System.out.println(table1);
		//Determine
		if ( case1.isAmagicSq( ) )          
    	  System.out.println( "... is a magic square ... " );       
		else      System.out.println( "... is not a magic square ... \n" );  
		
		// Repeat for the 4x4 square here. 
		// Display the table
		System.out.println(table2);
		//Determine
		if ( case2.isAmagicSq( ) )          
	    	  System.out.println( "... is a magic square ... " );       
			else      System.out.println( "... is not a magic square ... \n" );  
     }  
	// Write the constructor and two instance methods here.  
	
	//1. Write a constructor to create a deep copy of the 2-D array formal parameter. 
	//There should be a private instance field for holding the deep copy of the input array. 
	
	private int[][] CopyArray;
	
	public MagicSquare(int[][] array)
	{
		CopyArray = new int[array.length][array.length];//private?
		for (int i=0; i<array.length; i++)
		{
			for (int j=0; j<array[i].length; j++)
			{
				CopyArray[i][j] = array[i][j];
			}
		}
	}
	//2. Write the toString method to return a String with a table containing the magic square. 
	@Override
	public String toString()
	{
		String str="";
		for (int i=0; i<CopyArray.length; i++)
		{
			for (int j=0; j<CopyArray[i].length; j++)
			{
				str += String.format("%4d",CopyArray[i][j]);
			}
			str += String.format("\n");
		}
		return str;
	}
	//3. Determine if the 2-Dimensional array is or is not a magic square using an instance method.
	
	 public boolean isAmagicSq()
	 {
		 //sum the fist and second diagonal
		 int sumFistDiagonal = 0;
			for (int i=0; i<CopyArray.length; i++)
			{
				sumFistDiagonal += CopyArray[i][i];
			}
		 int sumSeondDiagonal = 0;
			for (int i=0; i<CopyArray.length; i++)
			{
				sumSeondDiagonal += CopyArray[i][CopyArray.length-1-i];
			}
		if (sumFistDiagonal!=sumSeondDiagonal) return false;
		
		//sum each row
		
		for (int i=0; i<CopyArray.length; i++)
		{
			int sumRow= 0;
			for (int j=0; j<CopyArray[i].length; j++)
			{
				sumRow += CopyArray[i][j];
			}
			//System.out.println(sumRow);
			if (sumRow!=sumFistDiagonal)return false ;
		}
		
		//sum each column
		for (int j=0; j<CopyArray.length; j++)
		{
			int sumColumn = 0;
			for (int i=0; i<CopyArray.length; i++)
			{
				sumColumn += CopyArray[i][j];
				
			}
			if (sumColumn!=sumFistDiagonal)return false ;
		}
		
		return true;
		
	 }
}
