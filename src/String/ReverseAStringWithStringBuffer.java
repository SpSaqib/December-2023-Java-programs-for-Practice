package String;

public class ReverseAStringWithStringBuffer{

	public static void main(String[] args) {
		String original = "Hello, World!";
		//We need convert in StringBuffer
		StringBuffer reversedStringBuilder = new StringBuffer(original).reverse();
		//We need convert to String by toString
		String reversedString = reversedStringBuilder.toString();
		System.out.println(reversedString);

	}

}
