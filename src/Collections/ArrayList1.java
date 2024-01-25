package Collections;

import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {
		
		ArrayList a=new ArrayList ();
		
		a.add("Hello");
		a.add("1");
		a.add("World");
		a.add("2");
		a.add("India");
		
//		for(Object b:a)
//		{
//			System.out.println(b);
//		}
		
		// 3rd index will be strored as Karnataka and followed rest all elements
		//[Hello, 1, World, Karnataka, 2, India]
		
		a.add(3, "Karnataka");
		System.out.println(a);
		
		for(Object b:a)
		{
			System.out.println(b);
		}
		

	}

}
