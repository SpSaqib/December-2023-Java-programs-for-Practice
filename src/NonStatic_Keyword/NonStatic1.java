package NonStatic_Keyword;

public class NonStatic1 {
	
	int b=10; //Attibute
	
	{
		
	}
	
	public void NonStatic() //behaviour
	{
		
	}
	
	NonStatic1()
	{
		System.out.println(this);
		
	}

	public static void main(String[] args) 
	{
		
		
		NonStatic1 ns=new NonStatic1();
//		NonStatic1 ns1=new NonStatic1();
//		NonStatic1 ns2=new NonStatic1();
//		NonStatic1 ns3=new NonStatic1();
//		
//		System.out.println(n);
//		System.out.println(ns);
//		System.out.println(ns1);
//		System.out.println(ns2);
//		System.out.println(ns3);
//		
		System.out.println(new NonStatic1());

	}

}
