package day3;

public class InstructorManager extends UserManager {
	public void createCourse(Instructor instructor) {
		System.out.println(instructor.getFirstName()+" bir kurs oluþturdu");
	}
}
