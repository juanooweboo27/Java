
public class WidgetFactory {
	private double numWidgets;
	public WidgetFactory(int numWid) {
		// TODO Auto-generated constructor stub
	}
	
	
	public double getNumWidgets() {
		
		return numWidgets / (10 * 8 * 2);
		
	}


	public void setNumWidgets(double numH) {
		this.numWidgets = numH;
	}

}
