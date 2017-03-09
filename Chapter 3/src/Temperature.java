
public class Temperature {
	private double ftemp;

	public Temperature(double fer) {
		this.ftemp = fer;
	}
	public void setFahrenheit(double f) {
		this.ftemp = f;
	}
	public double getFahrenheit() {
		return ftemp;
	}
	public double getCelsius() {
		double cel;
		cel = (5.0 / 9.0) * (ftemp - 32.0);
		return cel;
	}
	public double getKelvin() {
		double kel;
		kel = ((5.0 / 9.0) * (ftemp - 32.0) + 273.0);
		return kel;
	}

}
