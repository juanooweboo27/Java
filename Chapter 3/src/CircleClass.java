
public class CircleClass {
	//Instance fields
	private double radius;
	private final double PI = 3.14159;
	//Default constructor that accepts the radius as an arguments 
	public CircleClass(double r) {
		this.radius = r;
	}
	public void setRadius(double r) {
		
	}
	public double getRadius() {
		return radius;
	}
	//Method to get area
	public double getArea() {
		double a;
		a = (PI * (radius * radius));
		return a;
	}
	//Method to get diameter
	public double getDiameter() {
		double d;
		d = (radius * 2.0);
		return d;
	}
	//Method to get circumference
	public double getCircumference() {
		double c;
		c = (2.0 * PI * radius);
		return c;
	}

}
