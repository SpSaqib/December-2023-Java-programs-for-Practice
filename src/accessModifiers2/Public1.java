package accessModifiers2;

import java.nio.charset.IllegalCharsetNameException;

import accessModifiers.Public;

public class Public1 extends Public{
	
	public static void main(String[] args) {
		
		//We can directly call public members , classname and with the help of object also in different packages by inheriting
		
		Public.setName("I am from public class but called ,with the help of class name");
		setName("I am from public class but called directly called");
		Public p1=new Public();
		
		p1.setName("I am from public class ,with the help of Object creation");
		p1.display();
	}

}
