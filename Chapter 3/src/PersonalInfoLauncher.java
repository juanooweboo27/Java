
public class PersonalInfoLauncher {

	public static void main(String[] args) {
		//Instantiates 3 objects
		PersonalInfo person1 = new PersonalInfo();
		PersonalInfo person2 = new PersonalInfo();
		PersonalInfo person3 = new PersonalInfo();
		
		//Sets the values 
		person1.setName("Juan Romero Peterson Jr.");
		person1.setAddress("1705 Horseshoe Dr.");
		person1.setAge(19);
		person1.setPhoneNum("314-293-2083");
		
		person2.setName("Tawanda Peterson");
		person2.setAddress("1600 Clara Ave.");
		person2.setAge(39);
		person2.setPhoneNum("314-293-2283");
		
		person3.setName("Juan Romero Peterson Sr.");
		person3.setAddress("1705 Horseshoe Dr.");
		person3.setAge(46);
		person3.setPhoneNum("314-293-2938");
		
		
		
		System.out.println(person1.getName() + "    " 
							+ person2.getName() + "            " 
							+ person3.getName());
		System.out.println(person1.getAddress() + "          " 	
							+ person2.getAddress() + "             " 
							+ person3.getAddress());
		System.out.println(person1.getAge() + "                          " 
							+ person2.getAge() + "                          " 
							+ person3.getAge());
		System.out.println(person1.getPhoneNum() + "                " 
								+ person2.getPhoneNum() + "                " 
								+ person3.getPhoneNum());

	}

}
