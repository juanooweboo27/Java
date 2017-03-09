
public class PetClass {
	//Instance fields
	private String name;
	private String type;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		//returns value
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	//Default constructor
	public PetClass(String n, String t, int a) {
		this.name = n;
		this.type = t;
		this.age = a;
	}

}
