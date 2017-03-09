
public class SumOfNumbers {
	private int input;
	public SumOfNumbers() {
		// TODO Auto-generated constructor stub
	}
	public void setInput(int i){
		this.input = i;
	}
	public int getInput(){
		return input;
	}
	public int getSum(){
		int sum = 0;
		for(int i = 0; i < input; i++){
			sum += i;
		}
		return sum;
	}

}
