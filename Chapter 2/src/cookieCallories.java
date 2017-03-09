import java.util.Scanner;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class cookieCallories {

	public static void main(String[] args) {
		double calories = 75;
		//4 cookies is one serving
		//1 serving is 300 calories	
		Scanner userInput = new Scanner(System.in);//Declares a scanner object that accepts user input
		DecimalFormat formatter = new DecimalFormat("###,###.00");
		double cookie = Double.parseDouble(JOptionPane.showInputDialog("How many cookies did you eat?")); //Accepts user input
		double ammountOfCals = cookie * calories; //Calculates the amount of calories in every cookie
		
		JOptionPane.showInputDialog("You took in the following amount of callories: " + formatter.format(ammountOfCals));//Prints the output
		userInput.close();
		
	}
	
}
