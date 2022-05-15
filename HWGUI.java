package finalProject;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class HWGUI extends StudyGUI {
	
	protected static String ActivityType = "Homework"; // shows name of task
	protected static JTextField tfTime; // time for each activity
	
	public static void showHWPlanner() {
		/*frame for the entire planner*/
		final JFrame frame= new JFrame("Daily Planner");
		frame.setBounds(100,100,369,262);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		frame.getContentPane().setLayout(null);
		/*time spent labor*/
		JLabel lblHWTime = new JLabel("Time Spent on");
		lblHWTime.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblHWTime.setBounds(10, 85, 177, 27);
		frame.getContentPane().add(lblHWTime);
		/*user input time*/
		tfTime = new JTextField();
		tfTime.setBounds(135, 88, 98, 25);
		frame.getContentPane().add(tfTime);
		tfTime.setColumns(10);
		/*prompts user input for minutes*/
		JLabel lblMinutes = new JLabel("minutes");
		lblMinutes.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMinutes.setBounds(243, 85, 79, 27);
		frame.getContentPane().add(lblMinutes);
		/*back button*/
		JButton btnHWBack = new JButton("Back");
		btnHWBack.setBounds(135, 134, 79, 37);
		frame.getContentPane().add(btnHWBack);
		btnHWBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Activity activity = new Activity(Double.parseDouble(tfTime.getText()), ActivityType);
				CompleteDayGUI.addActivityTime(activity);
				frame.setVisible(false);
				StudyGUI.showStudyPlanner();	
			}
		});
		/*homework label*/
		JLabel lblHW = new JLabel("HW");
		lblHW.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblHW.setBounds(153, 31, 79, 27);
		frame.getContentPane().add(lblHW);
		
		JLabel lblNewLabel = new JLabel("Homework:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(10, 123, 92, 14);
		frame.getContentPane().add(lblNewLabel);

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

	public static void main(String[] args) {
		showHWPlanner(); //displays GUI
	}
}
