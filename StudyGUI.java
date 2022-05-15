package finalProject;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import java.awt.Font;

public class StudyGUI extends PlannerGUI {

	protected static JTextField tfTime;
	
	public static void showStudyPlanner() {
		/*frame for the entire planner*/
		final JFrame frame= new JFrame("Daily Planner");
		frame.setBounds(100,100,369,262);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		/*button to select the work option*/
		JButton btnWork =new JButton("Work");
		btnWork.setBounds(10, 88, 96, 46);
		frame.getContentPane().add(btnWork);
		btnWork.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.setVisible(false);
				WorkGUI.showWorkPlanner();
			}
		});
		/*button to select the class option*/
		JButton btnClass = new JButton("Class/Study");
		btnClass.setBounds(116, 88, 117, 46);
		frame.getContentPane().add(btnClass);
		btnClass.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.setVisible(false);
				ClassGUI.showClassPlanner();
			}
		});
		/*button to select the homework option*/
		JButton btnHW = new JButton("Homework");
		btnHW.setBounds(243, 88, 100, 46);
		frame.getContentPane().add(btnHW);
		btnHW.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.setVisible(false);
				HWGUI.showHWPlanner();
			}
		});
		/*label for the page as Study*/
		JLabel lblStudy = new JLabel("Work / Study");
		lblStudy.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblStudy.setBounds(114, 31, 119, 22);
		frame.getContentPane().add(lblStudy);
		/*goes back to the main menu*/
		JButton btnStudyBack = new JButton("Back");
		btnStudyBack.setBounds(116, 158, 117, 39);
		frame.getContentPane().add(btnStudyBack);
		/*when a person goes back, it goes back to the three activities*/
		btnStudyBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.setVisible(false);
				PlannerGUI.showPlanner();	
			}
	
		});
		
		frame.setVisible(true); //window is visible
	}
	public static void main(String[] args) {
		showStudyPlanner(); //displays GUI
	}
}
