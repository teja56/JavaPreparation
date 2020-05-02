package JavaProgramms;

public  class LargerstAmongThreeNumbers {
//	9 Java Program to Find the Largest Among Three Numbers
	public static void main(String[] args) {

		int x=600;
		int y=1500;
		int z=1000;
		if(x>y && x>z){
			System.out.println("x is the greatest");
		}else if(y>z){
			System.out.println("y is the greatest");
		}else{
			System.out.println("z is the greatest");
		}
		
		
		if(x>=y){
			if(x>=z){
				System.out.println("x is the greatest");
			}else{
				System.out.println("z is the greatest");
			}
		}else{
			if(y>=z){
				System.out.println("y is the greatest");
			}else{
				System.out.println("z is the greatest");
			}
		}
	}

}
