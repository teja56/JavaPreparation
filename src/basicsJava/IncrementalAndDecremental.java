package basicsJava;

public class IncrementalAndDecremental {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=1;
		int j=i++; //increase the value by 1 //post incriment
		
		System.out.println(i); //2
		System.out.println(j); //1
		
		
		int p=1;
		int q=++p;  //pre increment
		System.out.println(p); //2
		System.out.println(q); //2
	
		int m=2;
		int n=m--; //post decrement
		System.out.println(m); //1
		System.out.println(n); //2
		
		int g=2;
		int h=--g;
		System.out.println(g); //1
		System.out.println(h); //1
		
		
		int c=-2; //-3
		int d=--c; //-3
		
		System.out.println(c);
		System.out.println(d);
		
	
	
	
	}

}
