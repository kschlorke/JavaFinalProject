package finalProject;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import java.awt.Font;

public class ExerciseGUI extends PlannerGUI {
	
	protected static JTextField tfTime; // time for each activity
	
	public static void showExercisePlanner() {
		/*frame for the entire planner*/
		final JFrame frame= new JFrame("Daily Planner");
		frame.setBounds(100,100,369,262);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		/*button to select the run option*/
		JButton btnRun = new JButton("Run");
		btnRun.setBounds(10, 88, 96, 46);
		frame.getContentPane().add(btnRun);
		btnRun.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.setVisible(false);
				RunGUI.showRunPlanner();
			}
		});
		/*button to select the yoga option*/
		JButton btnYoga = new JButton("Yoga");
		btnYoga.setBounds(116, 88, 117, 46);
		frame.getContentPane().add(btnYoga);
		btnYoga.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.setVisible(false);
				YogaGUI.showYogaPlanner();
			}
		});
		/*button to select the bike option*/
		JButton btnBike = new JButton("Bike");
		btnBike.setBounds(243, 88, 100, 46);
		frame.getContentPane().add(btnBike);
		btnBike.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.setVisible(false);
				BikeGUI.showBikePlanner();
			}
		});
		/*label for the page as exercise*/
		JLabel lblExercise = new JLabel("Exercise");
		lblExercise.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblExercise.setBounds(141, 30, 89, 14);
		frame.getContentPane().add(lblExercise);
		/*goes back to the main menu*/
		JButton btnExerciseBack = new JButton("Back");
		btnExerciseBack.setBounds(116, 158, 117, 39);
		frame.getContentPane().add(btnExerciseBack);
		/*when a person goes back, it goes back to the three activities*/
		btnExerciseBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.setVisible(false);
				PlannerGUI.showPlanner();	
			}
	
		});
		
		
		frame.setVisible(true); //window is visible
	}
	
	public static void main(String[] args) {
		showExercisePlanner(); //displays GUI
	}
}


