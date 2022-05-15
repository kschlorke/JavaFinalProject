package finalProject;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import java.awt.Color;

public class RunGUI extends ExerciseGUI {
	
	protected static String ActivityType = "Run"; // shows name of task
	protected static JTextField tfTime; // time for each activity
	
	public static void showRunPlanner() {
		/*frame for the entire planner*/
		final JFrame frame= new JFrame("Daily Planner");
		frame.setBounds(100,100,369,262);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		frame.getContentPane().setLayout(null);
		/*activity time*/
		JLabel lblRunTime = new JLabel("Time Spent Running:");
		lblRunTime.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblRunTime.setBounds(10, 88, 177, 27);
		frame.getContentPane().add(lblRunTime);
		/*user inputted time (in minutes)*/
		tfTime = new JTextField();
		tfTime.setBounds(168, 91, 98, 25);
		frame.getContentPane().add(tfTime);
		tfTime.setColumns(10);
		/*if (tfTime == null || tfTime < 0) // I tried to add in some user input error to the text field because if they don't enter a number or a string, there is a big error. but I couldn't get it to work
		{
			double time = 0;
			time = Double.parseDouble(tfTime.getText());
		}*/
		/*label for minutes*/
		JLabel lblMinutes = new JLabel("minutes");
		lblMinutes.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMinutes.setBounds(276, 88, 79, 27);
		frame.getContentPane().add(lblMinutes);
		/*back button*/
		JButton btnRunBack = new JButton("Back");
		btnRunBack.setBounds(143, 139, 79, 37);
		frame.getContentPane().add(btnRunBack);
		btnRunBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				/*if (tfTime == null || tfTime < 0) // I tried in both spots because I wasn't sure which area it would go, but figured it'd be one of these two
				{
					double time = 0;
					time = Double.parseDouble(tfTime.getText());
				}*/
				Activity activity = new Activity(Double.parseDouble(tfTime.getText()), ActivityType);
				CompleteDayGUI.addActivityTime(activity);
				frame.setVisible(false);
				ExerciseGUI.showExercisePlanner();	
			}
		});
		/*run label*/
		JLabel lblRun = new JLabel("Run");
		lblRun.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblRun.setBounds(153, 31, 79, 27);
		frame.getContentPane().add(lblRun);

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
		showRunPlanner(); //displays GUI
	}
}


