package DataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import DataAccess.abstracts.UserDao;
import Entities.concretes.User;

//veriye eriþim kodlarý yazýlýr
public class HibernateUserDao implements UserDao {
	List<User> users=new ArrayList<>();
	
	@Override
	public void add(User user) {
		users.add(user);
		
	}

	@Override
	public boolean getMail(String email) {
		
		return false;
	}

	@Override
	public boolean getPassword(String password) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
} 
