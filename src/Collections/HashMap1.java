package Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap1 {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hm1=new HashMap<Integer, String>();
		hm1.put(0, "Hello");
		hm1.put(2, "World");
		
		
		System.out.println(hm1.get(2));
		
		HashMap<String, String> hm2=new HashMap<String, String>();
		hm2.put("h", "Hi");
		hm2.put("e", "Earth");
		
		System.out.println(hm2.get("h"));
		
		//Map to set
		
		Set s = hm1.entrySet();
		
		Iterator i = s.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}

	}

}
