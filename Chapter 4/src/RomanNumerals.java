import java.util.Scanner;
import javax.swing.JOptionPane;

public class RomanNumerals {

	public static void main(String[] args) {
		System.out.println("Enter a number between 1-10\n"
				+ "Depending on what you enter, I'll display the roman numeral version.");
		RomanNumeralClass romanNum = new RomanNumeralClass();
		Scanner userInput = new Scanner(System.in);
		int input = Integer.parseInt(JOptionPane.showInputDialog("Enter a number between 1-10\n"
				+ "Depending on what you enter, I'll display the roman numeral version."));
		romanNum.setRomanNum(input);
		romanNum.getRomanNum();
		//JOptionPane.showInputDialog("Your number is equivalent to the roman numeral " + romanNum.printNum());
		
		

	}

}
