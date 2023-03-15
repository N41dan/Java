package day28_Review_Encapsulation.ClassAndObject;

public class PersonObj {

	public static void main(String[] args) {

		Person person1 = new Person("Adam", 25, "SDET", "123 Ashby Pl", true);
		
		
		person1.birthday();
		person1.changeOccupation("Software Developer");
		person1.introduce();
		
		
		
	}

}
