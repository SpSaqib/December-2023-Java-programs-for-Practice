package Inheritance;

public class CarHasA {
	
	String color;
	double price;
	
	EngineHasA e=new EngineHasA(18, "Auto1");
	
	public CarHasA(String color, double price) 
	{
		this.color=color;
		this.price=price;
	}
	
	public void carAttributeDetails()
	{
		System.out.println(color);
		System.out.println(price);
	}

	public static void main(String[] args) 
	{
		CarHasA c=new CarHasA("Mate-Black", 1500000);
		c.e.engineAttributeDetails();
		c.carAttributeDetails();
	}

}
