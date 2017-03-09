public class GradedActivity {
	//Instance fields
	private double score;
	public GradedActivity() {
		// TODO Auto-generated constructor stub
	}
	//sets value for the score
	public void setScore(double s){
		this.score = s;
	}
	//returns value for score
	public double getScore(){
		return score;
	}
	//method to get the letter grade
	public char getGrade(){
		char letterGrade = ' ';
		if(score >= 90){
			letterGrade = 'A';
		}
		else if(score >= 80){
			letterGrade = 'B';
		}
		else if(score >= 70){
			letterGrade = 'C';
		}
		else if(score >= 60){
			letterGrade = 'D';
		}
		else{
			letterGrade = 'F';
		}
		return letterGrade;
	}
	

}
