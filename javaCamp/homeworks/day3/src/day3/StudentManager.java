package day3;

public class StudentManager extends UserManager {
	public void createAccount(Student student) {
		System.out.println(student.getFirstName()+" isminde hesap olu�turuldu");
	}
	
	public void enrollCourse(Student student) {
		System.out.println(student.getFirstName()+" kursa kay�t olundu");
	}
}
