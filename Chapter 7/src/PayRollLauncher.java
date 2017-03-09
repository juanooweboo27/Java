import java.text.DecimalFormat;
import java.util.Scanner;

public class PayRollLauncher {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		DecimalFormat formatter = new DecimalFormat("$###,###.00");
		PayRoll employee = new PayRoll();
		
		for(int i = 0; i < employee.getIdNum().length; i++){
			System.out.println("Enter the hours you worked: ");
			employee.setHours(userInput.nextInt());
			while(employee.getHours()[i] < 0){
				System.out.println("please enter a valid number");
				employee.setHours(userInput.nextInt());
			}
			System.out.println("Enter your pay rate: ");
			employee.setPayRate(userInput.nextDouble());
			while(employee.getPayRate()[i] < 6.00){
				System.out.println("please enter a valid number");
				employee.setPayRate(userInput.nextDouble());
			}
			employee.setWages();
			employee.addIncre();
		}
		System.out.println("Enter your employee number");
		int idNum = userInput.nextInt();
		for(int i = 0; i < 7; i++){
			if(idNum == employee.getIdNum()[i]){
			System.out.println("Employee ID: " + employee.getIdNum()[i] + "\nGross Pay: " + formatter.format(employee.getWages()[i]));
			}
			
		}

	}

}
