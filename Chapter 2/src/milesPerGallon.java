import java.util.Scanner;

public class milesPerGallon {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);//Creates a scanner object that acceps user input
		double milesDriven;
		double gallonsOfGasUsed;
		double milesPerGallon;
		System.out.println("How many miles did you drive?");
		milesDriven = userInput.nextDouble();
		System.out.println("How many gallons of gas did you use?");
		gallonsOfGasUsed = userInput.nextDouble();
		milesPerGallon = milesDriven / gallonsOfGasUsed;//Formula for miles per gallon
		System.out.println("You drove " + milesDriven + " miles" 
				+ " \n " + "You used up " + gallonsOfGasUsed + " gallons of gas \n " + 
				"Your car has " + milesPerGallon + " miles per gallon");//Prints the output
		userInput.close();//Closes scanner object so that the program has no warnings
	}

}
