import java.util.Scanner;

public class landCalculation {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);//Creates scanner object to accept user input
		int tract;
		int acre;
		int acreInSquareFeet = 43560;
		
		System.out.println("How many acres of land do you have in square feet?");
		tract = userInput.nextInt();//Accepts user input
		acre = tract / acreInSquareFeet;//Calculates how many square feet are in one tract and sets
		System.out.println("That\'s " + acre + " acres of land");//Prints output
		
		
		userInput.close();//Closes scanner object so that the program has no warnings
	}

}
