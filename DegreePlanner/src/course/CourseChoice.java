package course;

import java.util.ArrayList;

public class CourseChoice implements Course{
	
	ArrayList<Course> courseOptions = new ArrayList<>();
	public String courseName; // Example: CSI-3XX (this shows it is an option, but it still gives a valid name for the course)
	public String courseDescription;
	public int credits;
	
	// Constructor
	public CourseChoice(String courseName, String courseDescription, int credits) {
		this.courseName = courseName;
		this.courseDescription = courseDescription;
		this.credits = credits;
	}
	
	// Adds a course to list of courses
	public void addCourse(Course newCourse) {
		this.courseOptions.add(newCourse);
	}
}
