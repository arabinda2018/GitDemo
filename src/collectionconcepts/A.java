package collectionconcepts;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class A {
public static void main(String[] args) {
	ArrayList<String>a = new ArrayList<String>();
	a.add("Jan");
	a.add("feb");
	a.add("Jan");
	a.add("apr");
	a.add("may");
	Set<String> s = new HashSet<String>();
	for(String m:a) {
		if(s.add(m)==false) {
			//System.out.println(m+"is duplicate");
		}
		else {
			System.out.println(m+"all are unique");
		}
	}
	
	
}
}
