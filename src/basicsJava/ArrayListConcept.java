package basicsJava;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		// default capacity/size of arraylist is 10
		ArrayList ar = new ArrayList();

		System.out.println(ar.size());

		ar.add("abc"); // 0
		ar.add(200); // 1

		System.out.println(ar.size());

		ar.add('K');
		ar.add(12.2342342);
		System.out.println(ar.size());

		// ar.remove(3);
		// System.out.println(ar.size());

		System.out.println(ar.get(0));

		System.out.println(ar.get(3));

		// System.out.println(ar.get(6)); indexOutofBoundException

		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}

		// generics in ArrayList

		ArrayList<Integer> markList = new ArrayList<Integer>();
		markList.add(10);
		markList.add(20);

		ArrayList<Double> bmi = new ArrayList<Double>();
		bmi.add(10.2);
		bmi.add(20.23423);

		ArrayList<String> linksList = new ArrayList<String>();
		linksList.add("Login");
		linksList.add("sign Up");
		linksList.add("Forgot Password");
		linksList.add("Privacy Policy");
		linksList.add("Contact Us");

		System.out.println("Total links on login page: " + linksList.size());

		for (int linkNum = 0; linkNum < linksList.size(); linkNum++) {
			System.out.println(linksList.get(linkNum));

			if (linksList.get(linkNum).equals("Privacy Policy")) {
				System.out.println("click on: " + linksList.get(linkNum));
				break;
			}
		}

	}

}
