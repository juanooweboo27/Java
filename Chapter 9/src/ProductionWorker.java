public class ProductionWorker extends Employee{
	//Instance Fields
	private int shift;
	private double payRate;
	public ProductionWorker() {
		//Call to the super class constructor
		super("Production Worker");
	}
	//sets value for shift
	public void setShift(int s){
		this.shift = s;
	}
	//returns value for shift
	public int getShift(){
		return shift;
	}
	//sets value for pay rate
	public void setPayRate(double p){
		this.payRate = p;
	}
	//returns value for pay rate
	public double getPayRate(){
		return payRate;
	}
}
