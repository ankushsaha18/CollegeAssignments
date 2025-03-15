package Assignment2.Assignment2_2.Q7;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class App {
    public static void main(String[] args) {
        TreeMap<String,Address> tm = new TreeMap<>();
        tm.put("Ankush",new Address(1001,"Coochbehar"));
        tm.put("David",new Address(4512,"Sydney"));
        Iterator<Map.Entry<String,Address>> itr = tm.entrySet().iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
