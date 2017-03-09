import java.util.Scanner;

public class WidgetFactoryLauncher {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.println("How any widgets do you want to make?");
		int numW = userInput.nextInt();
		WidgetFactory widget1 = new WidgetFactory(numW);
		widget1.setNumWidgets(numW);
		System.out.println("Making " + numW + " widgets will take " + widget1.getNumWidgets() + " day(s) of work.");
	}

}
