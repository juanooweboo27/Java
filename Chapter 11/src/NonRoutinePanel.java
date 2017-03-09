import java.awt.*;
import javax.swing.*;
public class NonRoutinePanel extends JPanel{
	public final double CHARGE = 20.00;
	private JTextField parts;
	private JTextField hours;
	public NonRoutinePanel() {
		setLayout(new GridLayout(2, 1));
		
		JLabel partsLabel = new JLabel("Parts Charges:");
		parts = new JTextField(10);
		JLabel hoursLabel = new JLabel("Hours of Labor:");
		hours = new JTextField(10);
		
		setBorder(BorderFactory.createTitledBorder("Nonroutine Services"));
		add(partsLabel);
		add(parts);
		add(hoursLabel);
		add(hours);
	}
	public double getCost(){
		double total = 0.0;
		String inputOne;
		String inputTwo;
		inputOne = parts.getText();
		inputTwo = hours.getText();
		total = (Double.parseDouble(inputOne) + (Double.parseDouble(inputTwo) * CHARGE));
		return total;
	}
	

}
