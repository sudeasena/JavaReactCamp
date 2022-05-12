package Business.abstracts;

import Entities.concretes.User;
public interface UserCheckService {
	boolean validMail(User user);
	boolean checkName(User usser);
	boolean checkPassword(User user);
	boolean checkUser(User user);
	boolean checkMail(User user);
	
}
