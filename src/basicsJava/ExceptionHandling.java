package basicsJava;

public class ExceptionHandling {

	public static void main(String[] args) {

		System.out.println("A");

		// int i=9/0; //ArthmeticExpression

		try {
			int i = 9 / 0;
		} catch (Throwable e) {
			System.out.println("Some exeption occured");
			e.printStackTrace();
		}

		System.out.println("B");

		
		
		
	}

}
