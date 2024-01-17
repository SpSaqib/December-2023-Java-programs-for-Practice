package Encapsulation;

public class PenDriver {

	public static void main(String[] args) {
		
		Pen p1=new Pen();
		p1.printColor();
//		p1.color="blue";
//		p1.type="gel";
		
		Pen p2=new Pen();
//		p2.color="yellow";
//		p2.type="ballPen";
		
		p1.printColor();
		p1.set("ballpoint");
		System.out.println(p1.get());

	}

}
