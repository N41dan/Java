package day27_Ecapsulation;


public class LoginTest {
	public static void main(String[] args) {
		
		LoginPage lg = new LoginPage("user2","password1");
		
//		lg.userName = "user_name"; //The field LoginPage.userName is not visible
//		lg.password = "abc123!";
		
		
		lg.setUserName( "user1");
		lg.setPassword("abc123!");
		
		
		System.out.println(lg.getUserName());
		System.out.println(lg.getPassword());
		
		
		
		
	}
}
