import java.util.Scanner;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class TimeCalculator {

	public static void main(String[] args) {
		
		DecimalFormat formatter = new DecimalFormat("###,###.00");
		Scanner userInput = new Scanner(System.in);
		TimeCalculatorClass time = new TimeCalculatorClass();
		int seconds = Integer.parseInt(JOptionPane.showInputDialog("Enter a number of seconds"));
		time.setUser(seconds);
		time.getUser();
		
		if(seconds >= 60 && seconds <= 3599){
			JOptionPane.showMessageDialog(null, "There is " + formatter.format(time.printMinutes()) + " minute(s) in that number of seconds");
		}
		else if(seconds >= 3600 && seconds <= 86399){
			
			JOptionPane.showMessageDialog(null, "There is " + formatter.format(time.printMinutes()) + " minute(s) in that number of seconds\nThere is " + formatter.format(time.printHours()) + " hours(s) in that number of seconds");
		}
		else if(seconds >= 86400){
			
			JOptionPane.showMessageDialog(null, "There is " + formatter.format(time.printMinutes()) + " minute(s) in that number of seconds\nThere is " + formatter.format(time.printHours()) + " hours(s) in that number of seconds\nThere are " + formatter.format(time.printDays()) + "  day(s) in that number of seconds");
		}
		else{
			JOptionPane.showInputDialog("That is less than a minute");
		}
		userInput.close();
		System.exit(0);
	}

}
