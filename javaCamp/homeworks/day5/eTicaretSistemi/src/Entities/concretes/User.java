package Entities.concretes;

import Entities.abstracts.Entity;

public class User implements Entity {
	private String firstName;
	private String lastName;
	private String eMail;
	private String password;
	
	public User(String fistName, String lastName, String eMail, String password) {
		super();
		this.firstName = fistName;
		this.lastName = lastName;
		this.eMail = eMail;
		this.password = password;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String geteMail() {
		return eMail;
	}
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
