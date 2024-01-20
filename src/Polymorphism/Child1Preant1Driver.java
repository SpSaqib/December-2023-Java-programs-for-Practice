package Polymorphism;

public class Child1Preant1Driver {

	public static void main(String[] args) {
		
//		Child1 c=new Child1();
//		//method overriding
//		c.demo();
//		Child1.test();
//		//We can call static members of parent class with the help child class name
//		Child1.hiParent();
//		c.test();
//		c.parentClassIntro();
//		c.childClassIntro();
//		c.hiParent();
//		c.hiChild();
		
//		Parent1 p=new Parent1();
//		p.demo();
//		p.test();
//		p.parentClassIntro();
//		p.hiParent();
		

		Parent1 p1=new Child1();
		//method overriding
		p1.demo();
		p1.test();
		p1.parentClassIntro();
		p1.hiParent();
		//Runtime polymorphism
		p1.add(2, 3);
		//We cant access members of subclass from upcasting with the reference created for parent class
//		p1.childClassIntro();
//		p1.hiChild();
		
		Child1 c1=(Child1) p1;
		// above line is same as here Child1 c1=new Child();
		c1.demo();
		c1.test();
		c1.parentClassIntro();
		
	}

}
