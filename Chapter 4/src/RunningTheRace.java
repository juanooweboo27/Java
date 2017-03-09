import java.util.Random;

public class RunningTheRace {
	private String firstPlace;
	private String secondPlace;
	private String thirdPlace;
	private int minutes;
	
	public RunningTheRace() {
		// TODO Auto-generated constructor stub
	}
	
	//mutator
	public void setFirst(String f){
		this.firstPlace = f;
	}
	
	//accessor
	public String getFirst(){
		return firstPlace;
	}
	
	//mutator
	public void setSecond(String s){
		this.secondPlace = s;
	}
	
	//accessor
	public String getSecond(){
		return secondPlace;
	}
	//mutator
	public void setThird(String t){
		this.thirdPlace = t;
	}
	//accessor
	public String getThird(){
		return thirdPlace;
	}
	
	//mutator
	public void setMin(int m){
		this.minutes = m;
	}
	
	//accessor
	public double getMin(){
		
		return minutes;
	}

	
	
}
