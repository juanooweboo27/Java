
public class energyDrinkConsumption {

	public static void main(String[] args) {
		int customer = 15000;
		double oneOrMore = customer * .018; //finds 18% of customers
		double citrusDrinksOnly = customer * .058; //finds 58% of customers
		System.out.printf("Out of " + customer + 
				" customers, %.2f purchased one or more enregy drinks a week \n "
				+ "%.2f Drank citrus drinks only", 
				oneOrMore, citrusDrinksOnly); //Prints the output

	}

}
