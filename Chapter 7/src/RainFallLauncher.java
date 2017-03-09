import java.text.DecimalFormat;
import java.util.Scanner;

public class RainFallLauncher {

	public static void main(String[] args) {
		final int ONE_YEAR = 12; //Final variable that holds the size of the array
		double[] rainDrops = new double[ONE_YEAR];//Array with 12 numbers
		
		getValue(rainDrops);
		RainFall rain = new RainFall(rainDrops);//Instance of RaniFall Class
		
		DecimalFormat formatter = new DecimalFormat("###,###.00");//Formatter
		
		System.out.println();
		
		System.out.println("The total amount of raindrops were " + rain.getTotal());
		System.out.println("The average amount of raindrops " + rain.getAverage());
		System.out.println("The highest amount of raindrops were " + rain.getHighest());
		System.out.println("The lowest amount of raindrops were " + rain.getLowest());
	}
	//Method that gets the amount of rain drops for each month
	private static void getValue(double[] array){
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter the amount of rain drops for each month ");
		for(int i = 0; i < array.length; i++){
			System.out.println("Month " + (i + 1) + ": ");
			array[i] = userInput.nextDouble();
		}
	}
}
