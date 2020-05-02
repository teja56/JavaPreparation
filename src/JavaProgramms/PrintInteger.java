package JavaProgramms;

import java.util.Scanner;

public class PrintInteger {
//	1 Java Program to Print an Integer (Entered by the User)

	public static void main(String[] args) {
		
		Scanner reader =new Scanner(System.in);
		System.out.println("please enter a number");
		
		int num =reader.nextInt();
		System.out.println("you entered number is "+num);
	}
	
	

}
