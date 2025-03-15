package Assignment2.Assignment2_1.Q7;

import java.util.Comparator;

public class RollComparator implements Comparator<Student> {
    public int compare(Student s1,Student s2){
        return Integer.compare(s1.getRollNumber(),s2.getRollNumber());
    }
}
