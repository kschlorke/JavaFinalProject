/*Kirsten Schlorke
 *SDEV 200-0AC
 *05/13/2022
 *FinalProject.java
 *Planner that allows user to select which activity they've performed and input how much time spent on it. Then displays how many hours they spent and what tasks they did.
 *
 *Update 5/14:
 *I went to run it again and noticed that if a user presses the back button in a specific task without entering anything, it leaves an empty string and freaks out the program. I looked
 *online for things to do and couldn't get any of the suggestions to work. I tried a couple of different things, and know that I have to parse the string from the text to a double, but I couldn't figure
 *out how to set it so that it would default to a zero value. I spent two days off and on trying to get it to work. So just be aware that that will bug it. I did add a message at the bottom of each area saying to enter
 *a zero before going back because I couldn't think of what else to do to discourage it. In RunGUI you can see where I tried to implement something to avoid the error (i left it commented out). 
 */

package finalProject;

import javax.swing.JFrame;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;

public class PlannerGUI{
	
	//protected static String ActivityType;
	protected static JTextField tfTime;
	protected static JTextField tfTotalTime;
	
	/*makes the main page of daily planner*/
	public static void showPlanner() {
		
		final JFrame frame= new JFrame("Daily Planner");
		frame.setBounds(100,100,369,262);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		/*creates a clickable exercise button*/
		JButton btnExercise = new JButton("Exercise");
		btnExercise.setBounds(10, 88, 96, 46);
		frame.getContentPane().add(btnExercise);
		/*brings the user to a page to select from exercises*/
		btnExercise.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.setVisible(false);
				ExerciseGUI.showExercisePlanner();
			}
		});
		/*creates a clickable study button*/
		JButton btnStudy = new JButton("Study/Work");
		btnStudy.setBounds(116, 88, 117, 46);
		frame.getContentPane().add(btnStudy);
		/*will bring the user to a page to select from study*/
		btnStudy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.setVisible(false);
				StudyGUI.showStudyPlanner();
			}
		});
		/*creates a clickable relax button*/
		JButton btnRelax = new JButton("Relax");
		btnRelax.setBounds(243, 88, 100, 46);
		frame.getContentPane().add(btnRelax);
		/*will bring the user to a page to select from relax*/
		btnRelax.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.setVisible(false);
				RelaxGUI.showRelaxPlanner();
			}
		});
		/*button to complete the day and show input*/
		JButton btnComplete = new JButton("Show Completed Day");
		btnComplete.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnComplete.setBounds(86, 159, 166, 39);
		frame.getContentPane().add(btnComplete);
		
		JLabel lblMenu = new JLabel("Main Menu");
		lblMenu.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblMenu.setBounds(130, 27, 119, 22);
		frame.getContentPane().add(lblMenu);
		btnComplete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.setVisible(false);
				CompleteDayGUI.showCompletePlanner();
			}
		});

		
		frame.setVisible(true); //shows window
	}
	
	public static void main(String[] args) {
		showPlanner(); //displays planner 
	}
}

