package day3;

public class Main {

	public static void main(String[] args) {
		Instructor instructor=new Instructor(1,"Engin","Demiroğ",
				"engin@gmail.com","12345","Java-React",4);
		
		Student student = new Student(2,"Sude Asena","Alıkoğlu",
				"sude@gmail.com",
				"12345","Java-React","Turkey",25,"Engin Demiroğ");
		
		InstructorManager instructorManager=new InstructorManager();
		instructorManager.createCourse(instructor);
		instructorManager.signOut(instructor);
		
		StudentManager studentManager=new StudentManager();
		studentManager.createAccount(student);
		studentManager.enrollCourse(student);
		studentManager.login(student);
		
		
		
	}

}
