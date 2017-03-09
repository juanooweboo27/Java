import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import java.util.Scanner;

public class SoftwareSalesLauncher {

	public static void main(String[] args) {
		SoftwareSales quantity = new SoftwareSales();
		DecimalFormat formatter = new DecimalFormat("$###,###.00");
		Scanner userInput = new Scanner(System.in);
		int items = Integer.parseInt(JOptionPane.showInputDialog("Every item costs $99, but if you perchase 10 or more, a special discount will be credited\n\n"
				+ "How many items do you want to buy?"));
		quantity.setQuantity(items);
		items = quantity.getQuantity();
		final double price = 99.0;
		formatter.format(price);
		double total = price * items;
		double discount;
		if(items > 0 && items < 10){
			JOptionPane.showInputDialog("You bought " + items + " items, which costs " + formatter.format(total) + " no discount receeived.");
		}
		else if(items >= 10 && items <= 19) {
			discount = total * .20;
			
			JOptionPane.showInputDialog("You bought " + items + " items, which costs " + formatter.format(discount) + " you received a 20% discount.");
		}
		else if(items >= 20 && items <= 49) {
			discount = total * .30;
			
			JOptionPane.showInputDialog("You bought " + items + " items, which costs " + formatter.format(discount) + " you received a 30% discount.");
		}
		else if(items >= 50 && items <= 99) {
			discount = total * .40;
			
			JOptionPane.showInputDialog("You bought " + items + " items, which costs " + formatter.format(discount) + " you received a 40% discount.");
		}
		else if(items >= 100) {
			discount = total * .50;
			
			JOptionPane.showInputDialog("You bought " + items + " items, which costs " + formatter.format(discount) + " you received a 50% discount.");
		}
		System.exit(0);
		

	}

}
