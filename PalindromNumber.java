package Basic;

public class PalindromNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=131;
		int r,rev=0;
		int temp=n;
		while(n>0)
		{
			r=n%10;
			rev=rev*10+r;
			n=n/10;
		}
		System.out.println(rev);
		if(temp==rev)
		{
			System.out.println("Is Palindrom");
		}
		else
		{
			System.out.println("Not Palindrom");
		}
	}

}
