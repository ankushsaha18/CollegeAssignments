package Assignment2.Assignment2_2.Q5;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Library {
    public static void main(String[] args) {
        HashMap<Integer,Book> library = new HashMap<>();
        library.put(101,new Book(101,"CSW","XYZ",55));
        library.put(102,new Book(102,"AD","TYU",36));
        library.put(103,new Book(103,"COA","IOO",77));
        System.out.println(library);
        Iterator<Map .Entry<Integer,Book>> itr = library.entrySet().iterator();
        while (itr.hasNext()){
            Book b = itr.next().getValue();
            if(b.getName().equals("AD")){
                itr.remove();
            }
        }
        System.out.println("Library after removing AD book ---");
        System.out.println(library);
        System.out.println("After removing book with id 103 ---");
        library.remove(103);
        System.out.println(library);
    }
}
