package Encapsulation;

public class Pen {
	private String color;
	private String type;
	
	private void write()
	{
		System.out.println("From write method");
	}
	
	public void printColor()
	{
		write();
		System.out.println(this.color);
	}
	
	public void set(String type)
	{
		this.type=type;
	}
	public String get()
	{
		return type;
	}

}
