package Assignment2.Assignment2_2.Q2;

import java.util.Comparator;

public class AgeComparator implements Comparator<User> {
    public int compare(User u1,User u2){
        return Integer.compare(u1.getAge(),u2.getAge());
    }
}
