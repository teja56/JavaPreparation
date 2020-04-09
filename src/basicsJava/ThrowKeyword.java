package basicsJava;

public class ThrowKeyword {

	public static void main(String[] args) {

		
		try {
			throw new Exception("FileNotAvaialbaleException");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
