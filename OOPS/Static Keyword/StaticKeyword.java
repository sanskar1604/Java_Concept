/*
 * It can be applied to variables, methods, blocks and nested classes.
 * The main concept behind static that it belongs to the class rather than instance of class(object).
 * We can access non-static method of static method.
 * To access non-static method from static method we need to create object for non-static method in static method.
 * The static method can not use non static data member or call non-static method directly.
 * this() and super() can not be used in static context. 
 */
public class StaticKeyword {

	public static void main(String[] args) {
	
		/*
		 * -- We can access name field from Student class because name is not belongs to class, rather it belongs to object of class.
		 * -- We can say that name variable is not defined as static.
		 */
		//Student.name(); 
		
		Student student = new Student();
		//name, age and id are not static so these all are belongs to object of class
		student.getAge();
		student.getName();
		student.getId();
		
		/*
		 * We can access count variable using instance of class because it is declared as static, so, count variable is belongs to class.
		 */
		//student.count;
		
		//We are able to access count variable using with Student class rather of instance of Student class.
		System.out.println(Student.count);
		
		//getCount() is a static method so we can directly access using Student class instead of instance of Student class.
		Student.getCount();

	}

}
