
public class TestScores {
	//Instance fields
	private double score1;
	private double score2;
	private double score3;
	//Default Constructor
	public TestScores(double num1, double num2, double num3) {
		// TODO Auto-generated constructor stub
	}
	//Getters and Setters
	public void setScore1(double s1)
	{
		this.score1 = s1;
	}
	public double getScore1() {
		//returns a value
		return score1;
	}
	public void setScore2(double s2)
	{
		this.score2 = s2;
	}
	public double getScore2() {
		return score2;
	}
	public void setScore3(double s3)
	{
		this.score3 = s3;
	}
	public double getScore3() {
		return score3;
	}
	//Method to get average of 3 test scores
	public double averageScore(double s1, double s2, double s3) {
		return (s1 + s2 + s3) / 3;
	}
}
