package day3;

public class UserManager {
	public void login(User user) {
		System.out.println(user.getFirstName()+ ":Giriþ yapýldý");
	}
	
	public void signOut(User user) {
		System.out.println(user.getFirstName()+ ":Çýkýþ yapýldý");

	}
}
