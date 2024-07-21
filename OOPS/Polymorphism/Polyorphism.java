/*
 * Polymorphism -- 
 * We can achieve polymorphism using Method OOverloading and Method Overriding
 * Polymorphism allows methods to do different things based on the object it is acting upon, even though method name and signature might be same.
 * Compile time polymorphism can be achieve using method overloading. 
 * Run time polymorphism can be achieve using method overriding.
 * Run time polymorphism also know as Dynamic Method dispatch.
*/
public class Polyorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Reference is Animal and Object is Dog 
		 */
		Animal dog = new Dog(); // Upcasting
		dog.makeSound();
		
		//Dog myDog = dog;	-- It will throw because in line-13, dog object reference is of Animal, so we have to downcasting.
		Dog myDog = (Dog) dog; // Downcasting.

	}

}
 