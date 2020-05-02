package JavaProgramms;

public class AlphabetCheck {

	public static void main(String[] args) {

		char c = '6';

		if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
			System.out.println(c + " is an alphabet");
		} else {
			System.out.println(c + " is not an alphabet");
		}

	}

}
