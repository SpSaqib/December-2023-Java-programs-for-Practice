package Collections;

import java.util.ArrayList;

public class ArrayList2 {

	public static void main(String[] args) {
		
		ArrayList<String> a=new ArrayList<String>();
		
		a.add("Birynai");
		a.add("Chicken Kolhapuri");
		a.add("Chicken Tikka");
		a.add("Chicken Tandoori");

		System.out.println(a);
		//[Birynai, Chicken Kolhapuri, Chicken Tikka, Chicken Tandoori]
		
		ArrayList<String> b=new ArrayList<String>();
		b.add("Puri bhaji");
		b.add("Idli");
		b.add("Vada");
		
		System.out.println(b);
	//[Puri bhaji, Idli, Vada]
		
		b.addAll(a);
		
		System.out.println(b);
		//[Puri bhaji, Idli, Vada, Birynai, Chicken Kolhapuri, Chicken Tikka, Chicken Tandoori]
		
		ArrayList<String> c=new ArrayList<String>();
		c.add("Upma");
		c.add("Poha");
		
		b.addAll(1, c);
		
		System.out.println(b);
		//[Puri bhaji, Upma, Poha, Idli, Vada, Birynai, Chicken Kolhapuri, Chicken Tikka, Chicken Tandoori]
		
		
		System.out.println(b.containsAll(b));
		//true
		
	}

}
