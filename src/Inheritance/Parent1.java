package Inheritance;

public class Parent1 {
	
	int a;
	String s;
	int b;
	
	Parent1()
	{
		System.out.println("I am from Parent1 class");
	}
	
	Parent1(int a)
	{
		this.a=a;
		System.out.println(a);
		System.out.println("I am from Parent1 class and constructor Parent1(int a)");
	}
	
	Parent1(int a, String s)
	{
		this();
		this.s=s;
	}
	Parent1(int a , int b, String s)
	{
		this(a, s);
		this.b=b;
		System.out.println("I am from Parent1 class and constructor Parent1(int a , int b, String s)");
	}

}
