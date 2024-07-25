/*
 * Blueprint to making a class.
 * Interface is used to achieve multiple inheritance.
 * Interface is used to achieve complete abstraction.
 * Interface have only static keyword and abstract method.
 * Interface can have static methods.
 * Interface can have default methods and it will be called by object of interface implementation class.
 */

public interface AnimalInterface {

	//By default all the variable in interface is static and final.
	int max =100;
	
	//By default all the method defined in interface is abstract only.
	public void eat();
	
	public void sleep();
	
	public static void info() {
		System.out.println("This is static method in interface.");
	}
	
	public default void run() {
		System.out.println("This is default method in interface.");
	}
}
