package JavaProgramms;

public class PrimeNumber {
	// prime number: which can divide by itself
	// 2,3,5,7,11,13,17

	// generic Method //is prime number or not
	public static boolean isPrimeNumber(int num) {
		if (num <= 1) {
			return false;
		}
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void getPrimeNumbers(int num) {
		System.out.println("prime number upto "+num);
		for (int i = 2; i <= num; i++) {
			if (isPrimeNumber(i)) {
				System.out.print(i + " ");
			}
		}
	}

	public static void main(String[] args) {
	//	System.out.println("2 is prime number " + isPrimeNumber(2));
	//	System.out.println("3 is prime number " + isPrimeNumber(3));
	//	System.out.println("17 is prime number " + isPrimeNumber(17));
		getPrimeNumbers(20);
	}

}
