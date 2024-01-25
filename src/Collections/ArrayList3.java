package Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class ArrayList3 {

	public static void main(String[] args) {
		
		ArrayList<String> a=new ArrayList<String>();
		a.add("Java");
		//Duplication is allowed
		a.add("Java");
		a.add("B");
		a.add(1, "Student");
		
		System.out.println(a);
		
		 Collections.reverse(a);
		System.out.println(a);
		
		Collections.sort(a);
		System.out.println(a);
		
		ArrayList<String> b=new ArrayList<String>();
		
//		a.remove(0);
		//	[Student, Java, a]
//		System.out.println(a);
//		a.remove("Java");
		
		System.out.println(a.get(3));
		
		System.out.println(a.contains("b"));
		
		System.out.println(a.indexOf("Student"));
		
		System.out.println(a.isEmpty());
		
		System.out.println(a.size());
		
	
		

	}

}
