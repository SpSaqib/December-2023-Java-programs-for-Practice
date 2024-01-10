package NonStatic_Keyword;

public class NonStatic2 
{
	static int a;
	static int b;
	
	static void display()
	{
		
		System.out.println(a);
		System.out.println("Children are playing");
		a=100;
		System.out.println(a);
		System.out.println("Children are reading");
		
	}

	public static void main(String[] args) 
	{
		
		System.out.println(a);
		display();
		int a;
		System.out.println(NonStatic2.a);
		
	}
	static 
	{
		System.out.println("No work is done");
		a=5;
	}

}
