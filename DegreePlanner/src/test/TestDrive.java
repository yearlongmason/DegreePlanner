package test;

import degreeComponent.*;
import course.*;

public class TestDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Major compSci = new Major();
		compSci.majorName = "Computer Science";
		System.out.println(compSci.majorName);
		
		SoloCourse introProgramming = new SoloCourse("Intro to Programming", "This is an intro programming course", 3);
		
		compSci.addCourse(introProgramming);
		System.out.println(compSci.requiredCourses);
	}

}
