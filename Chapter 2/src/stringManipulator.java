import java.util.Scanner;

public class stringManipulator {

	public static void main(String[] args) {
		String favCity;
		String favCityUpper;
		String favCityLower;
		char firstLetter;
		int amountOfLetters;
		Scanner userInput = new Scanner(System.in);//Creates a scanner object that accepts user input
		System.out.println("What is the name of your favorite city?");
		favCity = userInput.nextLine();
		favCityUpper = favCity.toUpperCase();//Sets all letters upper case
		favCityLower = favCity.toLowerCase();//Sets all letters to lower case
		firstLetter = favCity.charAt(0);//Gets the first letter
		amountOfLetters = favCity.length();//Gets the amount of characters in one word
		System.out.println("Your favorite city, " + favCity + "\'s first letter is " + firstLetter + " and has " + amountOfLetters + " letters in it.");
		System.out.println("In all Caps it is displayed " + favCityUpper);
		System.out.println("In all lowercase letters it is displayed " + favCityLower);
		userInput.close();//Closes scanner object so that the program has no warnings
	}

}
