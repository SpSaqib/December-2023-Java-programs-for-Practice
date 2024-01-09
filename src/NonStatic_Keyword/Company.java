package NonStatic_Keyword;

class Company

{
	int emp_Id;
	String name;
	static String companyName="Microsoft";
	String adress;
	String cityName;
		
	{
		System.out.println("From Nonstatic block");
	}
	
	static
	{
		System.out.println("From static block");
	}
	
	Company(String adress)
	{
		this.adress=adress;
				
	}
	
	Company(String adress,int emp_Id,String name)
	{
		this(adress);
		this.emp_Id=emp_Id;
		this.name=name;
				
	}
	Company(String adress,int emp_Id,String name, String cityName)
	{
		this(adress,emp_Id,name);
		this.cityName=cityName;
				
	}
	
	
	
	
	void employeeDetails()
	{
		System.out.println(emp_Id);
		System.out.println(name);
		System.out.println(companyName);
		System.out.println(adress);
	}
	
	static void employeeContact()
	{
		System.out.println("Mumbai");
	}
	
	void employeeAdress()
	{
		System.out.println(adress);
	}
	

}
