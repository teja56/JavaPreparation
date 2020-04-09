package util;

public class Library {

	public int totalNumberOfBooks() {
		int numberOfBooks = 100;
		return numberOfBooks;
	}

	public int getSubjectBooks(String category) {
		if (category.equals("Physics")) {
			return 50;
		} else if (category.equals("Maths")) {
			return 500;
		} else {
			System.out.println("category books are not available");
			return 0;
		}
	}
}
