package day27_Ecapsulation.B;

import day11_nestedForLoop.Timer;
import day27_Ecapsulation.A.AccessModofiers;

public class Test {
	public static void main(String[] args) throws InterruptedException {
		
//		 default
//		 declarations are visible only within the package (package private)

		AccessModofiers am = new AccessModofiers();
		
		/// accessing default access modifiers
//		am.name = "Techcirlce";// package private
		
		// private members
//		am.age = 10;
//		am.met
		
		
		//Protected
//		 protected
//		 declarations are visible within the package or all subclasses

//		am.phoneNumber = "1231231234";  //The field AccessModofiers.phoneNumber is not visible
//		am.methodC();
		
		Timer t = new Timer();
		t.fifteenMinuteTimer();
		
		
		
		
		
		
	}
}
