package Basic;
import java.lang.Math;
import java.util.Scanner;


public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
	    int n=sc.nextInt();
		int r;
		int temp=n;
		int original=n;
		int digit=0;
		int result=0;
		  while(temp!=0) 
		  { 
			  r=temp%10; 
		      temp=temp/10; 
		      digit++; 
		   }
//		  System.out.println(digit);
		  while(n!=0)
		  { 
			  r=n%10;//153%10=3,
			  n=n/10;
			  result+=Math.pow(r, digit);
//			  System.out.println(result);
		  }
		  if(result==original)
		  {
			  System.out.println("Is armstrong");;
		  }
		  else
		  {
			  System.out.println("Not a armstrong");
		  }
	
	}

}