/*
 * Constructor -- 
 * is special method to initialise object.
 * is called when we decalare object.
 * No return type for constructor.
 */

public class Constructor {

	public static void main(String[] args) {
		Student student = new Student();
		Student student1 = new Student("Sanskar", 25, 1700);
		
		student.setName("Anuj");
		student.setAge(25);
		student.setRollNumber(1701);
		
		System.out.println("Name: " + student.getName());
		System.out.println("Age: " + student.getAge());
		System.out.println("Roll Number: " + student.getRollNumber());
		
		System.out.println("Name: " + student1.getName());
		System.out.println("Age: " + student1.getAge());
		System.out.println("Roll Number: " + student1.getRollNumber());

	}

}
