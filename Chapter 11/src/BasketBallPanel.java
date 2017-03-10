import java.awt.*;
import javax.swing.*;
public class BasketBallPanel extends JPanel{
	private JTextField basketBallPlayer;
	public BasketBallPanel() {
		setLayout(new GridLayout(2, 1));
		
		JLabel playerLabel = new JLabel("Enter a Basketball Player");
		basketBallPlayer = new JTextField(10);
		setBorder(BorderFactory.createTitledBorder("NBA Legends"));
		add(playerLabel);
		add(basketBallPlayer);
	}
	public String toString(){
		String str = " ";
		if(basketBallPlayer.getText().equalsIgnoreCase("kobe")){
			str = "Kobe Bryant is a 5-time NBA Champion"
					+ "\n2-time finals MVP"
					+ "\n2-time Olympic gold medalist"
					+ "\n2-time scoring champion"
					+ "\n1-time NBA MVP";
		}
		if(basketBallPlayer.getText().equalsIgnoreCase("jordan")){
			str = "Michael Jordan is a 6-time NBA Champion"
					+ "\n6-time finals MVP"
					+ "\n2-time Olympic gold medalist"
					+ "\n10-time scoring champion"
					+ "\n5-time NBA MVP";
		}
		if(basketBallPlayer.getText().equalsIgnoreCase("lebron")){
			str = "Michael Jordan is a 3-time NBA Champion"
					+ "\n3-time finals MVP"
					+ "\n2-time Olympic gold medalist"
					+ "\n1-time scoring champion"
					+ "\n4-time NBA MVP";
		}
		return str;
		
	}

}
