package JavaProgramms;

public class PalindromeNumber {

	// 151 454 34543 161 78987

	public static void isPalindromeNumber(int num) {

		int r = 0;
		int sum = 0;
		int t;

		t = num;

		while (num > 0) {
			r = num % 10;
			sum = (sum * 10) + r;
			num = num / 10;
		}
		if (t == sum) {
			System.out.println("it is a palindrome number");
		} else {
			System.out.println("Not palindrome number");
		}

	}

	public static void main(String[] args) {
		isPalindromeNumber(151);
		isPalindromeNumber(123);
		isPalindromeNumber(78987);

	}

}
