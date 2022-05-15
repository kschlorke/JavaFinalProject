package finalProject;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;


public class ReadGUI extends RelaxGUI {
	
	protected static String ActivityType = "Reading"; // shows name of task
	protected static final JTextField tfTime = new JTextField(); // time for each activity

	public static void showReadPlanner() {

		/*frame for the entire planner*/
		final JFrame frame= new JFrame("Daily Planner");
		frame.setBounds(100,100,369,262);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		frame.getContentPane().setLayout(null);
		/*read time label*/
		JLabel lblReadTime = new JLabel("Time Spent Reading:");
		lblReadTime.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblReadTime.setBounds(10, 88, 177, 27);
		frame.getContentPane().add(lblReadTime);
		/*user input time*/
		tfTime.setBounds(168, 91, 98, 25);
		frame.getContentPane().add(tfTime);
		tfTime.setColumns(10);
		/*prompts for minutes*/
		JLabel lblMinutes = new JLabel("minutes");
		lblMinutes.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMinutes.setBounds(276, 88, 79, 27);
		frame.getContentPane().add(lblMinutes);
		/*back button*/
		JButton btnReadBack = new JButton("Back");
		btnReadBack.setBounds(143, 139, 79, 37);
		frame.getContentPane().add(btnReadBack);
		btnReadBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Activity activity = new Activity(Double.parseDouble(tfTime.getText()), ActivityType);
				CompleteDayGUI.addActivityTime(activity);
				frame.setVisible(false);
				RelaxGUI.showRelaxPlanner();	
			}
		});
		/*read label*/
		JLabel lblRead = new JLabel("Read");
		lblRead.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblRead.setBounds(153, 31, 79, 27);
		frame.getContentPane().add(lblRead);

		/*i couldn't figure out how to set an empty text field to zero and would receive errors for the back button with no text. hopefully this will discourage people from doing it.*/
		JLabel lblErrorLabel1 = new JLabel("***Please enter a zero if you wish to go back");
		lblErrorLabel1.setForeground(Color.RED);
		lblErrorLabel1.setBounds(60, 175, 355, 25);
		frame.getContentPane().add(lblErrorLabel1);
		JLabel lblErrorLabel2 = new JLabel("without completing the task.***");
		lblErrorLabel2.setForeground(Color.RED);
		lblErrorLabel2.setBounds(109, 198, 177, 14);
		frame.getContentPane().add(lblErrorLabel2);
		
		frame.setVisible(true);
	}
	public JTextField getTime() {
		return tfTime;
	}
	public static void main(String[] args) {
		showReadPlanner(); //displays GUI
	}
	
}