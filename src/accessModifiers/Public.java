package accessModifiers;

import Static_Keyword.City;

public class Public {
static String name;
	
	public static void main(String[] args) 
	{
		System.out.println("Name : "+name);
		setName("Bidar");
		System.out.println("Name : "+name);
		Public c=new Public();
		c.display();
	
	}
	
	public static void setName(String name)
	{
		Public.name=name;
		System.out.println(name);
	}

	public void display()
	{
		System.out.println("Hello");
	}

}
