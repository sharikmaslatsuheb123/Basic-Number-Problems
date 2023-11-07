package Basic;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=sc.nextInt();
		int count=0;
		for(int i=1; i<=97; i++)
		{
			if(a%i==0)
			{
				count++;
//				System.out.println(count);
			}
		}
		if(count>2)
		{
			System.out.println("Not prime");
		}
		else
		{
			System.out.println("Is prime");
		}

	}

}
