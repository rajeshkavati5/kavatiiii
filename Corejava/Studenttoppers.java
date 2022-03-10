package Corejava;

public class Studenttoppers {

	public static void main(String[] args) {

		int p1=65,p2=75,p3=68;
		if(p1>p2 && p1>p3)
		{
			System.out.println("Student1 Topeer");
		}
		else if(p2>p1 && p2>p3)
		{
			System.out.println("Student2 Topper");
		}
		else if(p3>p1 && p3>p2)
		{
			System.out.println("Student3 Topper");
		}
		else
		{
			System.out.println("all me members got same marks");
		}
	}

}
