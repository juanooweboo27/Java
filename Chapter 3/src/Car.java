
public class Car {
private int yearModel;
private String make;
private int speed;
	public Car(int yearModl, String make) {
		speed = 0;
	}
	public void setYear(int year) {
		this.yearModel = year;
	}
	public int getYear() {
		return yearModel;
	}
	public void setMake(String m) {
		this.make = m;
	}
	public String getMake() {
		return make;
	}
	public void setSpeed(int s) {
		this.speed = s;
	}
	public int getSpeed() {
		return speed;
	}
	public int accelerate() {
		speed += 5;
		return speed;
	}
	public int brake(){
		speed -= 5;
		return speed;
	}
 }
