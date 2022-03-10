package Conditional;

public class couplesmarriage {

	public static void main(String[] args) {

		String a="elgible", b="not elgible";
		if(a==b && b==a)
		{
			System.out.println("ëlgible for marriage");
		}
		else if(b==a && a==b)
		{
			System.out.println("not elgible for marriage");
		}
		else
		{
			System.out.println("marriage");
		}
		
	}

}
