package Inheritance;

public class EngineHasA {
	
	int mileage;
	String chasseaName;
	
	EngineHasA(int mileage,String chasseaName)
	{
		this.mileage=mileage;
		this.chasseaName=chasseaName;
		
	}
	
	public void engineAttributeDetails()
	{
		System.out.println(mileage);
		System.out.println(chasseaName);
	}

}
