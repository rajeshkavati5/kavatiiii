package practice;

public class polindrome {

	public static void main(String[] args) {

		int num=121,rev=0,rem,temp=num;
		while(num>0)
		{
			rem=num%10;
			num=num/10;
			rev=rev*10+rem;
		}
		if(temp==rev)
		{
			System.out.println("polindrome number");
		}
		else
		{
			System.out.println("Not a polindrome number");
		}
		
	}

}
