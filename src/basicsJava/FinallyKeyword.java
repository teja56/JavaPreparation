package basicsJava;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FinallyKeyword {

	public static void main(String[] args) {
//finally block will execute in any condition
	/*	try{
		int i=9/0;
		}
		catch(Exception e){
			e.printStackTrace();
		}
		finally{
			System.out.println("Finally block");
		}
	

		try{
		int i=9/0;
		}
		finally{
			System.out.println("Finally block");
		}
		*/
		int p=50;
		System.out.println("going to run try block");
		try{
			int div =p/50;
		} catch(Exception e){
			System.out.println("Some exception");
			e.printStackTrace();
		} 
		finally{
			System.out.println("eception comng or not");
		}
		System.out.println("hello");

		Properties prop =new Properties();
		
		try {
			FileInputStream ip =new FileInputStream("");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	

	
}
