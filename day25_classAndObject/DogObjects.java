package day25_classAndObject;

public class DogObjects {
	public static void main(String[] args) {

		Dog d1 = new Dog(); // created Dog object
							// using default constructor of
							// Dog class

		// Assign value to instance variables
		d1.age = 5;
		d1.breed = "Neapolitan Mastiff";
		d1.size = "Large";
		d1.color = "Black";
		d1.name = "James";

		d1.introduce();
		d1.bark();
		d1.eat();
		d1.sit();

		Dog Max = new Dog();
		Max.age = 9;
		Max.breed = "Chow Chow";
		Max.color = "Maroon";
		Max.name = "Max";
		Max.size = "Large";

		Dog BigShow = new Dog();
		BigShow.age = 15;
		BigShow.breed = "Maltese";
		BigShow.color = "White";
		BigShow.name = "BigShow";
		BigShow.size = "X-Large";

		Dog Charlie = new Dog();
		Charlie.age = 5;
		Charlie.breed = "Labradog";
		Charlie.color = "Brown";
		Charlie.name = "Charlie";
		Charlie.size = "Small";

//		int nums[] = {1,2,3,4};

		Dog dogs[] = new Dog[5];
		dogs[0] = d1;
		dogs[1] = Charlie;
		dogs[2] = BigShow;
		dogs[3] = Max;
		dogs[4] = Max;

		System.out.println(dogs.length);

		for (Dog eachDog : dogs) {
			
			//if (eachDog != null) {
				System.out.println(eachDog.name);
			//}
		}

	}
}
