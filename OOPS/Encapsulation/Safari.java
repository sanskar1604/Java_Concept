public class Safari {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car();
		car.brand = "Tata";
		car.color = "black";
		car.model = "700";
		car.year  = 2024;
		car.speed = 100;
		
		car.accelerate(2);
		
		System.out.println(car.speed);

	}

}
