package accessModifiers;

public class PublicDriver {

	public static void main(String[] args) {
		
		Public p=new Public();
		p.display();
		p.setName("Bangalore");

		//Below line will throw an error as it is static but dont have direct relation(inheritance)
//		setName("I am static");
	}

}
