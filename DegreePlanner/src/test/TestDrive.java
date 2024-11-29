// Degree Planner
// TestDrive.java
// Mason Lee & Abigail Gehlbach

package test;

import degreeComponent.*;
import degreeDecorator.*;
import course.*;

public class TestDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Major compSci = new Major();
		Minor dataScience = new Minor();
		compSci.name = "Computer Science Major";
		dataScience.name = "Data Science Minor";
		
		// Create new courses and add them to degree modifiers
		SoloCourse introProgramming = new SoloCourse("Intro to Programming", "This is an intro programming course!", 3);
		SoloCourse dataViz = new SoloCourse("Data Visualization", "This is a course about visualizing data!", 3);
		compSci.addCourse(introProgramming);
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
