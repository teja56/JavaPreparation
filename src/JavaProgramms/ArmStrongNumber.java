package JavaProgramms;

public class ArmStrongNumber {

	// 153
	// 1*1*1 =1
	// 5*5*5 =135
	// 3*3*3 = 27
	// 1+125+27 =153
	// 407
	// 0
	// 371

	public static void isArmStrongNumber(int num) {
		int cube = 0;
		int r;
		int t;
		t = num;
		while (num > 0) {
			r = num % 10;
			num = num / 10;
			cube = cube + (r * r * r);
		}
		if (t == cube) {
			System.out.println("this is armstonrg number");
		} else {
			System.out.println("this is not an armstrong number");
		}
	}

	public static void main(String[] args) {
		isArmStrongNumber(153);
	}

}
