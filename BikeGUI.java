package finalProject;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class BikeGUI extends ExerciseGUI {
	
	protected static String ActivityType = "Bike"; // shows name of task
	protected static JTextField tfTime; // time for each activity
	
	public static void showBikePlanner() {
		/*main fram*/
		final JFrame frame= new JFrame("Daily Planner");
		frame.setBounds(100,100,369,262);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		frame.getContentPane().setLayout(null);
		/*bike time label*/
		JLabel lblBikeTime = new JLabel("Time Spent Biking:");
		lblBikeTime.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblBikeTime.setBounds(10, 80, 177, 27);
		frame.getContentPane().add(lblBikeTime);
		/*user input for time*/
		tfTime = new JTextField();
		tfTime.setBounds(154, 83, 98, 25);
		frame.getContentPane().add(tfTime);
		tfTime.setColumns(10);
		/*prompts user for minutes*/
		JLabel lblMinutes = new JLabel("minutes");
		lblMinutes.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMinutes.setBounds(262, 80, 79, 27);
		frame.getContentPane().add(lblMinutes);
		/*back button*/
		JButton btnBikeBack = new JButton("Back");
		btnBikeBack.setBounds(143, 139, 79, 37);
		frame.getContentPane().add(btnBikeBack);
		btnBikeBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Activity activity = new Activity(Double.parseDouble(tfTime.getText()), ActivityType);
				CompleteDayGUI.addActivityTime(activity);
				frame.setVisible(false);
				ExerciseGUI.showExercisePlanner();	
			}
		});
		/*bike label*/
		JLabel lblBike = new JLabel("Bike");
		lblBike.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblBike.setBounds(154, 30, 79, 27);
		frame.getContentPane().add(lblBike);
		
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
		showBikePlanner(); //displays GUI
	}
}