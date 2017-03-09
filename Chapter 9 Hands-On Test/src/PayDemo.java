import java.text.DecimalFormat;
import java.util.Scanner;

public class PayDemo {

	public static void main(String[] args) {
		DecimalFormat formatter = new DecimalFormat("$###,###,###.00");
		Pay pay = new Pay();
		double[] wages = {17.25, 40.75, 15.0, 12.0, 20.65, 25.50, 13.5};
		String[] employees = {"Joe", "Jill", "Jack", "Jessica", "James", "Jenn", "Jim"};
		for(String val: employees){
			System.out.print(val + "\t\t");
			
		}
		System.out.println();
		for(double w: pay.employeeRaise(wages)){
			System.out.print(formatter.format(w) + "\t\t");
		}
		pay.displayHighLow(wages, employees);
		
		
		String[] companyNames = {"Comapny A", "Company B", "Company C"};
		double[][] sales = { {153,354.00, 453,213.80, 743,234.75, 475,985.12} , 
				{546,124.23, 521,124.33, 854,154.23, 546,124.22}, 
				{537,124.23, 224,527.13, 200,253.64, 765,200.52} };
		//Scanner userInput = new Scanner(System.in);
		for(int row = 0; row < sales.length; row++){
			for(int col = 0; col < sales[row].length; col++){
				for(int i = 0; i < companyNames.length; i++){
				System.out.print(formatter.format(sales[row][col]) + "\t\t");
				}
				
			}
			
		}
	}

}
