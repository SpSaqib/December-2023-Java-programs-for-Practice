package Encapsulation;

public class PersonDriver {

	public static void main(String[] args) {
		
		Person person = new Person();
		
		System.out.println(person.getName());
		person.setName("John");
		System.out.println(person.getName());
		
		System.out.println(person.getAge());
		person.setAge(2);
		System.out.println(person.getAge());

	}

}
