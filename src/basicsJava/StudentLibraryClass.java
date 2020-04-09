package basicsJava;

import util.Library;

public class StudentLibraryClass {

	public static void main(String[] args) {

		Library obj = new Library();
		System.out.println(obj.getSubjectBooks("Maths"));
		System.out.println(obj.totalNumberOfBooks());

	}

}
