package day27_Ecapsulation.B;

import day27_Ecapsulation.A.AccessModofiers;

public class Child extends AccessModofiers{

	public static void main(String[] args) {
		//Protected
//		 protected
//		 declarations are visible within the package or all subclasses

		Child c = new Child();
		c.phoneNumber = "1231231234";
		c.methodC();
		
		
		
	}
	
	
}
