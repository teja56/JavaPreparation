package JavaProgramms;

public class ReverseNumber {

	public static void main(String[] args) {

		// 1234---- 4321

		int num = 2131535;
		int rev = 0;

		while (num != 0) {
			int n = num % 10;
			rev = (rev * 10) + n;
			num = num / 10;
		}
		System.out.println("reversed number is : "+rev);

	}

}
