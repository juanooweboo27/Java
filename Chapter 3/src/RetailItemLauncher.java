
public class RetailItemLauncher {

	public static void main(String[] args) {
		RetailItem item1 = new RetailItem("Jacket", 12, 59.95);
		RetailItem item2 = new RetailItem("Designer Jeans", 40, 34.95);
		RetailItem item3 = new RetailItem("Shirt", 20, 24.95);
		
		System.out.println("Item #1     " + item1.getDescription() + "            " + item1.getUnits() + "     " + item1.getPrice());
		System.out.println("Item #2     " + item2.getDescription() + "    " + item2.getUnits() + "     " + item2.getPrice());
		System.out.println("Item #3     " + item3.getDescription() + "             " + item3.getUnits() + "     " + item3.getPrice());

	}

}
