import java.util.Scanner;

import javax.swing.JOptionPane;
import java.text.DecimalFormat;
public class restaurauntBill {

	public static void main(String[] args) {
		double mealCharge;
		double tax;
		double tipAmount;
		double totalAmount;
		DecimalFormat formatter = new DecimalFormat("$###,###.00");
		Scanner userInput = new Scanner(System.in);//Creates scanner object that accepts user input
		System.out.println();
		mealCharge = Double.parseDouble(JOptionPane.showInputDialog("How much was your meal?"));
		tax = .075 * mealCharge;//Calculates tax on meal
		tipAmount = .18 * mealCharge;//Calculates tip amount
		totalAmount = mealCharge + tax + tipAmount;//Calculates the total of the meal 
		JOptionPane.showInputDialog("Your meal charge is ---------- " + formatter.format(mealCharge)
									+ "\n Your tax charge is ---------- " + formatter.format(tax)
									+ "\nYour tip amount was ---------- " + formatter.format(tipAmount) 
									+ "\nYour total meal charge is ---------- "+ formatter.format(totalAmount));
		userInput.close();//Closes scanner object so that the program has no warnings
	}

}
