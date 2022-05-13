package Business.concretes;

import Business.abstracts.UserCheckService;
import Business.abstracts.UserService;
import Business.abstracts.UserVerificationService;
import Core.concretes.GoogleManagerAdapter;
import DataAccess.abstracts.UserDao;
import Entities.concretes.User;

public class UserManager implements UserService {
	private UserDao userDao;
	private UserCheckService userCheckService;
	private UserVerificationService userVerificationService;
	private GoogleManagerAdapter googleManagerAdapter;
	
	public UserManager(UserDao userDao, UserCheckService userCheckService,
			UserVerificationService userVerificationService, GoogleManagerAdapter googleManagerAdapter) {
		super();
		this.userDao = userDao;
		this.userCheckService = userCheckService;
		this.userVerificationService = userVerificationService;
		this.googleManagerAdapter = googleManagerAdapter;
	}

	
	@Override
	public void signUp(User user) {
		if(userCheckService.checkUser(user)) {
			userVerificationService.sendToVerificationMail(user);
			userVerificationService.verifyMail(user);
			this.userDao.add(user);
			
		}
		else {
			System.out.println("signIn failed!");
		}
		
	}
	
	@Override
	public void login(String email, String password, User user) {
		if(email==null || password==null) {
			System.out.println("Enter email and password");
		}
		else if(email==user.geteMail() && password==user.getPassword()){
			System.out.println("Login successful");
			
		}
		else {
			System.out.println("Invalid email or password");
		}
		
	}





	

}