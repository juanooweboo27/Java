
public class PassFailActivity extends GradedActivity{
	private double MinPassingScore;
	public PassFailActivity() {
		// TODO Auto-generated constructor stub
	}
	public PassFailActivity(double mps){
		this.MinPassingScore = mps;
	}
	
	public char getGrade(){
		char letterGrade;
		if(super.getGrade() >= this.MinPassingScore){
			letterGrade = 'P';
		}
		else{
			letterGrade = 'F';
		}
		return letterGrade;
	}
	

}
