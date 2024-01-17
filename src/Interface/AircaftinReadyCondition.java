package Interface;

public class AircaftinReadyCondition implements  AirCraftCompanyName {

	
	
	public void nameOfpilot() {
		System.out.println("I am Rajeev Gandhi");
		
	}
	
	public static void main(String[] args) {
		AirCraftCompanyName ac=new AircaftinReadyCondition();
		ac.color();
		ac.nameOfAircraftCompany();
		ac.nameOfAircraftCompany();
	//	ac.nameOfpilot();
		
	}

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
