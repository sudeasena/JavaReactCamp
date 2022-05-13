package Business.concretes;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import Business.abstracts.UserCheckService;
import Entities.concretes.User;

public class UserCheckManager implements UserCheckService{
	
	List<String> emailList = new ArrayList<String>();
	
	@Override
	public boolean validMail(User user) {
		String regex="^[A-Z0-9._%+-]+@[A-Z0-9.-]+.(com|org|net|edu|gov|mil|biz|info|mobi)(.[A-Z]{2})?$";
		Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
		if (pattern.matcher(user.geteMail()).find()) {
			return true;
		} else {
			System.out.println("Invalid email!");
			return false;
		}
	}

	@Override
	public boolean checkName(User user) {
		if(user.getFirstName().length()>1) {
			if(user.getLastName().length()>1) {
				return true;
			}else {
				System.out.println("Invalid last name");
				return false;
			}
		}
		else {
			System.out.println("Invalid first name");
			return false;
		}
	}

	@Override
	public boolean checkPassword(User user) {
		if(user.getPassword().length()>5) {
			return true;
		}else {
			System.out.println("Invalid password");
			return false;
		}
		
	}

	@Override
	public boolean checkUser(User user) {
		if(checkName(user) && checkPassword(user) && validMail(user)) {
			return true;
		}
		return false;
	}

	@Override
	public boolean checkMail(User user) {
		if(!emailList.contains(user.geteMail())) {
			return true;
		}else {
			System.out.println("such an email already exists in the system");
		return false;
		}
		
	}

}
