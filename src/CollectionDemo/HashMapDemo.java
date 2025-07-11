package CollectionDemo;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	// data store in key and value pair
	// key should unique value can reapeat

	public static void main(String args[]) {
		// declaration
		// Map map=new HashMap();
		HashMap<Integer, String> hm = new HashMap<Integer, String>();

		// adding values if added duplicate key with new value previous value get
		// updated

		hm.put(1, "Girish");
		hm.put(2, "Krishna");
		hm.put(3, "Moe");
		hm.put(4, "sandip");
		System.out.println(hm);
		System.out.println(hm.size());
		// remove
		hm.remove(3);
		System.out.println(hm);

		// access particular value of the key
		System.out.println(hm.get(4));
		// all key value
		System.out.println(hm.keySet());
		System.out.println(hm.values());
		System.out.println(hm.entrySet());
		//retrive all data from 
		for (int k : hm.keySet()) {

			System.out.println(hm.get(k));
		}

	}
}
