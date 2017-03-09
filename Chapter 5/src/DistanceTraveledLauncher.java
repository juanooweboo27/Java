import java.util.Scanner;

public class DistanceTraveledLauncher {

	public static void main(String[] args) {
		DistanceTraveled distance = new DistanceTraveled();//Instantiates the DistanceTraveled Object
		
		Scanner userInput = new Scanner(System.in);//Creates Scanner object to get userInput 
		
		//Initialize variables so that you can use them later and the user can run function
		
		double miles = -1;//Variable that represents the amount of miles driven
		
		double hours = 0;//Variable that gets the amount of hours driven
		
		while(miles < 0){//While miles is less than zero, you can run this loop
		System.out.println("Enter the number of miles you drove below:");
		miles = userInput.nextDouble();//Sets miles equal to what the user enters
		
		distance.setMilesPerHour(miles);//Sets miles equal to the milesPerHour instance field
		
		if(miles < 0) {//if miles entered is less than zero go back and try again
		System.out.println("Please enter a positive integer");	
			}
		}
		
		while(hours < 1){//while hours is less than 1 you can enter the loop
			
		System.out.println("Enter the number of hours your drove for below:");
		hours = userInput.nextDouble();//Sets hours equal to what the user enters
		
		distance.setHours(hours);//Sets hours equal to the hours Instance field
		
		if(hours < 1){//if hours entered is less than 1 go back and try again
			
			System.out.println("Please enter a number greater than 0");
			}
		}
		
		System.out.println("Hour\t\t\tDistance Traveled");//Prints output similar to a table format
		System.out.println("------------------------------");
		for(int i = 1; i <= hours; i++){//For loop that gets the total distance driven per mile driven
			distance.setHours(i);
			System.out.println(i + "\t\t\t" + distance.getDistance());
			}
		
	 }

}
