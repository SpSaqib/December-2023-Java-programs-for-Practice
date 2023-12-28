package Basics;

public class ConditionalOperator {

	public static void main(String[] args) {
		
		int a=false? 10:20;
		
		System.out.println(a);
		
		int b=20>30? 50:60;
		
		System.out.println(b);
		
		int q,w,e;
		
		q=50 ;
		w=30;
		e=40;
		
		int firstLarget= q>w? q:w;
		
		int secondLarget=firstLarget>e? firstLarget:e;
		
		System.out.println(secondLarget);

	}

}
