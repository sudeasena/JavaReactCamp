package Program;

import Business.abstracts.UserService;
import Business.concretes.UserCheckManager;
import Business.concretes.UserManager;
import Business.concretes.UserVerificationManager;
import Core.concretes.GoogleManagerAdapter;
import DataAccess.concretes.HibernateUserDao;
import Entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		UserService userService = new UserManager(new HibernateUserDao(), new UserCheckManager(), new UserVerificationManager(), new GoogleManagerAdapter());
		User user=new User("Sude Asena","Alýkoðlu","sudeasenaaa@gmail.com","123456");
		
		userService.signUp(user);
		
		userService.login("sudeasenaaa@gmail.com", "123456", user);
		//GoogleManagerAdapter googleManagerAdapter = new GoogleManagerAdapter();
		//googleManagerAdapter.signUp(null);
		//googleManagerAdapter.login(null);
		
	}

}
