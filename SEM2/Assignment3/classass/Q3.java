package classass;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Student stu1 = new Student();
    }
}
class MarksOutOfBoundException extends Exception{
    MarksOutOfBoundException(String message){
        super(message);
    }
}
class Student{
    String name;
    int mark;
    Student(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name of the student:");
        this.name = sc.nextLine();
        System.out.print("Enter Marks:");
        try{
            this.mark = sc.nextInt();
            if(mark > 100){
                throw new MarksOutOfBoundException("Marks should be less than 100");
            }
        }catch (MarksOutOfBoundException e){
            System.out.println(e.getMessage());
        }
    }
}
