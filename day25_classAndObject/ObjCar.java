package day25_classAndObject;

public class ObjCar {

	public static void main(String[] args) {

		// class instantiation
		// ClassName variable = new ClassName();

		// create car object

		Car bmw_x5 = new Car(); // calling default constructor of car class

		bmw_x5.drive();
		bmw_x5.start();
		bmw_x5.stop();

		System.out.println("----------------");
		bmw_x5.brand = "BMW"; // Assigning value to instance variable brand
		bmw_x5.model = "X5";
		bmw_x5.year = 2023;
		bmw_x5.color = "Black";
		bmw_x5.price = 68000;

		bmw_x5.drive();
		bmw_x5.start();
		bmw_x5.stop();

		Car bmw_m3_competition = new Car();
		bmw_m3_competition.brand = "BMW";
		bmw_m3_competition.model = "M3 Competition";
		bmw_m3_competition.year = 2023;
		bmw_m3_competition.color = "Black";
		bmw_m3_competition.price = 78000;

		bmw_m3_competition.drive();
		bmw_m3_competition.start();
		bmw_m3_competition.stop();

		Car dreamCar = new Car();

		dreamCar.brand = "Mercedes Benz";
		dreamCar.model = "EQS";
		dreamCar.color = "Obsidian Black";
		dreamCar.price = 104400;
		dreamCar.year = 2023;

		dreamCar.drive();
		dreamCar.start();
		dreamCar.stop();

		Car tesla_modelX_plaid = new Car();
		tesla_modelX_plaid.brand = "Tesla";
		tesla_modelX_plaid.color = "Black";
		tesla_modelX_plaid.model = "Model X Plaid";
		tesla_modelX_plaid.year = 2023;
		tesla_modelX_plaid.price = 130000;

		tesla_modelX_plaid.drive();
		tesla_modelX_plaid.start();
		tesla_modelX_plaid.stop();

		Car Toyota_Landcruiser = new Car(); // default constructor of car class

		Toyota_Landcruiser.drive();
		Toyota_Landcruiser.start();
		Toyota_Landcruiser.stop();

		System.out.println("----------");
		Toyota_Landcruiser.brand = "Toyota"; // Assiging value to instance Varibale brand
		Toyota_Landcruiser.model = "GXL Landcruiser";
		Toyota_Landcruiser.year = 2022;
		Toyota_Landcruiser.price = 120000;

		Toyota_Landcruiser.drive();
		Toyota_Landcruiser.start();
		Toyota_Landcruiser.stop();

		Car Mitsibishi_Triton = new Car();

		Mitsibishi_Triton.brand = "Mitsibishi Triton";
		Mitsibishi_Triton.model = "GLS Premium";
		Mitsibishi_Triton.year = 2020;
		Mitsibishi_Triton.color = "Gun Mental Grey";
		Mitsibishi_Triton.price = 50000;

		Mitsibishi_Triton.drive();
		Mitsibishi_Triton.start();
		Mitsibishi_Triton.stop();

		Car Tesla_Y = new Car();

		Tesla_Y.brand = "Tesla";

		Tesla_Y.model = "Y";
		Tesla_Y.year = 2023;
		Tesla_Y.color = "White";
		Tesla_Y.price = 58000;

		Tesla_Y.drive();
		Tesla_Y.start();
		Tesla_Y.stop();

		
		
		Car mazda_rx7 = new Car();


        mazda_rx7.brand = "Mazda";
        mazda_rx7.model = "Rx7";
        mazda_rx7.year = 1998;
        mazda_rx7.price = 55000;
        
        
        Car laVoitureNoire = new Car();
        
        laVoitureNoire.brand = "Bugatti";
        laVoitureNoire.model = "La Voiture Noire";
        laVoitureNoire.color = "Black";
        laVoitureNoire.year = 2023;
        laVoitureNoire.price = 12000000;
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
		
		
	}

}
