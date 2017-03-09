public class ShiftSupervisor extends Employee {
	private double annualSalary;
	/**
	 * @return the annualSalary
	 */
	public double getAnnualSalary() {
		return annualSalary;
	}
	/**
	 * @param annualSalary the annualSalary to set
	 */
	public void setAnnualSalary(double annualSalary) {
		this.annualSalary = annualSalary;
	}
	/**
	 * @return the annualBonus
	 */
	public double getAnnualBonus() {
		return annualBonus;
	}
	/**
	 * @param annualBonus the annualBonus to set
	 */
	public void setAnnualBonus(double annualBonus) {
		this.annualBonus = annualBonus;
	}
	private double annualBonus;
	public ShiftSupervisor() {
		super("Shift Supervisor");
	}
}
