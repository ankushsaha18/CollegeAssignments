package MidSem2024.Q2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Car implements Comparable<Car>{
    private int modelNo;
    private String name;
    private double price;

    public Car(int modelNo, String name, double price) {
        this.modelNo = modelNo;
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
    public String toString(){
        return modelNo + " " + name + " " + price;
    }

    public int compareTo(Car c){
        return Double.compare(this.getPrice(),c.getPrice());
    }
}
public class CarApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Car> carShowroom = new ArrayList<>();
        carShowroom.add(new Car(100,"Toyota",5000000));
        carShowroom.add(new Car(102,"Hyundai",1800000));
        carShowroom.add(new Car(213,"Range Rover",9600000));
        System.out.println(carShowroom);
        Collections.sort(carShowroom);
        System.out.println(carShowroom);
        double search = sc.nextDouble();
        for(Car c : carShowroom){
            if(c.getPrice() == search){
                System.out.println(c);
            }
        }
    }
}
