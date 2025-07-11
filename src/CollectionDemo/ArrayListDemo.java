package CollectionDemo;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		// declaration
		ArrayList al = new ArrayList();
		// List mylist=new ArrayList();
		// ArrayList <Integer>all=new ArrayList<Integer >();

		// adding data into arraylist
		al.add("tiger");
		al.add("Girish");
		al.add("rita");
		al.add("vijay");
		al.add("Naresh");
		// size
		System.out.println(al.size());
		// printing data
		System.out.println(al);
		//al.remove(2);
		System.out.println(al);
		// inserting on particular
		//al.add(1, "Sheweta");
		System.out.println(al);
		//al.set(0, 1);
		// getspecific
		System.out.println(al.get(1));
		for (Object X : al) {
			System.out.println(X);
		}
		System.out.println("*********");
		ArrayList all = new ArrayList();
		all.add("Girish");
		all.add("Naresh");
		
		ArrayList all2=new ArrayList();
		all2.add("Naresh");
		all2.add("Girish");
		al.removeAll(all2);
		System.out.println(al);

	}

}
