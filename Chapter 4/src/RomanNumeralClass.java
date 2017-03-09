
public class RomanNumeralClass {
	private String RomanNum;
	private int user;
	public RomanNumeralClass() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the romanNum
	 */
	public String getRomanNum() {
		return RomanNum;
	}
	/**
	 * @param romanNum the romanNum to set
	 */
	public void setRomanNum(int u) {
		switch(u){
		case 1:
			RomanNum = "I";
			break;
		case 2:
			RomanNum = "II";
			break;
		case 3:
			RomanNum = "III";
			break;
		case 4:
			RomanNum = "IV";
			break;
		case 5:
			RomanNum = "V";
			break;
		case 6:
			RomanNum = "VI";
			break;
		case 7:
			RomanNum = "VII";
			break;
		case 8:
			RomanNum = "VIII";
			break;
		case 9:
			RomanNum = "IX";
			break;
		case 10:
			RomanNum = "X";
			break;
		default:
			System.out.println("Please enter a valid value");
		}
		
	}
	public void printNum() {
		String rn = this.getRomanNum();
		switch (rn) {
		case "I":
		case "II":
		case "III":
		case "IV":
		case "V":
		case "VI":
		case "VII":
		case "VIII":
		case "IX":
		case "X":
			System.out.println(getRomanNum());
			break;
		default: System.out.println("Please enter a valid value");
		}
	}
	

}
