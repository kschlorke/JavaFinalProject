package finalProject;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;


public class PhoneGUI extends RelaxGUI {
	
	protected static String ActivityType = "Phone"; // shows name of task
	protected static JTextField tfTime; // time for each activity
	
	public static void showPhonePlanner() {
		/*frame for the entire planner*/
		final JFrame frame= new JFrame("Daily Planner");
		frame.setBounds(100,100,369,262);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		frame.getContentPane().setLayout(null);
		/*phone time*/
		JLabel lblPhoneTime = new JLabel("Time Spent on\r\n");
		lblPhoneTime.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPhoneTime.setBounds(22, 68, 119, 27);
		frame.getContentPane().add(lblPhoneTime);
		/*user time*/
		tfTime = new JTextField();
		tfTime.setBounds(154, 83, 98, 25);
		frame.getContentPane().add(tfTime);
		tfTime.setColumns(10);
		/*prompts for minutes*/
		JLabel lblMinutes = new JLabel("minutes");
		lblMinutes.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMinutes.setBounds(262, 80, 79, 27);
		frame.getContentPane().add(lblMinutes);
		/*back button*/
		JButton btnPhoneBack = new JButton("Back");
		btnPhoneBack.setBounds(143, 139, 79, 37);
		frame.getContentPane().add(btnPhoneBack);
		btnPhoneBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Activity activity = new Activity(Double.parseDouble(tfTime.getText()), ActivityType);
				CompleteDayGUI.addActivityTime(activity);
				frame.setVisible(false);
				RelaxGUI.showRelaxPlanner();	
			}
		});
		/*phone label*/
		JLabel lblPhone = new JLabel("Phone");
		lblPhone.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPhone.setBounds(154, 30, 79, 27);
		frame.getContentPane().add(lblPhone);
		/*extra because it was too long*/
		JLabel lblNewLabel = new JLabel("the Phone:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(22, 94, 91, 14);
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
		showPhonePlanner(); //displays GUI
	}
}