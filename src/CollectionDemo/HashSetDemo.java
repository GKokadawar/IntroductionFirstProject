package CollectionDemo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		// declaration set interface
		HashSet myset = new HashSet();
		// Set set1=new HashSet();
		// HashSet <String>myset1=new HashSet<String>();

		// adding element in hashset
		// hetoregenius data is allowed
		// order not preserved
		// duplicate not allowed
		// multiple nulls are not allowed
		myset.add(100);
		myset.add(10.5);
		myset.add("welcome");
		myset.add('A');
		myset.add(100);
		myset.add("welcome");
		myset.add(null);
		myset.add(null);

		System.out.println(myset);
		// removed
		myset.remove(100);
		System.out.println(myset);
		// insertion ..not possible because no order
		// read specific element from hashset workarround
		ArrayList al = new ArrayList(myset);
		System.out.println(al.get(2));

		// read all element
		for (Object x : myset) {

			System.out.println("The for each loop value : " + x);
			//clearing all element from hashset
			//myset.clear();
			System.out.println(myset);
			System.out.println(myset.isEmpty());
			System.out.println(myset.size());
		}

	}

}
