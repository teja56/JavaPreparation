package oop1;

public class TestCar {

	public static void main(String[] args) {
		
		BMW b =new BMW();
		b.start();
		b.stop();
		b.engine();
		b.refuel();
		b.theftSafety();
	
		
		Car c =new Car();
		c.start();
		c.stop();
		c.engine();
		c.refuel();
		
		//Top Casting
		Car c1=new BMW(); //child class object can be reffered by parent class ref variable
		c1.start(); // always reference to overload method
		c1.stop();
		c1.refuel();
		
		
		//down casting
		
	//	BMW b1=(BMW) new Car();  //classCast exception
	
		
		
		
	}

}
