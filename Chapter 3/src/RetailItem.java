
public class RetailItem {
	private String description;
	private int unitsOnHand;
	private double price;
	
	public RetailItem(String d, int unit, double p) {
		this.description = d;
		this.unitsOnHand = unit;
		this.price = p;
	}
	public void setDescription(String desc) {
		this.description = desc;
	}
	public String getDescription(){
		return description;
	}
	public void setUnits(int u) {
		this.unitsOnHand = u;
	}
	public int getUnits(){
		return unitsOnHand;
	}
	public void setPrice(double pr) {
		this.price = pr;
	}
	public double getPrice() {
		return price;
	}

}
