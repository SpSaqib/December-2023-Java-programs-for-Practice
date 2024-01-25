package Collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet1 {

	public static void main(String[] args) {
		
		
		HashSet<String> h=new HashSet<String>();
		h.add("USA");
		h.add("India");
		h.add("UK");
		h.add("USA");
		
		System.out.println(h);
		
//		for(String h1:h)
//		{
//			System.out.println(h1);
//		}
		
		
		System.out.println(h.isEmpty());
		System.out.println(h.size());
		
		Iterator<String> i = h.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		

	}

}
