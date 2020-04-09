package oop1;

public  class Car  extends Vehicle{

	
	public Car(){
		System.out.println("Car constructor");
	}
	
	public void start(){
		System.out.println("car...start");
	}
	
	public void stop(){
		System.out.println("car....stop");
	}
	
	
	public void refuel(){
		System.out.println("Car....refuel");
	}
	
	
	//can we override static method	
	//No. strictly not allowed. we cannot do it. we can overload
	
	//static -store inside common memory allocation
	
	
	//we cannot override final method 
	//we cannot extend final class
	
	
	

}
