package finalProject;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class FriendsGUI extends RelaxGUI {
	
	protected static String ActivityType = "Friends"; // shows name of task
	protected static JTextField tfTime; // time for each activity
	
	public static void showFriendsPlanner() {
		/*frame for the entire planner*/
		final JFrame frame= new JFrame("Daily Planner");
		frame.setBounds(100,100,369,262);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		frame.getContentPane().setLayout(null);
		/*time spent label*/
		JLabel lblFriendsTime = new JLabel("Time Spent");
		lblFriendsTime.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblFriendsTime.setBounds(30, 70, 98, 27);
		frame.getContentPane().add(lblFriendsTime);
		/*user input for time*/
		tfTime = new JTextField();
		tfTime.setBounds(135, 83, 98, 25);
		frame.getContentPane().add(tfTime);
		tfTime.setColumns(10);
		/*prompts for input*/
		JLabel lblMinutes = new JLabel("minutes");
		lblMinutes.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMinutes.setBounds(243, 80, 79, 27);
		frame.getContentPane().add(lblMinutes);
		/*back button*/
		JButton btnFriendsBack = new JButton("Back");
		btnFriendsBack.setBounds(143, 139, 79, 37);
		frame.getContentPane().add(btnFriendsBack);
		btnFriendsBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Activity activity = new Activity(Double.parseDouble(tfTime.getText()), ActivityType);
				CompleteDayGUI.addActivityTime(activity);
				frame.setVisible(false);
				RelaxGUI.showRelaxPlanner();	
			}
		});
		/*friends label*/
		JLabel lblFriends = new JLabel("Friends");
		lblFriends.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblFriends.setBounds(143, 28, 79, 27);
		frame.getContentPane().add(lblFriends);
		/*shows for time*/
		JLabel lblNewLabel = new JLabel("With Friends:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(30, 94, 98, 14);
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
		showFriendsPlanner(); //displays GUI
	}
}