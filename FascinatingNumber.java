package Basic;

import java.util.Scanner;

public class FascinatingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
        int n=sc.nextInt();
        int r;
        int s=n;
        int digit=0;
        while(n!=0)
        {
           r=n%10;
           n=n/10;
           digit++;
        }
//        System.out.println(digit);
        if(digit!=3)
        {
        	System.out.println("Cannot be a fascinating number");
        }
        else
        {
        	String m=s*2+""+s*3+""+s;
        	boolean found=true;
        	System.out.println(m);
         for(char c='1'; c<='9'; c++)
         {
        	 int count=0;
        	 for(int i=0; i<m.length(); i++)
        	 {
        		 char ch=m.charAt(i);
        		 if(ch==c)
        		 {
        			count++; 
        		 }
        	 }
        	 if(count>1 || count==0) // this step is for repeat
        	 {
        		 found=false;
        		 break;
        	 }
         }
 
            if(found)
            {
            	System.out.println("Is a fascinating number");
            }
            else
            {
            	System.out.println("Not a Fascinating ");
            }
                
            	
           }

        }
    
	}


