
public class PayRoll {
	private int[] idNums = {5658845, 4520125, 7895122, 
			8777541, 8451277, 1302850, 7580489};
	private int[] hours = new int [7];
	private double[] payRate = new double[7];
	private double[] wages = new double[7];
	private int i = 0;
	public PayRoll() {
		// TODO Auto-generated constructor stub
	}
	public void addIncre(){
		i++;
	}
	public int[] getIdNum(){
		return idNums;
	}
	public void setHours(int hours){
		this.hours[i] = hours;
	}
	public int[] getHours(){
		return hours;
	}
	public void setPayRate(double pay){
		this.payRate[i] = pay;
	}
	public double[] getPayRate(){
		return payRate;
	}
	public void setWages(){
		this.wages[i] = (payRate[i] * hours[i]);
	}
	public double[] getWages(){
		return wages;
	}

}
