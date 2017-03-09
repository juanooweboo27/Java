
public class DistanceTraveled {
	private double MilesPerHour;//Instance field for milesPerHour
	private double hours;//Instance field for hours driven
	/**
	 * @return the milesPerHour
	 */
	public double getMilesPerHour() {
		return MilesPerHour;
	}
	/**
	 * @param milesPerHour the milesPerHour to set
	 */
	public void setMilesPerHour(double milesPerHour) {
		MilesPerHour = milesPerHour;
	}
	/**
	 * @return the hours
	 */
	public double getHours() {
		return hours;
	}
	/**
	 * @param hours the hours to set
	 */
	public void setHours(double hours) {
		this.hours = hours;
	}
	public DistanceTraveled() {
		// TODO Auto-generated constructor stub
	}
	public double getDistance(){//Returns the total distance
		return MilesPerHour * hours;
	}

}
