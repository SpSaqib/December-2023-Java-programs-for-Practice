package String;

public class ReverseAStringWithStringBuilder{

	public static void main(String[] args) {
		String original = "Hello, World!";
		StringBuilder reversedStringBuilder = new StringBuilder(original).reverse();
		String reversedString = reversedStringBuilder.toString();
		System.out.println(reversedString);

	}

}
