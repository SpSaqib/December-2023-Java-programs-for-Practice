package String;

public class ReplaceAll {

	public static void main(String[] args) {
		
		String s1="my name is khan my name is java";  
		String replaceString=s1.replaceAll("\\s","was");//replaces all occurrences of "is" to "was"  
		System.out.println(replaceString); 

	}

}
