package Polymorphism;

public class Child1 extends Parent1{
	
	 public void demo()
	{
		System.out.println("I am from Child1 class non static demo method");
	}
	
	public static void test()
	{
		System.out.println("I am from Child1 class  static test method");
	}
	
	public void childClassIntro()
	{
		System.out.println("I am from Child1 class non static method which tells Child introduction");
	}
	
	public static void hiChild()
	{
		System.out.println("I am from Child1 class  static method Hi Child");
	}
	
	public void add(int c , int d)
	{
		System.out.println("add here in child class");
	}
}
