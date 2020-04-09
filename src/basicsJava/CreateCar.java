package basicsJava;

public class CreateCar {

	public static void main(String[] args) {

		MyCar obj =new MyCar(10);
		
		
		MyCar bmw =new MyCar("BMW","White","X3","Petrol",60,10.33);
		MyCar maruthi =new MyCar("maruthi","Red","Alto","Petrol",4,20);
		MyCar merck =new MyCar("merck","black","E class","Petrol",75,15);
		MyCar audi =new MyCar("audi","blue","q3","Petrol",70,8);

		
		System.out.println(bmw.name);
		System.out.println(bmw.model);

		System.out.println(maruthi.color);
		
		
		
		
	}

}
