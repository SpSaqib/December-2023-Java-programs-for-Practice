package Methods;

public class MethodLoading {

	public static void main(String[] args) 
	{
		
		add(10, 20);
		add(0, 0);
		add(0, 0, 0);
		add(0, null);
		
	}

	public static int add(int a , int b)
	{
		return a+b;
		
	}
	
	public static int add(int a , int b, int c)
	{
		return a+b-c;
		
	}
	
	public static void add(int c, String a)
	{
		System.out.println("Hello");
		
	}
	
}
