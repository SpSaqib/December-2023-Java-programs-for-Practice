package Super_Call_Inheritance;

public class Child extends Parent {
	
	int a=20;
	
	void displayNumber()
	{
		
		System.out.println(super.a);
	}
	
	public static void main(String[] args) {
		
		Child ch=new Child();
		
		ch.displayNumber();
		
		System.out.println(ch.a);
		
	}

}
