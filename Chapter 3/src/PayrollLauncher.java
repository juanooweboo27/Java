import java.util.Scanner;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class PayrollLauncher {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);//Accepts user input
		DecimalFormat formatter = new DecimalFormat("$###,###.00");
		DecimalFormat formatter2 = new DecimalFormat("###,###.00");
		String name = JOptionPane.showInputDialog("What is your name?");
		
		int idNum = Integer.parseInt(JOptionPane.showInputDialog("What is your ID number?"));
		Payroll employee1 = new Payroll(name, idNum);//Instantiates object
		double pay = employee1.getHourlyPay();
		double hours = employee1.getHours();
		double gp = employee1.GrossPay(pay, hours);
		JOptionPane.showInputDialog("Employee Name\n" 
							+ name + "\n ID Number\n" 
							+ idNum + " Hourly pay rate\n" 
							+ formatter.format(pay) + "\n Hours worked\n" 
							+ formatter2.format(hours) + "\n Gross Pay\n" + formatter.format(gp)); 

	}

}
