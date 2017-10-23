
public class LoopStars 
{

	public static void main(String[] args) 
	{
		/*final int nrows=5;
		int i,j,m;
		
		for (i=1; i <= 1;i--);
		{	
			for (j=(nrows-1); j>=1; j--) 
			{
				System.out.print("t");
			}
			
			for(m=1; m <=(2*i-1); m++)
			{
				System.out.print("*");
			}
			
			System.out.println("");*/
		
		final int nrows=5;
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
		
		for(i=1; i<=nrows; i++)
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
