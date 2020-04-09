package basicsJava;

public class MyCar {

	// class variables
	String name;
	String color;
	String model;
	String engine;
	int price;
	double milage;
	static int wheels = 4;

	// constructor
	public MyCar() { // 0 parmeter
		System.out.println("default constructor");
	}

	public MyCar(int i) { // 1 parmeter
		System.out.println("1 param constructor");
	}
	
	public MyCar(String name, String color, String model, String engine, int price, double milage){
		this.name=name;
		this.color=color;
		this.model=model;
		this.engine=engine;
		this.price=price;
		this.milage=milage;
	}

	// class methods
	public void start() {

	}

	public void stop() {

	}

}
