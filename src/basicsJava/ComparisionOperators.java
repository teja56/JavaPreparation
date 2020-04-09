package basicsJava;

public class ComparisionOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 300;
		int b = 200;

		if (b > a) {
			System.out.println("B is greater than A");
		} else {
			System.out.println("A is greater than B");
		}

		if (a == b) {
			System.out.println("both are equal");

		}

		if (a >= b) {
			System.out.println("a is greater than or equal to b");
		}
		// > < >= <= == !=

		boolean flag = false;
		if (!flag) {
			System.out.println("PASS");
		}else{
			System.out.println("FAIL");
		}
		
		if(a!=b){
			
		}

		// dead code:
		if(false){
			System.out.println("Testing");
		}
		
		boolean t= false;
		if(t){
			System.out.println("Testing");
		}
		
		//wap to find out max number (given three numbers)
		
		int x=100;
		int y=200;
		int z=300;
		//&& -short circuit operator
		if(x>y && x>z){
			System.out.println("X is big");
		}else if(y>z){
			System.out.println("Y is big number");
			
		}else{
			System.out.println("Z is big number");
		}
				
		
	}

}
