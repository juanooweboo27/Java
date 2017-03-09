import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class DistanceTraveledFileLauncher {

		public static void main(String[] args) throws FileNotFoundException {
			PrintWriter outputFile = new PrintWriter("distance.txt");
			DistanceTraveled distance = new DistanceTraveled();
			Scanner userInput = new Scanner(System.in);
			//Initialize variables so that you can use them later and the user can run function
			double miles = -1;
			double hours = 0;
			//While miles is less than zero, you can run this loop
			while(miles < 0){
			System.out.println("Enter the number of miles you drove below:");
			miles = userInput.nextDouble();
			distance.setMilesPerHour(miles);
			//if miles entered is less than zero go back and try again
			if(miles < 0) {
			System.out.println("Please enter a psitive integer");	
				}
			}
			//while hours is less than 1 you can enter the loop
			while(hours < 1){
			System.out.println("Enter the number of hours your drove for below:");
			hours = userInput.nextDouble();
			distance.setHours(hours);
			//if hours entered is less than 1 go back and try again
			if(hours < 1){
				System.out.println("Please enter a number greater than 0");
				}
			}
			//if(miles > 0 && hours > 0){
			outputFile.println("Hours\t\t\tDistance Traveled");
			outputFile.println("------------------------------");
			for(int i = 1; i <= hours; i++){
				distance.setHours(i);
				outputFile.println(i + "\t\t\t" + distance.getDistance());
				}
			//}
			outputFile.close();
		 }

}
