package collectionconcepts;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
public static void main(String[] args) {
	HashSet<Integer>hs = new HashSet<Integer>();
	hs.add(42);
	hs.add(32);
	hs.add(15);
	hs.add(78);
	hs.add(49);
	
	for(Integer num:hs) {
		System.out.println(num);
	}
	
Iterator<Integer>itr =	hs.iterator();
while(itr.hasNext()) {
	System.out.println(itr.next());
}
}
}
