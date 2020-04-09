package basicsJava;

public class GCConcept {

	// Garbage collector
	public static void main(String[] args) {

		GCConcept g1 = new GCConcept();
		g1 = null;

		System.gc();

	}
	
	@Override
	public void finalize() {
		System.out.println("Hello");
	}
}
