package Super_Call_Inheritance;

public class Child1 extends Parent11{
	
	String str;
	
	Child1(int a , int b, String s,String str)
	{
		super(a,b,s);
		System.out.println("I am from Child1 class");
	}

	public static void main(String[] args) {

		Child1 cd=new Child1(2,3,"hello","hello2");
	}

}
