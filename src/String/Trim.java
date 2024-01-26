package String;

public class Trim {

	public static void main(String[] args) {
		String s1="  hello string   ";
		System.out.println(s1.length());
		System.out.println(s1+"javatpoint");//without trim() 
		String s2=s1.trim();
		System.out.println(s1.trim()+"javatpoint");//with trim()  
		System.out.println(s2.length());

	}

}
