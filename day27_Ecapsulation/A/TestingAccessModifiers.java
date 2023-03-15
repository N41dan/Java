package day27_Ecapsulation.A;

public class TestingAccessModifiers {
	public static void main(String[] args) {
		
		AccessModofiers am = new AccessModofiers();
		
		/// accessing default access modifiers
		am.name = "TechCircle";
		am.methodA();
		
		
		// private members
//		 private
//		 declarations are visible within the class only

		//am.age = 10;  The field AccessModofiers.age is not visible
		
		
		//Protected
//		 protected
//		 declarations are visible within the package or all subclasses

		am.phoneNumber = "1231231234";
		am.methodC();
		
		
	}
}
