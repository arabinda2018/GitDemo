package collectionconcepts;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ArraylistIterate {
public static void main(String[] args) {
	ArrayList<String> list = new ArrayList<String>();
    list.add("Sagio Mane");
    list.add("Karius");
    list.add("Mo Salah");
    list.add("Firmino");
    list.add("Lovren");
    list.add("Steven Gerrard");
    list.add("Karius");
    list.add("Mo Salah");

    Set<String> s = new HashSet<String>();//
    
  //  webdriver driver = new Chromedriver();
    
    //child class object can be referred as a parent interface refrence variable 

    for(String name : list) {
        if(s.add(name) == false)
            System.out.println(name + "is duplicated");
    }
    System.out.println("from m22");
}

}
