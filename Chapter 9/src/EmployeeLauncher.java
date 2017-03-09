import java.text.DecimalFormat;
import java.util.Scanner;
public class EmployeeLauncher {
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);//scanner object for user input
		//Employee employee = new Employee();
		ProductionWorker prodWorker = new ProductionWorker(); //instance of the ProductionWorker Class
		ShiftSupervisor supe = new ShiftSupervisor();//Instance of the ShiftSupervisor class
		TeamLeader lead = new TeamLeader(); //Instance of the teamLeeader Class
		//Variables
		String name;
		String hireDate;
		int shift = 0;
		double payRate;
		DecimalFormat formatter = new DecimalFormat("$###,###.00");//Decimal Formatting object
		System.out.println("Input your name: ");
		name = userInput.nextLine();
		System.out.println("Input your hire date: ");
		hireDate = userInput.nextLine();
		//While loop to get the shift number and validation
		while(shift < 1){
			System.out.println("Do you work shift 1 or 2: ");
			shift = userInput.nextInt();
			if(shift < 1 || shift > 2){
				System.out.println("Please enter a valid number\nDo you work shift 1 or 2: ");
				shift = userInput.nextInt();
			}
		}
		System.out.println("Input your pay rate: ");
		payRate = userInput.nextDouble();
		//Sets the values of the instance fields to the variables in the launcher
		prodWorker.setName(name);
		prodWorker.setEmNum("123-J");
		prodWorker.setHireDate(hireDate);
		prodWorker.setShift(shift);
		prodWorker.setPayRate(payRate);
		//if state for the different shifts
		if(shift == 1){
			System.out.println("Hello " + prodWorker.getName() +"\nWelcome to  the day shift" 
			+ "\nYour employee number is " + prodWorker.getEmNum() 
			+ "\nYou were hired on " + prodWorker.getHireDate() 
			+ "\nYou work shift " + prodWorker.getShift() 
			+ "\nYou get paid " + formatter.format(prodWorker.getPayRate()) + " an hour");
		}
		else if(shift == 2){
			System.out.println("Hello " + prodWorker.getName() +"\nWelcome to  the night shift"
			+ "\nYour employee number is " + prodWorker.getEmNum() 
			+ "\nYou were hired on " + prodWorker.getHireDate() 
			+ "\nYou work shift " + prodWorker.getShift() 
			+ "\nYou get paid " + formatter.format(prodWorker.getPayRate()) + " an hour");
		}
		//Sets the values of the instance fields to the variables in the launcher
		supe.setName("Ryan Anderson");
		supe.setEmNum("483-B");
		supe.setHireDate("2/05/2001");
		supe.setAnnualSalary(50000);
		supe.setAnnualBonus(10000);
		System.out.println("\n\nHello " + supe.getName() 
		+ " our shift supervisor\nYour employee number is " 
		+ supe.getEmNum() + "\nyou were hired on " + supe.getHireDate() 
		+"\nYour annual salary is " + formatter.format(supe.getAnnualSalary()) 
		+ "\nYour annual bonus is " + formatter.format(supe.getAnnualBonus()));
		//Sets the values of the instance fields to the variables in the launcher
		lead.setName("Jared Walker");
		lead.setEmNum("298-K");
		lead.setHireDate("2/2/2009");
		lead.setPayRate(15.50);
		lead.setRequiredTrainingHours(10);
		lead.setNumTrainingHours(8.50);
		lead.setMonthlyBonus(3000);
		//Prints output
		System.out.println("\n\nHello " + lead.getName() 
		+ " our team leader\nYour employee number is " 
		+ lead.getEmNum() + "\nyou were hired on " + lead.getHireDate() 
		+"\nYou get paid " + formatter.format(lead.getPayRate()) 
		+ "\nYour monthly bonus is " + formatter.format(lead.getMonthlyBonus()) 
		+ "\nYou are required to attend " + lead.getRequiredTrainingHours() 
		+ " training hors a week\nYou have attended " + lead.getNumTrainingHours() + " this week");
		
		
	}
	

}
