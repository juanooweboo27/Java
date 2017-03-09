
import java.util.Scanner;
import javax.swing.JOptionPane;


public class wordGame {

	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("Enter your name");
		int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age:\n"));
		String city = JOptionPane.showInputDialog("Enter your city");
		String college = JOptionPane.showInputDialog("Enter your college");
		String profession = JOptionPane.showInputDialog("Enter your profession");
		String animal = JOptionPane.showInputDialog("Enter the type of pet your animal is");
		String petName = JOptionPane.showInputDialog("Enter your pet's name");
		Scanner userInput = new Scanner(System.in);//Creates a scanner object that accepts user input
		JOptionPane.showInputDialog("There once was a person named " + name 
									+ " who lived in " + city +  ".\n" + "At the age of " 
									+ age + ", " + name + " went to college at " + college + ".\n" 
									+ name + " graduated and went to work as a " + profession + ".\nThen, " 
									+ name + " adopted a(n) " + animal + " named " 
									+ petName + ".\nThey both lived happily ever after.");
		
		userInput.close();//Closes scanner object so that the program has no warnings
	}

}
