package Business.abstracts;

import Entities.concretes.User;

public interface UserService {
	void login(String email,String password,User user);
	void signUp(User user);
}
