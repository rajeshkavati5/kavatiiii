package practice;

public class Armstrong {

	public static void main(String[] args) {

		int num=153,rev=0,rem,temp=num;
		while(num>0)
		{
			rem=num%10;
			num=num/10;
			rev=rev+rem*rem*rem;
		}
		if(temp==rev)
		{
			System.out.println("Armstrong number");
		}
		else
		{
			System.out.println("Not a armstrong number");
		}
	}

}
