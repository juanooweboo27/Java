
public class TimeCalculatorClass {
	private final double secondsInMinutes = 60;
	private final double minutesInHours = 60;
	private final double hoursInDays = 24;
	private double user;
	public TimeCalculatorClass() {
		// TODO Auto-generated constructor stub
	}
	public void setUser(int num) {
		this.user = num;
	}
	public double getUser() {
		return user;
	}
	public double printMinutes() {
		double minutes = (user / secondsInMinutes);
		return 	minutes;
	}
	public double printHours() {
		double hours = printMinutes() / minutesInHours;
		return hours;
	}
	public double printDays() {
		double days = printHours() / hoursInDays;
		return days;
	}

}
