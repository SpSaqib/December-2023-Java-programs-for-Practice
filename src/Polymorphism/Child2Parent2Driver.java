package Polymorphism;

public class Child2Parent2Driver {

	public static void main(String[] args) {
		
		Child2 c=new Child2();
		System.out.println(c.a);
		System.out.println(c.b);
		
		Parent2 p=new Child2();
		System.out.println(p.a);
		System.out.println(p.b);
	}

}
