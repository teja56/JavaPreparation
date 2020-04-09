package basicsJava;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class UserData {

	public static void main(String[] args) {

		// HashMap<String, String> userMap =new HashMap<String, String>();
		// Hash map is non synchronized --not thread safe.
				// one null key and multiple null values in hash map.

		Map<String, String> userMap = new HashMap<String, String>();

		userMap.put("id", "1");
		userMap.put("name", "Tom");
		userMap.put("city", "Bangalore");
		userMap.put(null, "pune");
		userMap.put(null, "hyd");
		userMap.put("company", null);
		userMap.put("country", null);

		System.out.println(userMap);
		System.out.println(userMap.get("id"));
		System.out.println(userMap.size());

		for (Map.Entry m : userMap.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

		// hashtable:
		
		//doesnt allow null key and null value
		Hashtable<String, Integer> productTable = new Hashtable<String, Integer>();
		productTable.put("Apple MacBook", 2000);
		productTable.put("windows Hp Laptop", 1000);
		productTable.put("Apple iphoneX", 1500);
	//	productTable.put(null, null); //no null key and null values in hashtable

		System.out.println(productTable);
		System.out.println(productTable.get("Apple MacBook"));

		for (Map.Entry e : productTable.entrySet()) {
			System.out.println(e.getKey() + " " + e.getValue());
		}

		
	}

}
