package day27_Ecapsulation.A;

public class AccessModofiers {

	//instance variables
	String name; //  default access modifier
	private int  age;
	protected String phoneNumber;
	public long id;
	
	
	void methodA() {
		System.out.println("methodA has Default Access modifier");
	}
	
	private void methodB() {
		System.out.println("methodB has private Access modifier");
	}
	
	protected void methodC() {
		System.out.println("methodC has protected Access modifier");
	}
	
	public void methodD() {
		System.out.println("methodD has protected Access modifier");
	}
	
	
	public void callingPrivateMethod() {
		age = 10;
		System.out.println(age);
		
		methodB();
	}
	
	
	
}
