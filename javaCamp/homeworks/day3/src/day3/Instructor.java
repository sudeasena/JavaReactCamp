package day3;

public class Instructor extends User {
	private int courseNumbers;

	

	public Instructor(int id, String firstName, String lastName, String eMail, String password, String courseName,
			int courseNumbers) {
		super(id, firstName, lastName, eMail, password, courseName);
		this.courseNumbers = courseNumbers;
	}

	public int getCourseNumbers() {
		return courseNumbers;
	}

	public void setCourseNumbers(int courseNumbers) {
		this.courseNumbers = courseNumbers;
	}
	
}