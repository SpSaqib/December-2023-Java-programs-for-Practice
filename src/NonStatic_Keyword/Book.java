package NonStatic_Keyword;

import Static_Keyword.City;

public class Book {

	public static void main(String[] args) {
		
		City.setName("India");
		
		City c=new City();
		c.display();
		c.setName("Karnataka");

	}

}
