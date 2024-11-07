package collectionconcepts;

import java.util.HashMap;
import java.util.Map;

public class HasMapDemo {
public static void main(String[] args) {
	HashMap<Integer, String>hm= new HashMap<Integer, String>();
	hm.put(100, "Arabinda");
	hm.put(101, "Smith");
	hm.put(102, "karl");
	hm.put(103, "scott");
	for(String i :hm.values()) {
		System.out.println(i);
	}
	
	for(Integer i:hm.keySet()) {
		System.out.println(i+"  "+hm.get(i));
	}
	
	
}
}
