import java.util.Formatter;
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class FatGramLauncher {

	public static void main(String[] args) {
		FatGramClass info = new FatGramClass();//Instantiates object
		DecimalFormat formatter = new DecimalFormat("###,###.00");
		//Scanner userInput = new Scanner(System.in);//Accepts user input
		String item = JOptionPane.showInputDialog("Enter the food item you ate along with the total amount of calories and fat."
				+ "\nI will display the amount and percentage of calories from fat in that item.");
		info.setItem(item);//Set's value
		int fat = Integer.parseInt(JOptionPane.showInputDialog("Enter the total amount of fat in that item"));
		info.setFat(fat);//set's value
		int cal = Integer.parseInt(JOptionPane.showInputDialog(("Enter the total amount of calories in that item")));
		info.setCal(cal);//set's value
		if(info.getCalfromFat() > info.getCal()){
			JOptionPane.showMessageDialog(null, "Please inter a valid number of calories");
		}
		System.out.println(info.getCalPercentage());
		System.out.println(info.getCal() * .30);
		if(info.getCalPercentage() < (info.getCal() * .30)){
			JOptionPane.showMessageDialog(null, "The amount of calories from fat in that item is " 
										+ info.getCalfromFat() + "\nThe percentage of calories that comes from fat in that item is " 
										+ formatter.format(info.getCalPercentage()) + "\nThat item is low in fat!");
		}
		
		else if(info.getCalPercentage() >= (info.getCal() * .30)){
			JOptionPane.showMessageDialog(null, "The amount of calories from fat in that item is " 
										+ info.getCalfromFat() + "\nThe percentage of calories that comes from fat in that item is " 
										+ formatter.format(info.getCalPercentage()));
		}
	}

}
