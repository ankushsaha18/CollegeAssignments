package EndSem.Q7;

import java.util.Scanner;

class MyArray{
    private int[] array;
    private int size;

    public MyArray(int size) {
        this.size = size;
        this.array = new int[size];
    }

    public int[] getArray() {
        return array;
    }
    public void setArray(int[] array) {
        this.array = array;
    }

    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }
    public synchronized void read() {
        Scanner sc = new Scanner(System.in);
        for(int i = 0 ; i < size ; i++){
            array[i] = sc.nextInt();
        }
    }
    public void print(){
        synchronized (this){
            for(int i = 0 ; i < size ; i++){
                System.out.print(array[i] + " ");
            }
            System.out.println();
        }
    }
}
class ReadThread extends Thread{
    private final MyArray ma;
    public ReadThread(MyArray ma){
        this.ma = ma;
    }
    public void run(){
        ma.read();
        System.out.println("ReadThread finished");
    }
}
class PrintThread extends Thread{
    private final MyArray ma;
    public PrintThread(MyArray ma){
        this.ma = ma;
    }
    public void run(){
        ma.print();
        System.out.println("PrintThread finished");
    }
}
public class ArrayApp {
    public static void main(String[] args) throws InterruptedException{
        MyArray ma = new MyArray(3);
        Thread read = new ReadThread(ma);
        Thread print = new PrintThread(ma);
        read.start();
        try {
            read.join();
        }catch (InterruptedException e){
            e.getCause();
        }
        print.start();
    }
}
