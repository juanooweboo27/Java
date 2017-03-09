import java.text.DecimalFormat;

public class RunningTheRaceLauncher {

	public static void main(String[] args) {
		//Instantiates 3 objects
		RunningTheRace first = new RunningTheRace();
		RunningTheRace second = new RunningTheRace();
		RunningTheRace third = new RunningTheRace();
		
		//Sets values for objects
		first.setFirst("Jane");
		second.setSecond("Joe");
		third.setThird("Jack");
		first.setMin(4);
		second.setMin(5);
		third.setMin(7);
		
		//Prints output
		System.out.println(first.getFirst() + " finished in first Place at a time of " + first.getMin() + " minutes");
		System.out.println();
		System.out.println(second.getSecond() + " finished in second Place at a time of " + second.getMin() + " minutes");
		System.out.println();
		System.out.println(third.getThird() + " finished in third Place at a time of " + third.getMin() + " minutes");

	}

}
