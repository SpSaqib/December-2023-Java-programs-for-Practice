package accessModifiers;

import Encapsulation.Pen;

public class PrivateDriver {
public static void main(String[] args) {
		
		Private p1=new Private();
		p1.printColor();
//		p1.color="blue";
//		p1.type="gel";
		
		Private p2=new Private();
//		p2.color="yellow";
//		p2.type="ballPen";
		
		p1.printColor();
		p1.set("ballpoint");
		System.out.println(p1.get());

	}

}
