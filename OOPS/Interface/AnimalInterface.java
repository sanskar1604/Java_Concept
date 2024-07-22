/*
 * Blueprint to making a class.
 * Interface is used to achieve multiple inheritance.
 * Interface is used to achieve complete abstraction.
 * Interface have only static keyword and abstract method.
 */

public interface AnimalInterface {

	//By default all the variable in interface is static and final.
	int max =100;
	
	//By default all the method defined in interface is abstract only.
	public void eat();
	
	public void sleep();
}
