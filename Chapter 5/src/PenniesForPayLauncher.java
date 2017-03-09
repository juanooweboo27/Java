import java.text.DecimalFormat;
import java.util.Scanner;

public class PenniesForPayLauncher {

	public static void main(String[] args) {
		DecimalFormat formatter = new DecimalFormat("$###,###.00");//Creates DecimalFormat object that formats decimals
		
		Scanner userInput = new Scanner(System.in);//Creates a Scanner object to accept user input
		
		PenniesForPay pay = new PenniesForPay();//INstantiates the PenniesForPay object
		
		int days = 0;//Variable for the amount of days worked
		
		double money = 0;//Variable for the amount of money which will be calculated later
		
		double total = 0;//Variable that will hold the total
		
		while(days < 1){//While loop that will continue to run if something is met
			
			System.out.println("Enter the amount of days you worked: ");
			days = userInput.nextInt();//sets the value of days to what the user enters
			
			pay.setDays(days);// sets the days Instance field to the value of days enter by the user
			
			if(days < 1){//Will make the loop run again if the amount of days entered is less than 1
				System.out.print("Please enter a valid number\n");
			}
			}
		System.out.println("Days\t\t\tPay");//Prints output similar to a table format
		System.out.println("------------------------------");
		for(int i = 1, x = 1; i <= days; x = x * 2, i++){//for loop that calculates the amount of pennies made each day 
			pay.setDays(i);								//Also, gets every day  
			money = (x/100.0);
			total += (x/100.0);
			
			System.out.println(pay.getDays() + "\t\t\t" + formatter.format((money)));
		}
		System.out.println("Total money earned: " + formatter.format(total));
	
		userInput.close();//Closes scanner output
		System.exit(0);//Exit for the DecimalFormat Object
	}
		

}
