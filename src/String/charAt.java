package String;

public class charAt {

	public static void main(String[] args) {
		
		String name="javatpoint";  
		char ch=name.charAt(4);//returns the char value at the 4th index  
		System.out.println(ch);
		
	
		try
		{
		char b = name.charAt(9);
		}
		
		catch(StringIndexOutOfBoundsException s)
		{
		System.out.println(" We are getting String Index Out Of Bounds Exception");
		
		}

	}

}
