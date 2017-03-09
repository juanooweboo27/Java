public class RainFall {
	
	private double[] rainDrops; //Array instance field
	public RainFall(double[] r) {
		// TODO Auto-generated constructor stub
		rainDrops = new double[r.length];
		for(int i = 0; i < r.length; i++){
			rainDrops[i] = r[i];
		}
	}
	//Return total
	public double getTotal(){
		double total = 0.0;
		for(double value : rainDrops){
			total += value;
		}
		return total;
	}
	//Return average
	public double getAverage(){
		return getTotal()/ rainDrops.length;
	}
	//return highest value
	public double getHighest(){
		double highest = rainDrops[0];
		for(int i = 1; i < rainDrops.length; i++){
			if(rainDrops[i] > highest){
				highest = rainDrops[i];
			}
		}
		return highest;
	}
	//return lowest value
	public double getLowest(){
		double lowest = rainDrops[0];
		for(int i = 1; i < rainDrops.length; i++){
			if(rainDrops[i] < lowest){
				lowest = rainDrops[i];
			}
		}
		return lowest;
	}

}
