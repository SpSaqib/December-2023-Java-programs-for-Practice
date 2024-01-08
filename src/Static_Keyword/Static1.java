package Static_Keyword;

public class Static1 {
	
	static int a;
	
	
	static
	{
		System.out.println("From static block");
	}
	
	static void running()
	{
		System.out.println("Runnning Sports");
	}
	
	static void volleyBall()
	{
		
		running();
		a=5;
		System.out.println("Volleyball Sports");
	}

	public static void main(String[] args) 
	{
				
		System.out.println(a);
		volleyBall();
		System.out.println(a);
		a=7;
		System.out.println(a);
		
	}

}

