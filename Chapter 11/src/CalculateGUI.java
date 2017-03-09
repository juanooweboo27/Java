import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.text.DecimalFormat;

public class CalculateGUI extends JFrame{
	private GreetingPanel greeting;
	private ServicesPanel services;
	private NonRoutinePanel nonRoutine;
	private JPanel buttonPanel;
	private JButton calc;
	private JButton exit;
	public CalculateGUI() {
		super("Ranken's Automotive Maintenace");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		greeting = new GreetingPanel();
		services = new ServicesPanel();
		nonRoutine = new NonRoutinePanel();
		buildButtonPanel();
		add(services, BorderLayout.NORTH);
		add(nonRoutine, BorderLayout.WEST);
		add(buttonPanel, BorderLayout.SOUTH);
		pack();
		setVisible(true);
	}
	private void buildButtonPanel(){
		buttonPanel = new JPanel();
		calc = new JButton("Calculate Charges");
		exit = new JButton("Exit");
		calc.addActionListener(new CalcButtonListener());
		exit.addActionListener(new ExitButtonListener());
		buttonPanel.add(calc);
		buttonPanel.add(exit);
	}
	private class CalcButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			double total;
			total = (services.getRoutinCost() + nonRoutine.getCost());
			DecimalFormat formatter = new DecimalFormat("$###,##0.00");
			JOptionPane.showMessageDialog(null, "Total Charges: " + formatter.format(total));
		}
	}
	private class ExitButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			System.exit(0);
		}
	}
	public static void main(String[] args){
		new CalculateGUI();
	}
}
