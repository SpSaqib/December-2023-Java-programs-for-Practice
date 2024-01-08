package Static_Keyword;

public class Static4 {
	
	static int i=test1();
	static int j=test1()+test2();
			
	public static int test1()
	{
		System.out.println("From test1 i : "+i);
		System.out.println("From test1 j : "+j);
		System.out.println("====================================");
		return 10;
	}
	
	public static int test2()
	{
		System.out.println("From test2 i : "+i);
		System.out.println("From test2 j : "+j);
		System.out.println("====================================");
		return test1()-3;
	}

	public static void main(String[] args) 
	{
		System.out.println("From main i :"+i);
		System.out.println("From main j :"+j);
		
	}

}
