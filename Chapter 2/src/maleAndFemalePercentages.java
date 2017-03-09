import java.util.Scanner;

public class maleAndFemalePercentages {

	public static void main(String[] args) {
		double males;
		double females;
		double total;
		double percentOfMales;
		double percentOfFemales;
		Scanner userInput = new Scanner(System.in);//Creates scanner object that accepts user input
		System.out.println("How many males are registered for your class?");
		males = userInput.nextDouble();
		System.out.println("How many females are registered for your class?");
		females = userInput.nextDouble();
		total = males + females;//Adds the amount of females and males in a class together
		percentOfMales = males / total;//Finds the percentage of males in one class
		percentOfFemales = females / total;//Finds the percentage of females in one class
		System.out.println("There are " + total + " students registered for your class, \n " + 
		percentOfMales + "% are males, \n " + 
		percentOfFemales + "% are females.");//Prints the output
		userInput.close();//Closes scanner object so that the program has no warnings
	}

}
