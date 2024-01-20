package Interface;

public class AircaftinReadyCondition implements  AircraftRules,AirCraftCompanyName {

	
	
	public void nameOfpilot() 
	{
		System.out.println("I am Rajeev Gandhi");
		
	}
	
	public static void main(String[] args) {
		AircaftinReadyCondition ac=new AircaftinReadyCondition();
		ac.color();
//		ac.nameOfAircraftCompany();
//		ac.nameOfAircraftCompany();
		
		//We cant acces below method by the reference parent interface because it doesnot have that method in it
//		AircraftRules ac=new AircaftinReadyCondition();
		ac.nameOfpilot();
		
	}

	//Multiple inheritance overcome
	@Override
	public void airCraftDesign() {
		
		System.out.println("I am airCraftDesign");
		
	}

	@Override
	public void color() {
		
		System.out.println("I am color");
	}

	@Override
	public void sittingArrangement() {
		
		System.out.println("I am sittingArrangement");
	}

	@Override
	public void nameOfAircraftCompany() {
		System.out.println("I am nameOfAircraftCompany");
		
	}

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}

	

}
