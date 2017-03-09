import java.util.Scanner;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;
public class TestScoresLauncher {

	public static void main(String[] args) {
		double s1;
		double s2;
		double s3;
		DecimalFormat formatter = new DecimalFormat("#.00");
		Scanner userInput = new Scanner(System.in);//Accepts user input
		
		s1 = Double.parseDouble(JOptionPane.showInputDialog("What was your first test score?"));
		
		s2 = Double.parseDouble(JOptionPane.showInputDialog("What was your second test score?"));
		
		s3 = Double.parseDouble(JOptionPane.showInputDialog("What was your third test score?"));
		
		
		
		//Instantiates an object and passes 3 variables through
		TestScores test = new TestScores(s1, s2, s3);
		double averageScore = test.averageScore(s1, s2, s3);
		
		if(averageScore >= 90 && averageScore <= 100){
			JOptionPane.showInputDialog("Your average score " + formatter.format(averageScore) + " which is an A!");
		}
		else if(averageScore >= 80 && averageScore <= 89){
			JOptionPane.showInputDialog("Your average score " + formatter.format(averageScore) + " which is an B!");
		}
		else if(averageScore >= 70 && averageScore <= 79){
			JOptionPane.showInputDialog("Your average score " + formatter.format(averageScore) + " which is an C!");
		}
		else if(averageScore >= 60 && averageScore <= 69){
			JOptionPane.showInputDialog("Your average score " + formatter.format(averageScore) + " which is an D!");
		}
		else if(averageScore < 60) {
			JOptionPane.showInputDialog("Your average score " + formatter.format(averageScore) + " which is an F!");
		}
		
		

	}

}
