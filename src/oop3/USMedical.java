package oop3;

public interface USMedical {

	//static in nature int  //by default static and final for variables
	static final int min_fee = 50;
	
	public void cardioServices();
	
	public void oncologyServices();
	
	public void neuroServices();
	
	public void mediaclInsurance();
	
	//in JDK 1.8
	//Can have default method having method body:
	
	default void logo(){
		System.out.println("US medical Logo");
	}
	
	// static methods cannot override
	
	static void parking(){
		System.out.println("US Medical parking");
	}
	// i cannot override static methods
	
	
	//can not have any methods body
	//only method declaration
	//only method prototype
	// can not create the object of interface
	
}
