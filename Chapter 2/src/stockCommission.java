
public class stockCommission {

	public static void main(String[] args) {
		int totalShares = 1000;
		double stockPrice = 25.50;
		double commissionCost = .02 * stockPrice;//Calculates the percentage of commission charged
		double totalCost = commissionCost + stockPrice;//Calculates the total amount
		System.out.println("Kathryn, you bought " + totalShares + " total shares");
		System.out.printf("The price of the shares was $%.2f\n", stockPrice);
		System.out.println("You were charged a $" + commissionCost + " commission cost for the transaction");
		System.out.printf("Your total is $%.2f\n", totalCost);

	}

}
