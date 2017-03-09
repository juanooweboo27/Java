
public class PassFailExam extends PassFailActivity{
	private int numQuestions;
	private double pointsEach;
	private int numMissed;
	public PassFailExam(int questions, int missed, double minPassing) {
		super(minPassing);
		double numericScore;
		this.numQuestions = questions;
		this.numMissed = missed;
		this.pointsEach = 100.0 / questions;
		numericScore = 100.0 - (missed * pointsEach);
		
		//call the superclaass's setScore method to 
		//set the numeric score 
		setScore(numericScore);
		
		
	}
	//the getPointsEach method returns the pointsEach field
	public double getPointsEach(){
		return this.pointsEach;
	}
	
	//the getNumMissed method returns the numMissed field 
	public int getNumMissed(){
		return numMissed;
	}
	
	
	

}
