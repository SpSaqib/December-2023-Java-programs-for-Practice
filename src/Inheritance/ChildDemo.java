package Inheritance;

public class ChildDemo extends ParentDemo
{
	String name="Prem";
	
	ChildDemo()
	{
	//	super();
		System.out.println("Child class constructor");
	}
	
	public void getStringData()
	{
		System.out.println(this.name);
		System.out.println(super.name);
		System.out.println(name);
	}
	
	public void getData()
	{
		super.getData();
		System.out.println("I am in child class");
	}
	
	public static void main(String[] args) 
	{
		
		ChildDemo cd=new ChildDemo();
		cd.getStringData();
		cd.getData();
		
	}

}
