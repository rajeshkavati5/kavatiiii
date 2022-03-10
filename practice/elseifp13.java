package practice;

public class elseifp13 {

	public static void main(String[] args) {

		int a=10,b=27,c=6;
		if(a>b && a>c)
		{
			System.out.println("greatest number one");
		}
		else if(b>a && b>c)
		{
			System.out.println("greatest number two");
		}
		else if(c>a && c>b)
		{
			System.out.println("greatest number three");
		}
		else
		{
			System.out.println("all are greatest numbers");
		}
	}

}
