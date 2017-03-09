import java.util.Scanner;

public class TestScoresLauncher {

	public static void main(String[] args) {
		double s1;
		double s2;
		double s3;
		Scanner userInput = new Scanner(System.in);//Accepts user input
		System.out.println("What was your first test score?");
		s1 = userInput.nextDouble();
		System.out.println("What was your second test score?");
		s2 = userInput.nextDouble();
		System.out.println("What was your third test score?");
		s3 = userInput.nextDouble();
		//Instantiates an object and passes 3 variables through
		TestScores test = new TestScores(s1, s2, s3);
		double averageScore = test.averageScore(s1, s2, s3);
		System.out.println("Your average score is " + averageScore);

	}

}
