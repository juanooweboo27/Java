
public class Pay {

	public Pay() {
		// TODO Auto-generated constructor stub
	}
	public double[] employeeRaise(double[] array){
		for(int i = 0; i < array.length; i++){
			array[i] += 2.00;
		}
		return array;
	}
	public void displayHighLow(double[] array, String[] array2){
		double highest = array[0];
		double lowest = array[0];
		for(int i = 1; i < array.length; i++){
			if(array[i] > highest){
				highest = array[i];
				
			}
			if(array[i] < lowest){
				lowest = array[i];
				
			}
		}
		System.out.println(highest);
		System.out.println(lowest);
	}

}
