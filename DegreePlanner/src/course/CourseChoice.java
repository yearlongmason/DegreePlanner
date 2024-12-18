// Degree Planner
// CourseChoice.java
// Mason Lee & Abigail Gehlbach

package course;

import java.util.ArrayList;

public class CourseChoice implements Course{
	
	ArrayList<Course> courseOptions = new ArrayList<>();
	public String name; // Example: CSI-3XX (this shows it is an option, but it still gives a valid name for the course)
	public String description;
	public int credits;
	
	// Constructor
	public CourseChoice(String courseName, String courseDescription, int credits) {
		this.name = courseName;
		this.description = courseDescription;
		this.credits = credits;
	}
	
	// Adds a course to list of courses
	public void addCourse(Course newCourse) {
		this.courseOptions.add(newCourse);
	}
	
	// nicely printing all of the course options
	private String printChoices() {
		String courseList = "";
		for(Course i : courseOptions) {
			courseList += ("\t" + i + "\n");
		}
		return courseList;
	}
	
	@Override
	public String toString() {
		return "CourseChoice [courseName=" + name + ", courseDescription=" + description + ", credits="
				+ credits + "\n{" + printChoices() + "}" + "]";
	}
}
