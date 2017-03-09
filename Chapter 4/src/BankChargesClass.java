
public class BankChargesClass {
	/*private final double bankCharge = 10.00;
	private final double extraCharge = 15.00;
	*/
	private int numChecks;
	//private double balance;
	
	private double finalBalance;
	//private double bankFees;
	
	public BankChargesClass() {
		// TODO Auto-generated constructor stub
	}
	public void setBalance(double b){
		this.finalBalance = b;
		
	}
	public double getBalance(){
		return finalBalance;
	}
	public void setChecks(int c) {
		this.numChecks = c;
	}
	public double getChecks() {
		return numChecks;
	}
	public double getFees(){
		double fees = 0;
		
		if(finalBalance < 400){
			fees += 15.00;
		}
		fees += 10;
		if(numChecks < 20){
			fees += (numChecks * .10);
		}
		else if(numChecks >= 20 && numChecks <= 39) {
			fees += (numChecks * .08);
		}
		else if(numChecks >= 40 && numChecks <= 59) {
			fees += (numChecks * .06);
		}
		else {
			fees += (numChecks * .04);
		}
		
		
		return fees;
	}

}
