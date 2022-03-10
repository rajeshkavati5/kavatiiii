package whileloop;

public class armstrongnumber {

	public static void main(String[] args) {

		int num=153,rev=0,rem,temp=num;
		while(num>0)
		{
			num=num/10;
			rem=num%10;
			rev=rev+rem*rem*rem;
		}
		System.out.println("reverse of num is:"+rev);
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
