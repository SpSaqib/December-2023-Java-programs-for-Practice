package Static_Keyword;

public class City {
	
	static String name;
	
	public static void main(String[] args) 
	{
		System.out.println("Name : "+name);
		setName("Bidar");
		System.out.println("Name : "+name);
		City c=new City();
		c.display();
	
	}
	
	public static void setName(String name)
	{
		City.name=name;
		System.out.println(name);
	}

	protected void display()
	{
		System.out.println("Hello");
	}
	
	
}
