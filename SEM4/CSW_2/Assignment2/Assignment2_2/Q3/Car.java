package Assignment2.Assignment2_2.Q3;

public class Car implements Comparable<Car>{
    private int modelNo;
    private String name;
    private int stock;

    public Car(int modelNo, String name, int stock) {
        this.modelNo = modelNo;
        this.name = name;
        this.stock = stock;
    }

    public String toString(){
        return modelNo + " " + name + " " + stock;
    }

    public int compareTo(Car c){
        if(this.stock > c.stock){
            return 1;
        }else if(this.stock < c.stock){
            return -1;
        }else {
            return 0;
        }
    }
}
