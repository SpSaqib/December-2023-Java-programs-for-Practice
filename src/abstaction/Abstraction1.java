package abstaction;

public abstract  class Abstraction1 {
	
	 public abstract int add(int a, int b);
	 
	 public void helloWorld()
	 {
		 System.out.println("Hello World");
	 }
	 
	 //We cant create static as abstract
	 
//	 public abstract static void AircraftWeight()
//		{
//			System.out.println("I am from static menthod of interface");
//		}
//	 
	 public static void main(String[] args) 
	 {
		//We cant create object for abstact class because we cant create contructor
	//	 Abstraction1 a=new Abstraction1();
		 
		
	}

}
