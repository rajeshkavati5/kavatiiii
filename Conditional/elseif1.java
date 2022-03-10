package Conditional;

public class elseif1 {

	public static void main(String[] args) {

		int a=10,b=27,c=6;
		if(a>b && b>c)
		{
			System.out.println("greatest one");
		}
		else if(b>c && c>a)
		{
			System.out.println("greatest two");
		}
		else if(c>a && c>b)
		{
			System.out.println("greatest three");
		}
		else
		{
			System.out.println("greatest numbers");
		}
	}

}


/*if(condition1)
{
//set of statements
}
else if(condition2)
{
	//set of statements
}
else if(condition3)
{
	//set of statements
}
else
{
	//Set of statements
}
}*/





