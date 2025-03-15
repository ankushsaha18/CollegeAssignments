package Assignment2.Assignment2_2.Q2;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListUser {
    public static void main(String[] args) {
        ArrayList<User> list = new ArrayList<>();
        list.add(new User("Ankush",19));
        list.add(new User("David",20));
        list.add(new User("Ashley",18));
        System.out.println("Before sorting ---");
        for(User u : list){
            System.out.println(u.getName() + " " + u.getAge());
        }
        System.out.println("After sorting ---");
        Collections.sort(list,new AgeComparator());
        for(User u : list){
            System.out.println(u.getName() + " " + u.getAge());
        }
    }
}
