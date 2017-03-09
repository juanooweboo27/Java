
public class Employee {
	private String name;
	private int idNum;
	private String department;
	private String position;
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public void setName(String n){
		this.name = n;
	}
	public String getName(){
		return name;
	}
	public void setIdNum(int num) {
		this.idNum = num;
	}
	public int getIdNum() {
		return idNum;
	}
	public void setDepartment(String dep) {
		this.department = dep;
	}
	public String getDepartment() {
		return department;
	}
	public void setPosition(String po) {
		this.position = po;
	}
	public String getPosition() {
		return position;
	}

}
