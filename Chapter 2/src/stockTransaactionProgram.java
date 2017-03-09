
public class stockTransaactionProgram {

	public static void main(String[] args) {
		double paidAmount = 32.87 * 1000;//Calculates the amount paid for stock
		double commission = paidAmount * .02;//Calculates the amount of commission charged
		double soldAmount = 33.92 * 1000;//Calculates the amount the stock was sold for
		double soldCommission = soldAmount * .02;//Calculates the amount of commission charged for the sale
		double totalPaid = paidAmount - commission;//Calculates the total amount the stock was paid for
		double totalSold = soldAmount - soldCommission;//Calculates the total amount the stock was sold for
		double profitMade = totalSold - totalPaid;//Calculates the profit made off the transaction
		
		System.out.printf("The amount of money Joe paid for the stock was: $%d\n", 32870);
		System.out.printf("The amount of comission Joe paid the broker when he bought the stock: $%.2f\n", commission);
		System.out.printf("The amount Joe sold the stock for: $%.2f\n", soldAmount);
		System.out.printf("The amount of commission Joe paid the broker when he sold the stock was: $%.2f\n", soldCommission);
		System.out.printf("Joe bought the stock for a total of $%.2f\n", totalPaid);
		System.out.printf("Joe sold it for a total of $%.2f\n", totalSold);
		System.out.printf("Joe made a total of $%.2f\n off of the transaction", profitMade);
	}

}
//657.40
//678.4
//32870 ---- paid amount
//33920 ---- sold amount