
public class ShippingChargesClass {
	private int weight;
	private double price;
	private int milesShipped;
	final private int numMiles = 500;
	public ShippingChargesClass() {
		// TODO Auto-generated constructor stub
	}
	public void setWeigth(int w){
		this.weight = w;
	}
	public int getWeight() {
		return weight;
	}
	public void setMiles(int m){
		this.milesShipped = m;
	}
	public int getMiles() {
		return milesShipped;
	}
	public double getRate(){
		
		if(weight <= 2 && milesShipped <= 500) {
			price = 1.10 * (milesShipped / numMiles);
		}
		else if(weight <= 2 && milesShipped > 500){
			price = 2.20 * (milesShipped / numMiles);
		}
		else if(weight > 2 && weight <= 6 && milesShipped == 500){
			price = 2.20 * (milesShipped / numMiles);
		}
		else if(weight > 2 && weight <= 6 && milesShipped > 500){
			price = 3.70 * (milesShipped / numMiles);
		}
		else if(weight > 6 && weight <= 10 && milesShipped == 500){
			price = 3.70 * (milesShipped / numMiles); 
		}
		else if(weight > 6 && weight <= 10 && milesShipped > 500){
			price = 4.80 * (milesShipped / numMiles); 
		}
		else if(weight > 10 && milesShipped == 500){
			price = 4.80 * (milesShipped / numMiles); 
		}
		return price;
	}

}
