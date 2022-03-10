package forloop;

public class productnumbers {

	public static void main(String[] args) {

		int i,prct=1;
		for(i=1;i<=10;i++)
		{
			if(i%2==0)
			{
				prct=prct*i;
			}
		}
		
		System.out.println("final product value is:" +prct);
		
	}

}
