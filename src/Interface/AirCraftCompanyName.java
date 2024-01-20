package Interface;

import java.nio.file.spi.FileSystemProvider;

public interface AirCraftCompanyName 
{
	//By default variables are public static and final in interface
	public static final int a = 0;
	
	public  static void AircraftWeight()
	{
		System.out.println("I am from static menthod of interface");
	}
	
	 void nameOfAircraftCompany();
	 
	 public abstract int add(int a, int b);
	 
	 //non static methods are by default abstarct and public
	 void airCraftDesign();
	 
	 public static void main(String[] args) {
		
		 //We cant create object for interface because we cant create contructor in interface
	//	 AirCraftCompanyName a=new AirCraftCompanyName();
		 
		 //We can create concrete static methods in interface
		 AircraftWeight();
		 
	
		 
	}

}
