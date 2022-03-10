package practice;

public class methodwitharg11 {

	public static void main(String[] args) {

		login("ramu","10-08-2004",6);
		login("kiran","20-03-2008",8);
		login("Rajesh","28-11-1996",10);
	}
	public static void login(String hallticket,String DOB,int semister)
	{
		System.out.println("Hallticket:"+hallticket);
		System.out.println("D.O.B:"+DOB);
		System.out.println("Semister:"+semister);
	}

}
