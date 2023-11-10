package Basic;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * String str="856"; for(int i=str.length()-1; i>=0; i--) {
		 * System.out.print(str.charAt(i)+" "); }
		 */
       Scanner sc=new Scanner(System.in);
       int r;
       System.out.println("Enter the number");
       int n=sc.nextInt();
       while(n!=0)
       {
    	   r=n%10;
    	   n=n/10;
    	   System.out.print(r+" ");
       }
	}

}
