package model.users;

public abstract class User {
	private String username;
	private String encodedPassword;
	private String name;//for Business User it will be name of owner
	private String surname;
	
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String inputUsername) {
		if(inputUsername != null && inputUsername.matches("[a-z0-9.]{8,20}")) {
			username = inputUsername;
		}
		else
		{
			username = "default.user";
		}
	}
	public String getEncodedPassword() {
		return encodedPassword;
	}
	public void setEncodedPassword(String inputEncodedPassword) {
		if(inputEncodedPassword != null && inputEncodedPassword.matches("[A-Za-z0-9]{8, 20}")) {
			//TODO find out simple password encoder 
			encodedPassword = inputEncodedPassword;
		}
		else
		{
			encodedPassword = "defaultpassword";
		}
		
	}
	//TODO verification in setName and setSurname
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	

}
