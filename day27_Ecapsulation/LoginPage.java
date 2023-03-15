package day27_Ecapsulation;

public class LoginPage {
	// instance variable
	private String userName;
	private String password;
	
	//Encapsulation simply means binding object state(fields)
	//and behavior(methods) together. 
	
//	1) Make the instance variables private so that they cannot be accessed directly from outside the class.
//	 You can only set and get values of these variables through the methods of the class.
//	2) Have getter and setter methods in the class to set and get the values of the fields.

	// getter read value
	public String getUserName() {
		return userName;
	}
	
	// setter update value 
	public void setUserName(String userName1) {
		userName = userName1;
	}
	
	
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password1) {
		password= password1;
	}
	
	
	public void getInfo() {
		this.getPassword();
		this.getUserName();
	}
	
	
	public LoginPage(String userName , String password) {
		//  this.userName pointing to your instance variable
		this.userName = userName;
		this.password = password;
	}
	
	
	
	
	
	
	
	
	
}	
