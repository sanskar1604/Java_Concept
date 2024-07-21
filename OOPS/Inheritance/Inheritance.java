/*
 * Inheritance -- 
 * Inheritance is used to create a new class based on existing class and it’s a mechanism through which an object can 
 * acquire all the properties of another class.
 */
public class Inheritance {

	public static void main(String[] args) {
		Cat cat = new Cat();
		
		cat.name = "abc";
		cat.age = 10;
		cat.breed = "def";
		
		System.out.println("Cat Name: " + cat.name);

	}

}