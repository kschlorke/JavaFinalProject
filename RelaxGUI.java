package finalProject;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import java.awt.Font;

public class RelaxGUI extends PlannerGUI {
	

	protected static JTextField tfTime;
	
	public static void showRelaxPlanner() {
		/*frame for the entire planner*/
		final JFrame frame= new JFrame("Daily Planner");
		frame.setBounds(100,100,369,262);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		/*button to select the read option*/
		JButton btnRun = new JButton("Read");
		btnRun.setBounds(10, 88, 96, 46);
		frame.getContentPane().add(btnRun);
		btnRun.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.setVisible(false);
				ReadGUI.showReadPlanner();
			}
		});
		/*button to select the phone option*/
		JButton btnYoga = new JButton("Phone");
		btnYoga.setBounds(116, 88, 117, 46);
		frame.getContentPane().add(btnYoga);
		btnYoga.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.setVisible(false);
				PhoneGUI.showPhonePlanner();
			}
		});
		/*button to select the friends option*/
		JButton btnBike = new JButton("Friends");
		btnBike.setBounds(243, 88, 100, 46);
		frame.getContentPane().add(btnBike);
		btnBike.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.setVisible(false);
				FriendsGUI.showFriendsPlanner();
			}
		});
		/*label for the page as relax*/
		JLabel lblRelax = new JLabel("Relax");
		lblRelax.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblRelax.setBounds(148, 29, 119, 22);
		frame.getContentPane().add(lblRelax);
		/*goes back to the main menu*/
		JButton btnRelaxBack = new JButton("Back");
		btnRelaxBack.setBounds(116, 158, 117, 39);
		frame.getContentPane().add(btnRelaxBack);
		/*when a person goes back, it goes back to the three activities*/
		btnRelaxBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//CompleteDayGUI.setActivityTime(Double.parseDouble(tfTime.getText()));
				frame.setVisible(false);
				PlannerGUI.showPlanner();	
			}
	
		});
		
		frame.setVisible(true); //window is visible
	}
	public static void main(String[] args) {
		showRelaxPlanner(); //displays GUI
	}
}
