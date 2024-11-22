package course;

public class SoloCourse implements Course{
	
	public String courseName;
	public String courseDescription;
	public int credits;
	
	public SoloCourse(String courseName, String courseDescription, int credits) {
		this.courseName = courseName;
		this.courseDescription = courseDescription;
		this.credits = credits;
	}
	
	@Override
	public String toString() {
		return "SoloCourse [courseName=" + courseName + ", courseDescription=" + courseDescription + ", credits="
				+ credits + "]";
	}

	public SoloCourse() {
		
	}
}
