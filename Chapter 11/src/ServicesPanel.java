import java.awt.*;
import javax.swing.*;
public class ServicesPanel extends JPanel{
	//Constants
	public final double OIL_CHANGE = 26.00;
	public final double LUBE_JOB = 18.00;
	public final double RADIATOR_FLUSH = 30.00;
	public final double TRANS_FLUSH = 80.00;
	public final double INSPECTION = 15.00;
	public final double MUFFLER_REP = 100.00;
	public final double TIRE_ROTATION = 20.00;
	//Check boxes
	private JCheckBox oil;
	private JCheckBox lube;
	private JCheckBox radiator;
	private JCheckBox trans;
	private JCheckBox inspec;
	private JCheckBox muffler;
	private JCheckBox tire;
	
	public ServicesPanel() {
		//grid layout
		setLayout(new GridLayout(7, 1));
		
		//Check Boxes
		oil = new JCheckBox("Oil Change ($26.00)");
		lube = new JCheckBox("Lube Job ($18.00)");
		radiator = new JCheckBox("Radiator Flush ($30.00)");
		trans = new JCheckBox("Transmission Flush ($80.00)");
		inspec = new JCheckBox("Inspection ($15.00)");
		muffler = new JCheckBox("Muffler Replacement ($100.00)");
		tire = new JCheckBox("Tire Rotation ($20.00)");
		
		//Border
		setBorder(BorderFactory.createTitledBorder("Routine Services"));
		
		//Add check boxes to panel
		add(oil);
		add(lube);
		add(radiator);
		add(trans);
		add(inspec);
		add(muffler);
		add(tire);
	}
	
	public double getRoutinCost(){
		double cost = 0.0;
		if(oil.isSelected()){
			cost += OIL_CHANGE;
		}
		if(lube.isSelected()){
			cost += LUBE_JOB;
		}
		if(radiator.isSelected()){
			cost += RADIATOR_FLUSH;
		}
		if(trans.isSelected()){
			cost += TRANS_FLUSH;
		}
		if(inspec.isSelected()){
			cost += INSPECTION;
		}
		if(muffler.isSelected()){
			cost += MUFFLER_REP;
		}
		if(tire.isSelected()){
			cost += TIRE_ROTATION;
		}
		return cost;
	}

}
