package collectionconcepts;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<Integer>al = new ArrayList<Integer>();
		al.add(45);
		al.add(32);
		al.add(15);
		al.add(64);
		al.add(94);
		for(int i =0;i<al.size();i++) {
			System.out.println(al.get(i));
		}

		for(Integer num:al) {
			System.out.println(num);
		}
		Iterator<Integer> itr =al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		al.removeAll(al);
	}
}
