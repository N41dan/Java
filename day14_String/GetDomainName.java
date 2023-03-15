package day14_String;

public class GetDomainName {

	public static void main(String[] args) {
		// Write a program to get domain name from an email
		
		//String email = "frist.lastname@gmail.com";  //-- gmail
//		 				"frist.lastname@yahoo.com.au";  //-- yahoo
		
//		                "frist.lastname@aws.fr";  //-- aws
		
		
//		                012345678910
		String email = "john.smith@github.com";
//        System.out.println(email.length());
//        System.out.println(email.substring(15,20));
        
        int indexOfAt = email.indexOf('@') +1;
        int indexOfDot = email.lastIndexOf('.');
        
        System.out.println(email.substring(indexOfAt,indexOfDot));
        
        
        // Write program to get first and last name of the person 
		
		String firstName = email.substring(0,email.indexOf('.'));
		
		System.out.println(firstName);
		
		String lastName = email.substring(5,10);
		System.out.println(lastName);
		
		lastName = email.substring(email.indexOf('.') +1 , email.indexOf('@') );
		System.out.println(lastName);
		
		
		
	}

}
