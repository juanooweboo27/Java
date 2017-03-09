import java.util.Scanner;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class CircleClassLauncher {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);//Accepts user Input
		double radius = Double.parseDouble(JOptionPane.showInputDialog("What is the radius?"));
		DecimalFormat formatter = new DecimalFormat("#.00");
		//System.out.println("What is the radius?");
		//radius = userInput.nextDouble();
		//Instantiates an object and accepts an argument
		CircleClass circle = new CircleClass(radius); 
		
		JOptionPane.showInputDialog("The area of the circle: " + formatter.format(circle.getArea()) 
		+ "\nThe diameter of the circle: " + formatter.format(circle.getDiameter()) 
		+ "\nThe circumference of the circle: " + formatter.format(circle.getCircumference()) );
		

	}

}
