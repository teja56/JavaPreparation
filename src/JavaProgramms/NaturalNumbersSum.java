package JavaProgramms;

public class NaturalNumbersSum {

	public static void main(String[] args) {

		// 1+2+3+4+5+......+100 =>5050
		int num = 100;
		int sum = 0;
		int sum1 = 0;

		for (int i = 1; i <= num; i++) {
			sum = sum + i;
		}
		System.out.println("sum is :" + sum);

		System.out.println(".......while........");
		int k=1;
		while(k<=num){
			sum1=sum1+k;
			k++;
		}
		System.out.println("sum is : "+sum1);
	}

}
