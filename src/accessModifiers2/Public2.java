package accessModifiers2;

import accessModifiers.Public;

public class Public2 {

	public static void main(String[] args) {
		//We can not directly call public members ,but we can call with classname and with the help of object also in different packages by inheriting
		
				Public.setName("I am from public class but called ,with the help of class name");
				//Below line will throw an error as we cant call static members if we dont have direct relationship
	//CTE			setName("I am from public class but called directly called");
				Public p2=new Public();
				
				p2.setName("I am from public class ,with the help of Object creation");
				p2.display();
			}

	}


