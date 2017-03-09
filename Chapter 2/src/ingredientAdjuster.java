import java.util.Scanner;

public class ingredientAdjuster {

	public static void main(String[] args) {
	double rSugar = 1.5;
	double rButter = 1;
	double rFlour = 2.75;
	System.out.println("The recipe to make 48 cookies is listed below \n"
			+ " 1.5 cups of sugar \n 1 cup of butter \n 2.75 cups of flour");
	System.out.println("How many cookies do you want to bake?");
	Scanner userInput = new Scanner(System.in); //Creates scanner object that accepts user input 
	double yourCookie = userInput.nextDouble(); 
    double yourSugar = yourCookie * (rSugar / 48); 
  //Calculates how much sugar it takes to make the the amount of cookies you want to make
    double yourButter = yourCookie * (rButter / 48);
  //Calculates how much butter it takes to make the the amount of cookies
    double yourFlour = yourCookie * (rFlour / 48);
  //Calculates how much flour it takes to make the the amount of cookies
    System.out.println("In order to make " 
    					+ yourCookie + " cookie(s), you will need " 
    					+ yourSugar + " cups of sugar \n " + yourButter + 
    					" cups of butter \n and " + yourFlour + " cups of flour."); //Prints the output
     userInput.close();//Closes scanner object so that the program has no warnings
	}

}
