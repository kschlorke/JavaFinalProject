package finalProject;

public class Activity {
	double time; // time for each activity
	String ActivityName; // activity name
	
	public Activity(double time, String ActivityName) {
		this.time = time; // each time
		this.ActivityName = ActivityName; // each name
	}
	public double getTime(){ // get time
		return time;
	}
	public String getActivityName() { // get name
		return ActivityName;
	}
}
