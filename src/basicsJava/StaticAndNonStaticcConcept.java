package basicsJava;

public class StaticAndNonStaticcConcept {

	public static void main(String[] args) {

	// how to call static methods: no need to create the object to call static methods
	//1. call by class name
		StaticAndNonStaticcConcept.getSchoolName();

	//2. call them directly:
		getSchoolName();
	
		
		//how to call non static methods: we need to create the object
		StaticAndNonStaticcConcept obj=new StaticAndNonStaticcConcept();
		obj.getName();
		obj.getSchoolName();
	
	
	}
	
	
	public void getName(){
		System.out.println("get name method");
	}
	
	public static void getSchoolName(){
		System.out.println("get school name method");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
