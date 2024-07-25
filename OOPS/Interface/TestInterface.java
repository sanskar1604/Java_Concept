public class TestInterface {

	public static void main(String[] args) {
		//We can not create object for interface.
		AnimalInterfaceImpl animalInterfaceImpl = new AnimalInterfaceImpl();
		animalInterfaceImpl.eat();
		System.out.println(animalInterfaceImpl.max);
		
		AnimalInterface.info();
		
		animalInterfaceImpl.run();
	}
	
}
