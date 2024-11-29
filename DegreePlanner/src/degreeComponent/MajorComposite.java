// Degree Planner
// MajorComposite.java
// Mason Lee & Abigail Gehlbach

package degreeComponent;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import course.*;

public class MajorComposite implements Degree {

	ArrayList<Degree> allDegreeModifiers = new ArrayList<>();
	
	public void addDegreeModifier(Degree newModifier) {
		allDegreeModifiers.add(newModifier);
	}

	@Override
	public ArrayList<Course> getCourses() {
		// Loop through each degree
		Set<Course> uniqueCourses = new HashSet<Course>(); // Create a set to keep track of unique courses
		for(Degree degreeModifier : allDegreeModifiers) {
			// Go through each requirement from each degree and add it to a set
			for (Course course : degreeModifier.getCourses()) {
				uniqueCourses.add(course);
			}
		}
		
		ArrayList<Course> uniqueCoursesArray = new ArrayList<>(uniqueCourses);
		return uniqueCoursesArray;
	}
}
