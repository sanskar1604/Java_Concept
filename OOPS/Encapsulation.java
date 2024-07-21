
/*
 * Encapsulation -- 
 * Bundling of data and method into single unit is called Encapsulation and also used for data hiding.
 * We can achieve encapsulation using getters and setters method.
 * To create getter and setter method, we need to define variable as private only.
 */


public class Encapsulation {
	
	private String name;
	
	private int rollNumber;
	
	private String address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
	

}
