package oop3;

public class TestHospital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApolloHospital Ah =new ApolloHospital();
		Ah.ambulanceServices();
		Ah.cardioServices();
		
		Ah.mediaclInsurance();
		Ah.doctorsInternship(100);
		Ah.doctorsInternship(100, 30);
		Ah.EMTServices();
		Ah.pathalogyServices();
		Ah.freeCamp();
		Ah.logo();
		
		//Top Casting
		USMedical us = new ApolloHospital();
		us.logo();
		
		USMedical.parking();
		System.out.println(USMedical.min_fee);
	}

}
