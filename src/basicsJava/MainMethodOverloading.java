package basicsJava;

public class MainMethodOverloading {

	public static void main(String args[]) {
		System.out.println("This is mamin method for java");
		MainMethodOverloading.main(10);
		MainMethodOverloading.main("saiteja");
	}

	public static void main(int i){
		System.out.println(i);
	
	}
	public static void main(String a){
		System.out.println(a);
	
	}

}
