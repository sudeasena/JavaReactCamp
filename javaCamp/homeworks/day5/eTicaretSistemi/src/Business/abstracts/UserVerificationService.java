package Business.abstracts;

import Entities.concretes.User;

public interface UserVerificationService {
	void sendToVerificationMail(User user);
	void verifyMail(User user);
	
}
