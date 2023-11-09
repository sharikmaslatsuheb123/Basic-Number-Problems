package Basic;

import java.util.Scanner;

public class Pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int mid=(n+1)/2;
        for(int i=1; i<=n; i++)
        {
        	for(int j=1; j<=n; j++)
        	{
        		if(i==mid || i+j==mid+1 || j-i==n/2 )
        		{
        			System.out.print("*");
        		}
        		else
        		{
        			System.out.print(" ");
        		}
        	}
        	System.out.println();
        	
        }
	}

}
