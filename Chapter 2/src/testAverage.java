import java.util.Scanner;

public class testAverage {

	public static void main(String[] args) {
		double score1;
		double score2;
		double score3;
		Scanner userInput = new Scanner(System.in);//Creates a scanner object that accepts user input
		System.out.println("What was your first test score?");
		score1 = userInput.nextDouble();
		System.out.println("What was your second test score?");
		score2 = userInput.nextDouble();
		System.out.println("What was your third test score?");
		score3 = userInput.nextDouble();
		double averageScore = score1 + score2 + score3;//Calculates the total of 3 test scores
		double realAverage = averageScore / 3;//Calculates the average of 3 test scores
		
		System.out.println("Your average test score is " + realAverage);//Prints the output
		userInput.close();//Closes scanner object so that the program has no warnings
	}

}
