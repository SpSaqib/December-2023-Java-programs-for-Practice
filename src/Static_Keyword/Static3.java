package Static_Keyword;

public class Static3 {

	static int a;

	
	public static void main(String[] args) 
	{
		int a=20;
		System.out.println(a);
		
		System.out.println(Static3.a);
		a=7;
		System.out.println(a);
		Static3.a=90;
		System.out.println(Static3.a);

	}

}
