package Assignment2.Assignment2_2.Q3;

import java.util.ArrayList;
import java.util.Collections;

public class CarApp {
    public static void main(String[] args) {
        ArrayList<Car> list = new ArrayList<>();
        list.add(new Car(101,"Innova",100));
        list.add(new Car(102,"Invicto",178));
        list.add(new Car(103,"Safari",52));
        System.out.println("Before Sorting ---");
        System.out.println(list);
        System.out.println("After Sorting ---");
        Collections.sort(list);
        System.out.println(list);
    }
}
