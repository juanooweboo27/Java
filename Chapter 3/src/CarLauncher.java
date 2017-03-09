
public class CarLauncher {

	public static void main(String[] args) {
		Car car1 = new Car(2015, "Jeep Wrangler");
		car1.accelerate();
		car1.accelerate();
		car1.accelerate();
		car1.accelerate();
		car1.accelerate();
		System.out.println(car1.getSpeed());
		car1.brake();
		car1.brake();
		car1.brake();
		car1.brake();
		car1.brake();
		System.out.println(car1.getSpeed());
		
		
	}

}
