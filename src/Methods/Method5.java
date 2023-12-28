package Methods;

public class Method5 {

	public static void main(String[] args) {
		
	System.out.println(add(10, 20));
		
	System.out.println(add(20, 30, 40));
	
	System.out.println(sub(30, 10));

	}
	
	public static int add(int a , int b)
	{
		return a+b;
		
	}
	
	public static int add(int a , int b, int c)
	{
		return a+b-c;
		
	}
	
	public static int sub(int a , int b)
	{
		return a-b;
		
	}

}
