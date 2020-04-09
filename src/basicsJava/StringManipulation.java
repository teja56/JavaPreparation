package basicsJava;

public class StringManipulation {

	public static void main(String[] args) {

		String str = "I love java but I do not like javascript and jquery";

		// string is collection of characters

		System.out.println(str.length());

		System.out.println(str.charAt(7)); // s

		System.out.println(str.charAt(0)); // I

		// System.out.println(str.charAt(38)); //StringIndexOutOfBoundsException

		System.out.println(str.charAt(37)); // a

		System.out.println(str.indexOf("I"));

		System.out.println(str.indexOf("love"));

		System.out.println(str.indexOf("j", str.indexOf("j") + 1));

		System.out.println(str.indexOf("j", str.indexOf("j", str.indexOf("j") + 1) + 1));

		System.out.println(str.indexOf("java"));

		if (str.indexOf("python") == 1) {
			System.out.println("Pass");
		}

		// trim:
		String s1 = "    hello world     ";
		System.out.println(s1.trim());

		// replace:

		String date = "01-08-1993"; // 01/08/1993
		System.out.println(date.replace("-", "/"));

		System.out.println(s1.replace(" ", ""));

		// upper case:
		String name = "My name is saiteja";
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());

		// Sub string:
		String s2 = "your total amount is 1500 USD";
		System.out.println(s2.substring(21, 25));
		System.out.println(s2.substring(21, s2.indexOf("USD") - 1));

		System.out.println(name.substring(11));

		String total = s2.substring(21, s2.indexOf("USD") - 1);
		int totalvalue = Integer.parseInt(total);
		System.out.println(totalvalue + 100);

		// split:
		String lang = "java-Python-JavaScript-Ruby";
		String language[] = lang.split("-");
		System.out.println(language[0]);

		for (int i = 0; i < language.length; i++) {
			System.out.println(language[i]);

		}

		String user1Data = "Nisha;Mathew;22;IBM;nisha@ibm.com;15631391;";
		String user2Data = "teja sai 25 Cap teja@cab.com 13451391 ";
		String user3Data = "sai;kolla;26;CG;sai@cgi.com;13121391;";

		getUserData(user1Data,";");
		getUserData(user2Data," ");
		getUserData(user3Data,";");
		
		String pop ="testxXseleniumXxJavaXxPython";
		String pop1[]=pop.split("Xx");
		System.out.println(pop1[0]);
		System.out.println(pop1[1]);
		System.out.println(pop1[2]);

		String data ="test;pop;radar;animal";
		System.out.println(data.split(";")[0]);

		//equals:
		String emp1 ="hey this is saiteja here";
		String emp2 ="Hey this is saiteja here";
		System.out.println(emp1.equals(emp2));
		
		System.out.println(emp1.equalsIgnoreCase(emp2));

		//contains:
		System.out.println(emp1.contains("saiteja"));
	
		String mesg="Welcome Admin";
		if(mesg.contains("Admin")){
			System.out.println("login successfully");
		}else{
			System.out.println("login failed");
		}
	}

	public static void getUserData(String userdata, String splitChar) {
		String user[] = userdata.split(splitChar);
		for (int i = 0; i < user.length; i++) {
			System.out.println(user[i]);

		}
	}

}
