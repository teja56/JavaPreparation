package oop3;

public class ApolloHospital implements USMedical, UKMedical, IndiaMedical {

	@Override
	public void cardioServices() {
		// TODO Auto-generated method stub
		System.out.println("Apollo---CardioServices");
		System.out.println("Total doctors " + 5);
	}

	@Override
	public void oncologyServices() {
		// TODO Auto-generated method stub
		System.out.println("Apollo ---oncologyServices");
	}

	@Override
	public void neuroServices() {
		// TODO Auto-generated method stub
		System.out.println("Apollo ---neuroServices");

	}

	@Override
	public void mediaclInsurance() {
		// TODO Auto-generated method stub
		System.out.println("Apollo ---mediaclInsurance");

	}

	@Override
	public void physicoServices() {
		// TODO Auto-generated method stub
		System.out.println("Apollo ---physicoServices");

	}

	@Override
	public void dentalServices() {
		// TODO Auto-generated method stub
		System.out.println("Apollo ---dentalServices");

	}

	@Override
	public void ambulanceServices() {
		// TODO Auto-generated method stub
		System.out.println("Apollo ---ambulanceServices");

	}

	@Override
	public void EMTServices() {
		// TODO Auto-generated method stub
		System.out.println("Apollo ---EMTServices");

	}

	@Override
	public void OPTServices() {
		// TODO Auto-generated method stub
		System.out.println("Apollo ---OPTServices");

	}

	@Override
	public void doctorsInternship(int doctors) {
		// TODO Auto-generated method stub
		System.out.println("Total doctors elgible for internship "+doctors);
	}

	@Override
	public void doctorsInternship(int doctors, int nurse) {
		// TODO Auto-generated method stub
		System.out.println("Total doctors and nurses are elgible for internship "+ doctors+" "+nurse);

	}
	
	public void freeCamp(){
		System.out.println("Apollo--freecamps");
	}
	public void  pathalogyServices(){
		System.out.println("Apollo--pathalogyServices");
	
	}
}
