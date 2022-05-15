package finalProject;

import java.text.DecimalFormat;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.util.*;
import java.awt.Font;

public class CompleteDayGUI extends PlannerGUI {
	private static JTextField tfTotalActivityTime;
	//protected static double totalActivityTime = 0;
	protected static List<Activity> activityList = new ArrayList<>();
	protected static JTextField tfActivityList;
	private static JLabel lblHours;
	private static JLabel lblTasksComplete;
	private static JLabel lblNewLabel;
	private static JLabel lblEncouragement;

	public static void main(String[] args) {
		showCompletePlanner(); //displays planner
	}
	
	public static void showCompletePlanner() {
		/*main frame daily planner*/
		final JFrame frame= new JFrame("Daily Planner");
		frame.setBounds(100,100,369,262);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		/*activity time for each category*/
		tfTotalActivityTime = new JTextField();
		tfTotalActivityTime.setFont(new Font("Tahoma", Font.PLAIN, 16));
		tfTotalActivityTime.setEditable(false);
		tfTotalActivityTime.setBounds(104, 136, 73, 44);
		frame.getContentPane().add(tfTotalActivityTime);
		tfTotalActivityTime.setColumns(10);
		/*activity name for each category*/
		tfActivityList = new JTextField();
		tfActivityList.setFont(new Font("Tahoma", Font.PLAIN, 10));
		tfActivityList.setEditable(false);
		tfActivityList.setBounds(10, 81, 333, 44);
		frame.getContentPane().add(tfActivityList);
		tfActivityList.setColumns(10);
		/*label for total hours spent*/
		lblHours = new JLabel("hours");
		lblHours.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblHours.setBounds(187, 151, 46, 14);
		frame.getContentPane().add(lblHours);
		/*list of completed tasks*/
		lblTasksComplete = new JLabel("Tasks Accomplished");
		lblTasksComplete.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblTasksComplete.setBounds(104, 56, 154, 14);
		frame.getContentPane().add(lblTasksComplete);
		/*completed day label*/
		lblNewLabel = new JLabel("Completed Day");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(114, 11, 144, 22);
		frame.getContentPane().add(lblNewLabel);
		/*tells you that you did a good job*/
		lblEncouragement = new JLabel("Great Job!!!");
		lblEncouragement.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblEncouragement.setBounds(127, 198, 95, 14);
		frame.getContentPane().add(lblEncouragement);
		/*shows window and calculates the time*/
		frame.setVisible(true); //shows window
		calculateTotalTime();
	}
	/*displays total activity time*/
	public JTextField getTotalActivityTime() {
		return tfTotalActivityTime;
	}
	public static void addActivityTime(Activity activity) {
		activityList.add(activity);
	}
	/*adds up times of individual events and changes them to hours (my brother helped me with this, he's brilliant and I'm dumb but it works!!!)*/
	private static JTextField calculateTotalTime() {
		DecimalFormat numberFormat = new DecimalFormat("#.00");
		double totalTime = 0;
		List<String> activities = new ArrayList<>();
		for (int i = 0; i < activityList.size(); i++) {
			Activity newActivity = activityList.get(i);
			if(newActivity.getTime() > 0) { // if the time is not less than zero or not filled out
				totalTime += newActivity.getTime(); // add to the time
				if(!activities.contains(newActivity.getActivityName())) { // if it's more add the name to the list
					activities.add(newActivity.getActivityName()); // gets the name
				}
			}
		}
		totalTime /= 60.00; // to make minutes into hours
		String showTotalTime = String.valueOf(numberFormat.format(totalTime));
		tfTotalActivityTime.setText(showTotalTime); // shows time
		tfActivityList.setText(String.join(", ",  activities)); // shows activities in a list (i couldn't wrap it so i just made the list small)
		return tfTotalActivityTime;
	}
}