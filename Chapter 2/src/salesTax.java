import java.util.Scanner;

public class salesTax {

	public static void main(String[] args) {
		
		
		System.out.println("What is your purchase amount?");
		
		Scanner userInput = new Scanner(System.in);//Creates a scanner object that accepts user input
		double purchaseAmount = userInput.nextDouble();
		double stateTax = 0.055 * purchaseAmount;//Calculates the state tax
		double countyTax = .02 * purchaseAmount;//Calculates the county tax
		double totalSalesTax = stateTax + countyTax;//Calculates the total tax amount
		double totalAmount = purchaseAmount + totalSalesTax;//Calculates the total amount
		
		System.out.printf("Purchase ammount ---------- $%.2f\n",  purchaseAmount);
		System.out.printf("State Tax ---------- $%.2f\n", stateTax);
		System.out.printf("County Tax ---------- $%.2f\n", countyTax);
		System.out.printf("Total sales tax ---------- $%.2f\n", totalSalesTax);
		System.out.printf("Total ---------- $%.2f\n", totalAmount);
		userInput.close();//Closes scanner object so that the program has no warnings

	}

}
