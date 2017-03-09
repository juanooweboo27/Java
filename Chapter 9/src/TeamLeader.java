public class TeamLeader extends ProductionWorker{
	//Instance fields
	private double monthlyBonus;
	private double requiredTrainingHours;
	private double numTrainingHours;
	public TeamLeader() {
		//super("Team Leader");
	}
	/**
	 * @return the monthlyBonus
	 */
	public double getMonthlyBonus() {
		return monthlyBonus;
	}
	/**
	 * @param monthlyBonus the monthlyBonus to set
	 */
	public void setMonthlyBonus(double monthlyBonus) {
		this.monthlyBonus = monthlyBonus;
	}
	/**
	 * @return the requiredTrainingHours
	 */
	public double getRequiredTrainingHours() {
		return requiredTrainingHours;
	}
	/**
	 * @param requiredTrainingHours the requiredTrainingHours to set
	 */
	public void setRequiredTrainingHours(double requiredTrainingHours) {
		this.requiredTrainingHours = requiredTrainingHours;
	}
	/**
	 * @return the numTrainingHours
	 */
	public double getNumTrainingHours() {
		return numTrainingHours;
	}
	/**
	 * @param numTrainingHours the numTrainingHours to set
	 */
	public void setNumTrainingHours(double numTrainingHours) {
		this.numTrainingHours = numTrainingHours;
	}
	

}
