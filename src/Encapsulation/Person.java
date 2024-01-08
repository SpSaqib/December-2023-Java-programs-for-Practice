package Encapsulation;

public class Person {
    private String name;
    private int age;

    // Getter and setter methods for private fields
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
     public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 5) {
            this.age = age;
        }
    }
    
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
