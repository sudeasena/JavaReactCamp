package day3;

public class Student extends User {
	private String adress;
	private int courseCompletionPercentange;
	private String instructorName;
	

	public Student(int id, String firstName, String lastName, String eMail, String password, String courseName,
			String adress, int courseCompletionPercentange, String instructorName) {
		super(id, firstName, lastName, eMail, password, courseName);
		this.adress = adress;
		this.courseCompletionPercentange = courseCompletionPercentange;
		this.instructorName = instructorName;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public int getCourseCompletionPercentange() {
		return courseCompletionPercentange;
	}

	public void setCourseCompletionPercentange(int courseCompletionPercentange) {
		this.courseCompletionPercentange = courseCompletionPercentange;
	}

	public String getInstructorName() {
		return instructorName;
	}

	public void setInstructorName(String instructorName) {
		this.instructorName = instructorName;
	}

}
