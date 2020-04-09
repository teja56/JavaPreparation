package basicsJava;

public class ArrayConcept {

	public static void main(String[] args) {

		//two major limitations
		//1.static array: size is fixed. to solve this problem, we use ArrayList - dynamic arrays.
		//2. cannot store different data types: to solve this problem, we use object static array or ArrayList. 
		
		// 1. int array.
		int i[] = new int[4];
		// int [] i =new int[4];
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;

		System.out.println(i[0]);
		System.out.println(i[3]);
		// System.out.println(i[4]); ArrayIndexOutOfBoundsException

		System.out.println(i.length); // length of the array

		// how to print all the values of array

		for (int k = 0; k < i.length; k++) {
			System.out.println(i[k]);
		}

		// 2. double array
		double d[] = new double[3];
		d[0] = 12.323;
		d[1] = 23.324;
		d[2] = 100;

		for (int a = 0; a < d.length; a++) {
			System.out.println(d[a]);
		}

		// String array
		String s[] = new String[4];
		s[0] = "java";
		s[1] = "Python";
		s[2] = "ruby";
		s[3] = "javascript";
		for (int p = 0; p < s.length; p++) {
			if (s[p].equals("javascript")) {
				System.out.println("I dont know " + s[p]);
			} else {
				System.out.println("I know " + s[p]);
			}
		}

		String studnetNames[] = new String[5];
		studnetNames[0] = "one";
		studnetNames[1] = "two";
		studnetNames[2] = "three";
		studnetNames[3] = "four";
		studnetNames[4] = "five";

		for (int count = 0; count < studnetNames.length; count++) {
			// System.out.println(studnetNames[count]);

			if (studnetNames[count].equals("one")) {
				System.out.println("Number is one");
			} else if (studnetNames[count].equals("two")) {
				System.out.println("Number is TWO");
			} else if (studnetNames[count].equals("three")) {
				System.out.println("Number is three");
			} else if (studnetNames[count].equals("four")) {
				System.out.println("Number is four");
			} else {
				System.out.println("No number");
			}
		}

		//Object static Array.
		Object []empData =new Object[5];
		empData[0]="Tom";
		empData[1]=25;
		empData[2]='M';
		empData[3]=1000.233;
		empData[4]=true;
	
	
	
		
		
		
	
	}
}
