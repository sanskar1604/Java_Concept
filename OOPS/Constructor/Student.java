public class Student {

	private String name;
	private int age;
	private int rollNumber;
	
	//default constructor
	public Student() {
		
	}
	
	//parameterized constructor
	
	public Student(String name, int age, int rollNumber) {
		this.name = name;
		this.age = age;
		this.rollNumber = rollNumber;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age < 0) {
			this.age = 0;
		}
		this.age = age;
	}
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	
	
}
