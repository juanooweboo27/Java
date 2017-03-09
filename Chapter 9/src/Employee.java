public class Employee {
	//Instance Fields
	private String name;
	private String emNum;
	private String hireDate;
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	//Overloaded Constructor
	public Employee(String employee){
		System.out.println("Hello " + employee + ", your shift has begun.");
	}
	//Sets value for name
	public void setName(String n){
		this.name = n;
	}
	//returns value for name
	public String getName(){
		return name;
	}
	//Sets value for employee number
	public void setEmNum(String e){
		this.emNum = e;
	}
	//returns value for employee number
	public String getEmNum(){
		return emNum;
	}
	//sets value for hire date
	public void setHireDate(String h){
		this.hireDate = h;
	}
	//returns value for hire date
	public String getHireDate(){
		return hireDate;
	}
}
