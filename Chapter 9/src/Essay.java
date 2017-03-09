public class Essay extends GradedActivity{
	//Instance fields
	private double grammer;
	private double spelling;
	private double correctLength;
	private double content;
	public Essay() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the grammer
	 */
	public double getGrammer() {
		return grammer;
	}
	/**
	 * @param grammer the grammer to set
	 */
	public void setGrammer(double grammer) {
		this.grammer = grammer;
	}
	/**
	 * @return the spelling
	 */
	public double getSpelling() {
		return spelling;
	}
	/**
	 * @param spelling the spelling to set
	 */
	public void setSpelling(double spelling) {
		this.spelling = spelling;
	}
	/**
	 * @return the correctLength
	 */
	public double getCorrectLength() {
		return correctLength;
	}
	/**
	 * @param correctLength the correctLength to set
	 */
	public void setCorrectLength(double correctLength) {
		this.correctLength = correctLength;
	}
	/**
	 * @return the content
	 */
	public double getContent() {
		return content;
	}
	/**
	 * @param content the content to set
	 */
	public void setContent(double content) {
		this.content = content;
	}
	//method to return a total
	
	public double getTotal(){
		return grammer + spelling + correctLength + content;
	}
	//Method to get letter grade
	public char getGrade(){
		char letterGrade = ' ';
		if(Essay.this.getTotal() >= 90){
			letterGrade = 'A';
		}
		else if(Essay.this.getTotal() >= 80){
			letterGrade = 'B';
		}
		else if(Essay.this.getTotal() >= 70){
			letterGrade = 'C';
		}
		else if(Essay.this.getTotal() >= 60){
			letterGrade = 'D';
		}
		else{
			letterGrade = 'F';
		}
		return letterGrade;
	}
	

}
