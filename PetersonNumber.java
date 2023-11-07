package Basic;

import java.util.Scanner;

public class PetersonNumber {
	static int fact(int r) {
		int fact=1;
		for(int i=1; i<=r; i++)
		{
			fact=fact*i;
		}
		return fact ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
       int r;
       int temp=n;
       int m;
       int sum=0;
       while(n!=0)
       {
    	  r=n%10;
    	  fact(r);
    	  sum=sum+fact(r);
    	  n=n/10;
       }
       System.out.println(sum+" "); 
      if(temp==sum)
      {
    	  System.out.println("Is peterson");
      }
      else
      {
    	  System.out.println("Not peterson");
      }
       
      
	}

}
