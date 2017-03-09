import java.util.Scanner;

public class ChargesLauncher {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		ChargeAccount charge = new ChargeAccount();
				
		int myVar = 0;
		
		do{
			System.out.println("Enter your id number or type 000 to quit");
			myVar = userInput.nextInt();
			if(myVar != 000){
				if(charge.searchMethod(myVar) == -1){
					System.out.println("please enter a valid number");
				}
				else {
					System.out.println("Valid number");
				}
			
			}
		}while(myVar != 000);{
	
		}
	}

}
