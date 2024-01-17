package accessModifiers;

public class PublicInheriting extends Public{

	public static void main(String[] args) {
		
		//Because setName method is static we can call directly with its name or classname or with the object as well since its inherited
		setName("Bangalore");
		
		Public p=new Public();
		p.display();
		p.setName("Hyderabad");
		

	}

}
