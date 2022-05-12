package DataAccess.abstracts;

import java.util.List;

import Entities.concretes.User;

public interface UserDao {
	void add(User user);
	boolean getMail(String email);
	boolean getPassword(String password);
	List<User> getAll();
	
	
}
