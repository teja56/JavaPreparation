package basicsJava;

import java.util.ArrayList;

public class FunctionsConcept {

	public static void main(String[] args) {

		// how to call a function
		// create an object of the class: use new keyword
		FunctionsConcept obj = new FunctionsConcept();
		obj.test();
		obj.getMyCountry();
		String n = obj.getTrainerName();
		System.out.println(n);

		int i = obj.sum();
		System.out.println(i);
		System.out.println(obj.sum());

		String[] abc = obj.getStudentList();
		System.out.println(abc[0]);

		int x=obj.addition(2, 3);
		System.out.println(x);
		
	}

	// Can not create a function inside a function.
	// duplicate functions are not allowed.

	// 1. Simple function: no input and no return

	public void test() {
		System.out.println("Test Method");
	}

	public void getMyCountry() {
		System.out.println("India");
		String name = "Naveen";
		System.out.println(name);
	}

	// 2.no input but some return

	public String getTrainerName() {

		String name = "Teja";
		return name;

	}

	public int sum() {
		System.out.println("Sum method");
		int a = 10;
		int b = 20;
		int c = a + b;
		return c;
	}

	public String[] getStudentList() {
		System.out.println("get student list");
		String student[] = new String[3];
		student[0] = "kolla";
		student[1] = "teja";
		student[2] = "sai";
		return student;
	}

	public ArrayList<String> getPlayersName() {
		System.out.println("get Players Name");
		ArrayList<String> ar = new ArrayList<String>();
		ar.add("sachin");
		ar.add("kohili");
		ar.add("dhoni");
		return ar;
	}

	// 3. some input and some return

	public int addition(int x, int y) {
		System.out.println("addition method");
		int z = x + y;
		return z;
	}

	public String getCountryCaptial(String countryname) {
		System.out.println("get country capital");

		if (countryname.equals("India")) {
			return "NewDelhi";
		} else if (countryname.equals("USA")) {
			return "washington DC";
		}
		return null;

	}

	public boolean isUsCitizen(String personName) {
		System.out.println("is US citizen Method");

		if (personName.equals("Naveen")) {
			return true;
		} else if (personName.equals("teja")) {
			return true;
		}
		return false;

	}

	public double getStudentMarks(String studentName) {
		System.out.println("get student marks method");

		if (studentName.equals("Nisha")) {
			return 90;
		} else if (studentName.equals("teja")) {
			return 88.3;
		} else {
			System.out.println(studentName + "is not defined");
		}
		return 0;

	}
}
