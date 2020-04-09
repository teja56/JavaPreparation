package basicsJava;

import java.util.ArrayList;
import java.util.List;

public class RevereseString {

	public static void main(String[] args) {

		// “IITJEE”
		System.out.println(countCharacter('E', 0, "IITJEE"));

	}

	public static int countCharacter(char c,int count, String text) {
		for (int i=0;i<text.length();i++){
			if(text.charAt(i)==c){
				count++;
			}
				
		}
		return count;
	}

}
