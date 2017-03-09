
public class Car extends Automobile implements Move{

	public Car() {
		System.out.println("A new car has been created");
	}
	public Car(String vehicleType){
		System.out.println("A new " + vehicleType + " has been created");
	}
	public void addFuel(double numGallons){
		System.out.println();
	}
	public void moveVehicle(){
		System.out.println("Vroom Vroom!");
	}

}
