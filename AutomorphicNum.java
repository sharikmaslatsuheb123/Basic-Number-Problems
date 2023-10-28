package Basic;

import java.util.Scanner;

public class AutomorphicNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int x=1,r;
	
	      x=n*n;
	
		System.out.println(x);
		
			r=x%100;
		
			System.out.println(r);
        if(n==r)
        {
        	System.out.println("Is automorphic ");
        }
        else
        {
        	System.out.println("Not automorphic");
        }
		
		
		
		
		


	}

}
