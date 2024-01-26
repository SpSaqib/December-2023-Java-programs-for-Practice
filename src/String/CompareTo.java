package String;

public class CompareTo {

	public static void main(String[] args) {
		
		String s1="hello";  
		String s2="hello";  
		String s3="heklo";  
		String s4="hemlo";  
		String s5="flag";  
		System.out.println(s1.compareTo(s2));//0 because both are equal  
		System.out.println(s1.compareTo(s3));//1 because "h" is 1 times greater than "k"  
		System.out.println(s1.compareTo(s4));//-1 because "l" is 1 times lower than "m"  
		System.out.println(s1.compareTo(s5));//2 because "h" is 2 times greater than "f"  

	}

}
