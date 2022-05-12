package Core.concretes;

import Core.abstracts.OtherService;
import GoogleAccount.GoogleAccountManager;

public class GoogleManagerAdapter implements OtherService {

	@Override
	public void signUp(String message) {
		GoogleAccountManager googleAccountManager = new GoogleAccountManager();
		googleAccountManager.signUp(message);
		
	}

	@Override
	public void login(String message) {
		GoogleAccountManager googleAccountManager = new GoogleAccountManager();
		googleAccountManager.login(message);
		
	}
	
}
