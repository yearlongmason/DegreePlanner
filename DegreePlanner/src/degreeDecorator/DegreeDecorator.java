// Degree Planner
// DegreeDecorator.java
// Mason Lee & Abigail Gehlbach

package degreeDecorator;

import java.util.ArrayList;
import course.*;
import degreeComponent.*;

public abstract class DegreeDecorator implements Degree{
	
	public abstract ArrayList<Course> getCourses();

}
