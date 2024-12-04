// Degree Planner
// TestDrive.java
// Mason Lee & Abigail Gehlbach

package test;

import degreeComponent.*;
import degreeDecorator.*;
import course.*;

public class TestDrive {

	public static void main(String[] args) {
		Major compSci = new Major();
		Minor dataScience = new Minor();
		compSci.name = "Computer Science Major";
		dataScience.name = "Data Science Minor";
		
		// Create new courses 
		SoloCourse introProgramming = new SoloCourse("Intro to Programming", "This is an intro programming course!", 3);
		SoloCourse dataViz = new SoloCourse("Data Visualization", "This is a course about visualizing data!", 3);
		SoloCourse designPatterns = new SoloCourse("Software Design Patterns", "This is a course covering good Object Oriented Patterns in Java.", 3);
		SoloCourse serverSideWeb = new SoloCourse("Server Side Web Development", "This course covers PHP web development.", 3);
		SoloCourse refactoring = new SoloCourse("Software Refactoring", "This course helps students improve code while maintaining functionality.", 3);

		
		// Creating a composite course and adding course choices.
		CourseChoice csi3xx = new CourseChoice("CSI-3XX", "Students may choose from any two 300+ level programming course.", 6);
		csi3xx.addCourse(designPatterns);
		csi3xx.addCourse(serverSideWeb);
		csi3xx.addCourse(refactoring);
		
		
		// Adding courses to degree modifiers
		compSci.addCourse(introProgramming);
		compSci.addCourse(csi3xx);
		dataScience.addCourse(dataViz);
		dataScience.addCourse(introProgramming);
		
		// Add degree modifiers to myDegree and print out degree requirements
		MajorComposite myDegree = new MajorComposite();
		myDegree.addDegreeModifier(compSci);
		myDegree.addDegreeModifier(dataScience);
		
		// Even though intro programming is required for the Computer Science major and Data Science minor it only shows up once!
		System.out.println("Required courses: ");
		for(Course course : myDegree.getCourses()) {
			System.out.println(course);
		}
	}

}
