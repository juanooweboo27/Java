import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class DisplayGUI extends JFrame{
	private BasketBallPanel basketballPlayer;
	private JPanel buttonPanel;
	private JButton display;
	private JButton exit;
	public DisplayGUI() {
		super("Who's your favorite NBA Legend?");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		basketballPlayer = new BasketBallPanel();
		buildButtonPanel();
		add(basketballPlayer, BorderLayout.NORTH);
		add(buttonPanel, BorderLayout.SOUTH);
		pack();
		setVisible(true);
	}
	private void buildButtonPanel(){
		buttonPanel = new JPanel();
		display = new JButton("Display Legend Details");
		exit = new JButton("Exit");
		display.addActionListener(new DisplayButtonListener());
		exit.addActionListener(new ExitButtonListener());
		buttonPanel.add(display);
		buttonPanel.add(exit);
	}
	private class DisplayButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			JOptionPane.showMessageDialog(null, basketballPlayer.toString());
		}
	}
	private class ExitButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			System.exit(0);
		}
	}
	public static void main(String[] args){
		new DisplayGUI();
	}

}
