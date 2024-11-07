package collectionconcepts;

import java.util.ArrayList;

public class DuplicateValue {
public static void main(String[] args) {
	ArrayList<String>al = new ArrayList<String>();
	al.add("Corejava");
	al.add("python");
	al.add("CSharp");
	al.add("javascript");
	al.add("Corejava");
	//find duplicate value from the arraylist.
	
	for(String sub:al) {
		if(sub.equals("Corejava")){
			System.out.println("core java");
		}
	}
}

public void m1() {
	System.out.println("from m1");
}
}
