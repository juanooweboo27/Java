import java.util.Scanner;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class ShippingChargesLauncher {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		DecimalFormat formatter = new DecimalFormat("$###,###.00");
		ShippingChargesClass info = new ShippingChargesClass();
		int user = Integer.parseInt(JOptionPane.showInputDialog("Based off the weight of your package in kilograms, we will charge a fee per 500 miles."
				+ "\nHow much does your package weigh?"));
		info.setWeigth(user);
		int user2 = Integer.parseInt(JOptionPane.showInputDialog("How many miles do you need your package to be shipped?"));
		info.setMiles(user2);
		
		info.getMiles();
		JOptionPane.showMessageDialog(null,"Since the weight of your package is " + info.getWeight() 
		+ "\nand the miles it needs to be shipped is " + info.getMiles() +"\nyour total is " + formatter.format(info.getRate()));
		userInput.close();
	}

}
