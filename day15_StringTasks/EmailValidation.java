package day15_StringTasks;

public class EmailValidation {

	public static void main(String[] args) {
		/*
		 Your team has created a new bank website that requires email address to be validated. 
		 The email string must contain an '@' character. 
		 The email string must contain an '.' character. 
		 The '@' must contain at least one character in front of it.
		  e.g. "a@example.com" is valid while "@example.com" is invalid. 
		  The '.' and '@' must be in the appropriate places. 
		  e.g. "mike.smith@com" is invalid while "mike.smith@example.com" is valid. 
		  For a given string, find a solution that writes true on the console if an email is valid 
		  and false if it is invalid. 
		  Examples: 
		  str = "test@example.com" --> true 
		  str = "test@example.co.in --> true 
		  str = "@example.com" --> false 
		*/
		
		String email = "atestexample.c@om";
		System.out.println(email.indexOf('@'));
		// The email string must contain an '@' character. 
		boolean containAt = (email.indexOf('@') > -1) ? true : false;
		System.out.println(containAt);
//		if (email.contains("@")) {
//			containAt = true;
//		}
//		
//		
//		if (email.indexOf('@') > -1) {
//			containAt = true;
//		}
		
		// The email string must contain an '.' character. 
		
		boolean containDot = false;
		
//		if (email.contains(".")) {
//			containDot = true;
//		}
		
		if (email.indexOf('.')>-1) {
			containDot = true;
		}
			
		boolean hasLetterInFrontOfAt = false;
		
		if (email.indexOf('@') > 0) {
			hasLetterInFrontOfAt = true;
		}
		
		
		System.out.println(containDot);
		System.out.println(hasLetterInFrontOfAt);
		
		boolean atAndDotIsAropriatePlace = false;
		
		if (email.indexOf('.') > email.indexOf('@')) {
			atAndDotIsAropriatePlace = true;
		}
		
		
		boolean isValidEmail =  containDot &&
								containAt && 
								hasLetterInFrontOfAt &&
								atAndDotIsAropriatePlace
;
		//System.out.println(email +" is valid "+isValidEmail);
		
		if (isValidEmail) {
			System.out.println("Given email is valid email address");
		}else {
			System.out.println("Given email is not valid email address");
		}
		
		
		
		
		
	}

}
