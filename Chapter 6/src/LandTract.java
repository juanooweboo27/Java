
public class LandTract {
	
	//Instance fields
	private int length;
	private int width;
	public LandTract() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the length
	 */
	public int getLength() {
		return length;
	}
	/**
	 * @param length the length to set
	 */
	public void setLength(int length) {
		this.length = length;
	}
	/**
	 * @return the width
	 */
	public int getWidth() {
		return width;
	}
	/**
	 * @param width the width to set
	 */
	public void setWidth(int width) {
		this.width = width;
	}
	public int getArea(){
		return (length*width);
	}
	//Equals method to check if objects areas are equal
	public boolean equals(LandTract obj){
		
		boolean status;
		if(LandTract.class.equals(obj) && 
			LandTract.this.getArea() == obj.getArea()){
			status = true;
		}
		else {
			status = false;
		}
		return status;
	}
	
	//toString method to format output
	public String toString(){
		String output = "Length: " + length + "\n";
		output += "Width: " + width + "\n";
		output += "Area: " + getArea();
		return output;
	}

}
