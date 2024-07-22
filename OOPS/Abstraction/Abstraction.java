/*
 * To define abstract method, we need to declare class abstract as well.
 * In abstract class we can define non-abstract method as well.
 * Method don't have body known as abstract class.
 * Method have body known as Concrete class.
 * We can not create method for abstract class.
 * Animal animal = new Animal(); -- Animal is a abstract class.
 * We can create reference for abstract class and object for implementation class
 * Animal animal = new Dog(); -- Animal is abstract class and Dog is a non-abstract and implementation class of Animal. 
 */

public abstract class Abstraction {

	//Abstract Method
	public abstract void sayHello();
	
	//Concrete Method
	public void sleep() {
		System.out.println("zzzz....");
	}
}
