package Basic;
import java.util.Scanner;

public class PrimeSeries {

	static boolean checkPrime(int n)
	{
		for(int i=2; i<=n/2; i++)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		
		return true;
	}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();

//        boolean shouldPrint = true; // Initialize a variable to control printing alternate primes
        int primeCount=0;
       
        for (int i = 2; i <= n; i++) {
            if (checkPrime(i)) 
            {
//            	System.out.print(i+" ");
               if(primeCount%2==0)
               {
            	   System.out.print(i+" ");
               }
               primeCount++;
//             
            }
        }
    }
}
