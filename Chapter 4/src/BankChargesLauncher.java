import java.text.DecimalFormat;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class BankChargesLauncher {

	public static void main(String[] args) {
		double userInput;
		Scanner user = new Scanner(System.in);//Gets user Input
		System.out.println("How many checks have you written?");
		DecimalFormat formatter = new DecimalFormat("$###,##0.00");
		BankChargesClass charge1 = new BankChargesClass();//Instantiates a class
		userInput = Double.parseDouble(JOptionPane.showInputDialog("What is yout beginning balance?"));//Creates message box
		charge1.setBalance(userInput);
		userInput = Double.parseDouble(JOptionPane.showInputDialog("How many checks did you write?"));
		charge1.setChecks((int)userInput);
		JOptionPane.showInputDialog(null, "Beginning Balance: " + formatter.format(charge1.getBalance()) + 
									"\nNumber of checks written: " + charge1.getChecks() + 
									"\nFees added to account: " + formatter.format(charge1.getFees()) + 
									"\nEnding balance: " + formatter.format(charge1.getBalance() - charge1.getFees()));
		user.close();
		System.exit(0);
	}

}
