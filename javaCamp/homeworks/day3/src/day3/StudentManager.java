package day3;

public class StudentManager extends UserManager {
	public void createAccount(Student student) {
		System.out.println(student.getFirstName()+" isminde hesap oluşturuldu");
	}
	
	public void enrollCourse(Student student) {
		System.out.println(student.getFirstName()+" kursa kayıt olundu");
	}
}
