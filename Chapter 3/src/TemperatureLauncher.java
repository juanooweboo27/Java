import java.util.Scanner;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class TemperatureLauncher {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		DecimalFormat formatter = new DecimalFormat("###,###.00");
		double num = Double.parseDouble(JOptionPane.showInputDialog("How cold is it?"));
		Temperature temp = new Temperature(num);
		JOptionPane.showInputDialog("In Degrees Celsius: " + formatter.format(temp.getCelsius()) 
									+ "\nIn Degrees Kelvin: " + formatter.format(temp.getKelvin()));
		
		userInput.close();
		System.exit(0);
	}

}
