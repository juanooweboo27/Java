
public class HandsOnTestPractice {

	public static void main(String[] args) {
		
		double jillPaid = 65.43 * 235;
		double commission = .03 * jillPaid;
		double billSoldFor = 124.56 * 167;
		double billCommission = .06 * billSoldFor;
		//double totalPaid = jillPaid - commission;
		//double totalSold = billSoldFor - billCommission;
		double myProfit = (billSoldFor - jillPaid) - (commission + billCommission);
		System.out.printf("Jill paid $%.2f\n", jillPaid);
		System.out.printf("I paid Jill $%.2f in commission.", commission);
		System.out.print("\n");
		System.out.printf("Bill sold the phones for $%.2f\n", billSoldFor);
		System.out.printf("I paid Bill $%.2f in commission.", billCommission);
		System.out.print("\n");
		System.out.printf("I made  $%.2f off of the transaction.", myProfit);

	}

}
