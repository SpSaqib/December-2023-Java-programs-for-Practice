package Basics;

import java.util.Scanner;

public class ValuePrinting {

	public static void main(String[] args) 
	{
	
		Scanner a=new Scanner(System.in);
		
		System.out.println("Value of s : ");
		int s=a.nextInt();
		System.out.println("Value of s : "+s);
		
		String str=a.next();
		System.out.println("Value of Str : "+str);
		
		char c=a.next().charAt(0);
		System.out.println("Value of c : "+c);
		
		float f=a.nextFloat();
		System.out.println("Value of f: "+f);

	}

}
