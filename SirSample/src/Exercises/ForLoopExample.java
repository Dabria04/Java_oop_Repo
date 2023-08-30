package Exercises;

public class ForLoopExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
//		for (int i = 1; i <= 5; i++)
//		for (int i = 0; i < 5; i++)
//		{
//			System.out.println("Hello");
//		}
		
//		While Loop Example
//		int x = 1;
//		while (x <= 10)
//		{
//			System.out.println(x);
//			x++ ;
//		}
// (a)
	      for(int i = 1; i <= 10; i++)
	      {
	    	  for(int j = 1; j <= i; j++)
	    	  {
	    		  System.out.print("*");
	    	  }
	    	  System.out.println();
	      }
	System.out.println("-----------------------------------------");
		
// (b)		
//
	for(int i = 10; i >= 1; i--)
	{
		  for(int j = 1; j <= i; j++)
		  {
			  System.out.print("*");
		  }
		  System.out.println();
	}
	System.out.println("-----------------------------------------");
		
// (c)		
//
	for(int i = 10; i >= 1; i--)
	{
		  for(int j = 1; j <= i; j++)
		  {
			  System.out.print(" ");
		  }
		  for(int k = 10; k >= i; k--)
		  {
			  System.out.print("*");
		  }
		  System.out.println();
	}
	System.out.println("-----------------------------------------");
		
// (d)
//
	for(int i = 10; i >= 1; i--)
	{
		  for(int j = 10; j >= i; j--)
		  {
			  System.out.print(" ");
		  }
		  for(int k = 1;k <= i; k++)
		  {
			  System.out.print("*");
		  }
		  System.out.println();
	}
	System.out.println("-----------------------------------------");
    }
}
