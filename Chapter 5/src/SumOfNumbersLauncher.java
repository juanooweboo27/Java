import java.util.Scanner;

public class SumOfNumbersLauncher {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		
		int input = 0;//Initialize variables so that you can use them later
		SumOfNumbers numbers = new SumOfNumbers();
		
		//While user input does not equal -1 enter this loop
		while(input > -1){
			System.out.println("Please enter a positive number below:");
			input = userInput.nextInt();
			numbers.setInput(input);
			//if input is less than zero go back and try again
			if(input <= -1) {
				System.out.println("Invalid try again.");
			}
			System.out.println("The sum of all numbers before the number you entered is: " + numbers.getSum());	
		}
		
		
		
	}
}
