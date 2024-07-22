public class Test {

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.name();
		
		// We can not create method for abstract class.
		//Animal animal = new Animal();
		
		// We can create reference for abstract class and object for implementation class
		Animal animal = new Dog();
	}

}
