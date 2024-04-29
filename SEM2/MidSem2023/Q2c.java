import java.util.Scanner;

public class Q2c {
    public static void main(String[] args) {
        Employee[] arr = new Employee[50];
        for(int i = 0 ; i < 50 ; i++){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Employee Details:");
            String name = sc.next();
            int age = sc.nextInt();
            int eid = sc.nextInt();
            String dept = sc.next();
            int salary = sc.nextInt();
            arr[i] = new Employee(name,age,eid,dept,salary);
        }
        for(Employee e : arr){
            e.displayDetails();
        }
    }
}
