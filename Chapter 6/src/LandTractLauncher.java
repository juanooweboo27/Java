import java.util.Scanner;//imports scanner class
public class LandTractLauncher {
	public static void main(String[] args) {
		int length;//variable for length
		int width;//variable for width
		int length2;//variable for second length
		int width2;//variable for second width
		LandTract landOne = new LandTract();//first object
		LandTract landTwo = new LandTract();//second object
		
		Scanner userInput = new Scanner(System.in);//accepts user input
		
		System.out.println("Enter the length for the first tract of land: ");
		length = userInput.nextInt();//sets the length to user input
		System.out.println("Enter the width for the first tract of land: ");
		width = userInput.nextInt();//sets the length to user input
		System.out.println("Enter the length for the second tract of land: ");
		length2 = userInput.nextInt();//sets second the length to user input
		System.out.println("Enter the width for the first tract of land: ");
		width2 = userInput.nextInt();//sets second the length to user input
		landOne.setLength(length);//sets the length 
		landOne.setWidth(width);//sets the width
		landTwo.setLength(length2);//sets second the length
		landTwo.setWidth(width2);//sets second the width
		
		
		
		
		
		if(landOne.getArea() == landTwo.getArea()){//if areas are equal prints the first output else prints the second
		System.out.print("Tract 1: " + landOne.toString() + "\n" + "Tract 2: " + landTwo.toString() + "\nThese two tracts are equal in dimensions");
		}
		else {
			System.out.print(landOne.toString() + "\n" + landTwo.toString());
		}
		

	}

}
