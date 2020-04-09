package basicsJava;

public class MethodOverLoadingConcept {

	public static void main(String[] args) {
		MethodOverLoadingConcept obj = new MethodOverLoadingConcept();
		obj.login();
		obj.login(999888883);
	}

	// Method overloading: with in the class, having different methods with same
	// name but different number of parameters
	// and different types of parameters

	// many + forms ->Compile time Polymorphism

	public void login() {
		System.out.println("0 parameter login method");
	}

	public void login(String username) {
		System.out.println("1 Parameter " + username);
	}

	public void login(long number) {
		System.out.println("1 Parameter " + number);
	}

	/*
	 * public void login(int otp) {
	 * 
	 * }
	 */

	public void login(String email, String password) {
		System.out.println("2 paramenters");

	}

	public void login(String email, String password, String role) {
		System.out.println("3 paramenters");

	}

	public void search(String product) {

	}

	public void search(String product, int price) {

	}

	public void search(String product, int price, String color) {

	}

	public void userRegistartion(String email, String pwd, String phone) {

	}

	public void userRegistartion(String email, String pwd, String phone, String address) {

	}

}
