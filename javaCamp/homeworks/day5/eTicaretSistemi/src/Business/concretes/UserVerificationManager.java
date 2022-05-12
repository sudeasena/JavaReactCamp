package Business.concretes;

import Business.abstracts.UserVerificationService;
import Entities.concretes.User;

public class UserVerificationManager implements UserVerificationService{

	@Override
	public void sendToVerificationMail(User user) {
		System.out.println(user.geteMail() + " send to a mail");
		
	}

	@Override
	public void verifyMail(User user) {
		System.out.println(user.geteMail() + " email is verificated");
		
	}
	

}
