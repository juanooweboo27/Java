
public class Payroll {
	//Instance fields
	private String name;
	private int idNum;
	private double hourlyPay = 12.00;
	private double numHours = 58.00;
	//Default Constructor
	public Payroll(String n, int id) {
		this.name = n;
		this.idNum = id;
	}
	//Getters and Setters
	public void setName(String n) {
		this.name = n;
	}
	public String getName() {
		//returns value
		return name;
	}
	public void setIdNum(int id) {
		this.idNum = id;
	}
	public int getIdNum() {
		return idNum;
	}
	public void setHourlyPay(double pay) {
		this.hourlyPay = pay;
	}
	public double getHourlyPay(){
		return hourlyPay;
	}
	public void setHours(double hoursWorked) {
		this.numHours = hoursWorked;
	}
	public double getHours() {
		return numHours;
	}
	
	//Method to get gross pay
	public double GrossPay(double p, double h) {
		double gp;
		this.hourlyPay = p;
		this.numHours = h;
		gp = p * h;
		return gp;
	}

}
