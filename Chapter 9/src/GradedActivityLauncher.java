import java.util.Scanner;
public class GradedActivityLauncher {
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);//scanner object for user input
		//GradedActivity  score = new GradedActivity();
		Essay essay = new Essay();//Instance of the Essay Class
		//Variables
		double grammer = -1;
		double spelling = -1;
		double correctLength = -1;
		double content = -1;
		//While loop to get the score for grammer
		while(grammer < 0){
		System.out.println("What was your score on grammer?");
		grammer = userInput.nextDouble();
		//If statement for validation
		if(grammer < 0 || grammer > 30){
			System.out.println("Invalid score\nWhat was your score on grammer?");
			grammer = userInput.nextDouble();
			}
		essay.setGrammer(grammer);
		}
		//While loop to get the score for spelling
		while(spelling < 0){
		System.out.println("What was your score on spelling?");
		spelling = userInput.nextDouble();
		//If statement for validation
		if(spelling < 0 || spelling > 20){
			System.out.println("Invalid score\nWhat was your score on spelling?");
			spelling = userInput.nextDouble();
			}
		essay.setSpelling(spelling);
		}
		//While loop to get the score for correct length
		while(correctLength < 0){
		System.out.println("What was your score on correct length?");
		correctLength = userInput.nextDouble();
		//If statement for validation
		if(correctLength < 0 || correctLength > 20){
			System.out.println("Invalid score\nWhat was your score on correct length?");
			correctLength = userInput.nextDouble();
			}
		essay.setCorrectLength(correctLength);
		}
		//While loop to get the score for content
		while(content < 0){
			System.out.println("What was your score on content?");
			content = userInput.nextDouble();
			//If statement for validation
			if(content < 0 || content > 30){
				System.out.println("Invalid score\nWhat was your score on content?");
				content = userInput.nextDouble();
			}
			essay.setContent(content);
		}
		
		//prints output
		System.out.println("You got a " + essay.getTotal() 
		+ " out of 100%\n that is a(n) " + essay.getGrade() 
		+ " as a letter grade.");
	}
}
