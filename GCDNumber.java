package Basic;

import java.util.Scanner;

public class GCDNumber {
	
	static int GCD(int a,int b)
	{
		int max,min=0;
        if(a<b )
        {
           min=a;	
        }
        else
        {
        	max=b;
        }
        for(int i=min; i>=1; i--)
        {
        	if(a%i==0  &&  b%i==0)
        	{
        		return i;
        	}
        }
        return 1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(GCD(a, b));
        
	}

}
