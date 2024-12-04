// Degree Planner
// Minor.java
// Mason Lee & Abigail Gehlbach

package degreeDecorator;

import java.util.ArrayList;
import course.*;

public class Minor extends DegreeDecorator{
	
	public String name;
	public String description;
	public ArrayList<Course> requiredCourses = new ArrayList<>();
	
	// Adds a course to list of required courses
	public void addCourse(Course newCourse) {
		this.requiredCourses.add(newCourse);
	}

	@Override
	public ArrayList<Course> getCourses() {
		return requiredCourses;
	}

}
