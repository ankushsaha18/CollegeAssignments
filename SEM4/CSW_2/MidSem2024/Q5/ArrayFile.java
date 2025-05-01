package MidSem2024.Q5;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayFile {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter array elements: ");
        for (int i = 0 ; i < size ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Array: " + Arrays.toString(arr));
        System.out.print("Enter file name to write: ");
        String f = sc.next();
        writeprime(f,arr);
        readprime(f);
    }
    public static void writeprime(String f,int[] arr) throws IOException {
        try {
            File file = new File(f);
            if(!file.exists()){
                System.out.println("File does not exist");
                return;
            }
            PrintWriter pw = new PrintWriter(new FileWriter(file,true));
            for(int i : arr){
                if(isPrime(i)){
                    pw.println(i);
                }
            }
            pw.close();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
    public static void readprime(String f) throws IOException{
        try {
            File file = new File(f);
            if(!file.exists()){
                System.out.println("File does not exist");
                return;
            }
            BufferedReader bf = new BufferedReader(new FileReader(file));
            String line;
            System.out.println("Prime Numbers are ---");
            while ((line = bf.readLine()) != null){
                int i = Integer.parseInt(line);
                if(isPrime(i)){
                    System.out.println(i + " ");
                }
            }
            System.out.println();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
    public static boolean isPrime(int n){
        for (int i = 2 ; i <= Math.sqrt(n) ; i++){
            if((n%i) == 0){
                return false;
            }
        }
        return true;
    }
}
