package oop1;

public class BMW extends Car {
	
	//this keyword is used to intitalize the class properties

	public BMW(){
		super();
//		super.start(); - without create the object also we can call
		// super keyword should be first statement in the constructor
		System.out.println("BMW Constructor");
	}
	
	//Method Overriding: run time polymorpshim
	@Override  
	public void start(){
		System.out.println("BMW.... start");
	}
	
	public void theftSafety(){
		System.out.println("BMW...theft safety");
	}
	
	
	//can we call parent call constructor in child class
	// yes by using super() keyword

}
