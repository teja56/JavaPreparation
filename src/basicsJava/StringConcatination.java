package basicsJava;

public class StringConcatination {

	public static void main(String[] args) {

		System.out.println("Hello Saiteja");
		
		int i=10;
		System.out.println(i);
		System.out.println(100+200);
		int age =25;
		System.out.println("The age of saiteja is "+ age);
		
		int foodbill =25;
		int cocktailbill =100;
		int totalbill = foodbill+cocktailbill;
		System.out.println("Totla bill need to be paid" +  totalbill);
		System.out.println("Totla bill need to be paid" + foodbill+ cocktailbill);
		System.out.println("Totla bill need to be paid" + (foodbill+ cocktailbill));

		
		int a= 100;
		int b=200;
		String x= "Hello";
		String y ="world";
		
		System.out.println(a+b);
		System.out.println(x+y);
		System.out.println(a+x+y);
		System.out.println(a+b+x+y);
		System.out.println(x+y+a+b);
		System.out.println(x+y+(a+b));
		System.out.println("the value of a is " + a);
		System.out.println("the value of b is " + b);
		System.out.println("the sum is: "+a+b); //wrong
		System.out.println("the sum is: "+(a+b)); 

		
		byte b1 =100;
		byte b2 =25;
		byte diff = (byte) (b1-b2); // int 75 converting into byte 75
		//difference of any byte will be int
		int d1= b1-b2; //acceptable
		System.out.println(b1-b2);
		System.out.println(diff);
		
		long l1=33;
		long l2 =33;
		long add =l1+l2;
		long diffs = l1-l2;
		System.out.println(add);
		System.out.println(diffs);
		
		int i1= 5;
		int i2=1;
		int i3 = i1-i2;
		System.out.println(i3);
		
		//want to give space
		
		System.out.println(x+" "+y);
		
		
		
		
		
		
		
		
	}

}
