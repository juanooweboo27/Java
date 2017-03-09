public class FatGramClass {
	private int calorie;
	private int fat;
	private String item;
	private double calFromFat;
	private double calPercentage;
	public FatGramClass() {
		// TODO Auto-generated constructor stub
	}
	
	//Mutator
	public void setItem(String i) {
		this.item = i;
	}
	//Accessor
	public String getItem(){
		return item;
	}
	//Mutator
	public void setCal(int c) {
		this.calorie = c;
	}
	//Accessor
	public int getCal() {
		return calorie;
	}
	//Mutator
	public void setFat(int f) {
		this.fat = f;
	}
	//Accessor
	public int getFat(){
		return fat;
	}
	//Method to get the amount of calories in a gram of fat
	public double getCalfromFat() {
		calFromFat = (fat * 9);
		return calFromFat;
	}
	//method to get the percentage of calories  in a gram of fat
	public double getCalPercentage() {
		calPercentage = (calFromFat / calorie);
		return calPercentage;
	}

}
