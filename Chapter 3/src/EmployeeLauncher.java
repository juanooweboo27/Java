import java.util.Scanner;

public class EmployeeLauncher {

	public static void main(String[] args) {
		Employee employee1 = new Employee();
		employee1.setName("Susan Meyers");
		employee1.setIdNum(47899);
		employee1.setDepartment("Accounting");
		employee1.setPosition("Vice President");
		Employee employee2 = new Employee();
		employee2.setName("MArk Jones");
		employee2.setIdNum(39119);
		employee2.setDepartment("IT");
		employee2.setPosition("Programmer");
		Employee employee3 = new Employee();
		employee3.setName("Joy Rogers");
		employee3.setIdNum(81774);
		employee3.setDepartment("Manufacturing");
		employee3.setPosition("Engineer");
		
		
		System.out.println(employee1.getName() + "   " 
				+ employee1.getIdNum() + "     "
				+ employee1.getDepartment() + "       " 
				+ employee1.getPosition());
		System.out.println(employee2.getName() + "     " 
				+ employee2.getIdNum() + "     "
				+ employee2.getDepartment() + "               " 
				+ employee2.getPosition());
		System.out.println(employee3.getName() + "     "
				+ employee3.getIdNum() + "     "
				+ employee3.getDepartment() + "    " 
				+ employee3.getPosition());
				
		
		
		
	}

}
