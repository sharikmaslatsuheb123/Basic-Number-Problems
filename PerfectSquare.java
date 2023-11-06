package Basic;

import java.util.Scanner;

public class PerfectSquare {
	
	static boolean isPerfect(int n)
	{
		for(int i=1; i*i<=n; i++)
		{
			if((n%i==0 && n/i==i))
			{
				return true;
			}
		}
		return false;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number");
      int n=sc.nextInt();
//      System.out.println(isPerfect(n));
      //even odd series also
//      for(int i=1; i<=n; i++)
//      {
//    	  if(i%2==0)
//    	  {
//    		  System.out.println(i);
//    	  }
//      }
      //Sum of natural numbers
      int sum=0;
      for(int i=1; i<=n; i++)
      {
    	  sum=sum+i;
      }
      System.out.println(sum);
      
     
	}

}
