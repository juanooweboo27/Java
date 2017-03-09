
public class Area {
	//Static Instance fields
	private static int length;
	private static int width;
	private static int height;
	private static double radius;
	
	public Area() {
		// TODO Auto-generated constructor stub
	}
	
	//All getters return values 
	public static int getArea(int len, int wid){
		return (wid * len);
	}
	public static double getArea(double r){
		return Math.PI * (r * r);
	}
	public static double getArea(double ra, double h){
		return Math.PI * (ra*ra) * h;
	}
	
	
}
