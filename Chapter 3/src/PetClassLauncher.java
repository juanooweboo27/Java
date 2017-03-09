import java.util.Scanner;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class PetClassLauncher {

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);//Accepts user Input
		String name = JOptionPane.showInputDialog("What is your pet's name?");
		String type = JOptionPane.showInputDialog("What type of animal is your pet?");
		int age = Integer.parseInt(JOptionPane.showInputDialog("How old is your pet?"));
		
		//Instantiates an object and passes three arguments through
		PetClass pet = new PetClass(name, type, age); 
		pet.setName(name);
		pet.setType(type);
		pet.setAge(age);
		JOptionPane.showInputDialog("Pet name: " + pet.getName() + "\nPet type: " + pet.getType() + "\nPet age: " + pet.getAge());
		
	}

}
