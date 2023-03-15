package day28_Review_Encapsulation.StaticKeyWord;

import day28_Review_Encapsulation.AccessModifiers.Person;

public class TestingOutAccessModifiers {

	public static void main(String[] args) {

		Person person = new Person();
		
		person.name = "Adam";
//		person.age = 34; // private
//		person.occupation = "SDET"; // Default
//		person.address = "23"; // protected
	}

}
