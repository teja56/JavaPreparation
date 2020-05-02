package JavaProgramms;

public class SwapNumbers {
	//6 Java Program to Swap Two Numbers

	public static void main(String[] args) {

		int a=10;
		int b=20;
		
		System.out.println("before swapping:");
		System.out.println("a="+a);
		System.out.println("b="+b);
		
		System.out.println("After swapping");
		int temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println("a="+a);
		System.out.println("b="+b);
	
		int c=10;
		int d=20;
		//without temp var:
		System.out.println("before swapping:");
		System.out.println("c="+c);
		System.out.println("d="+d);
		
		System.out.println("After swapping");
		
		c=c-d;
		d=c+d;
		c=d-c;
		System.out.println("c="+c);
		System.out.println("d="+d);
		
	}

}
