
public class PersonalInfo {
	//instance fields
	private String name;
	private String address;
	private int age;
	private String phoneNum;
	public PersonalInfo() {
		// TODO Auto-generated constructor stub
	}
	//Getters and Setters 
	public void setName(String n) {
		this.name = n;
	}
	public String getName() {
		//returns a value 
		return name;
	}
	public void setAddress(String ad) {
		this.address = ad;
	}
	public String getAddress() {
		
		return address;
	}
	public void setAge(int a){
		this.age = a;
	}
	public int getAge() {
		return age;
	}
	public void setPhoneNum(String num) {
		this.phoneNum = num;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
}
