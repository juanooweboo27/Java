import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Sales {

	public static void main(String[] args) throws FileNotFoundException {
	Scanner userInput = new Scanner(System.in);
	String fileName = "WeeklySales.txt";
	PrintWriter output = new PrintWriter(fileName);
	int days = 5;
	double sales = -1;
	double totalSales = 0.0;
	DecimalFormat formatter = new DecimalFormat("$###,###.00");
	
	while(sales < 0){
	for(int i = 1; i <= days; i++){
		System.out.println("Enter the number of sales for the day");
		sales = userInput.nextDouble();
		if(sales < 0){
			System.out.println("Please enter a valid number");
			System.out.println("Enter the number of sales for the day");
			sales = userInput.nextDouble();
			}
		totalSales += sales;
		}
	}
	
	System.out.println("The total sales for the week are " + formatter.format(totalSales));
	output.println("The Total sales for the week are " + formatter.format(totalSales));
	output.close();
	}
}
