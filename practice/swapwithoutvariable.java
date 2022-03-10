package practice;

public class swapwithoutvariable {

	public static void main(String[] args) {

		int a=10,b=20;
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swapping is:"+a+" "+b);
	}

}
