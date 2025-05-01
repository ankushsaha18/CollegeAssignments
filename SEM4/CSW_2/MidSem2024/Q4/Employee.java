package MidSem2024.Q4;

import java.util.Date;

public class Employee {
    private String name;
    private int age;
    private String dob;

    public Employee(String name, int age, String dob) {
        this.name = name;
        this.age = age;
        this.dob = dob;
    }

    public String generatePassword(){
        String lastName = name.substring(name.lastIndexOf(" ") + 1);
        String year = (dob.split("/")[2]);
        return lastName + year;
    }

    public Student getStudent(String name,int age,String dob){
        return new Student(name,age,dob);
    }

    public void display(){
        String[] nameArray = name.split(" ");
        String middle = "";
        if(nameArray.length == 3){
            middle = nameArray[1];
        }
        System.out.println("First Name: " + nameArray[0]);
        System.out.println("Middle Name: " + middle);
        System.out.println("Last Name: " + nameArray[nameArray.length-1]);
        System.out.println("DOB: " + dob);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Ankush Saha",19,"23/09/2005");
        Employee e2 = new Employee("Ramesh Kumar",32,"23/07/1993");
        System.out.println(e1.generatePassword());
        System.out.println(e2.generatePassword());
        System.out.println(e1.getStudent("Ankush Saha",19,"23/09/2005"));
        e2.display();
    }

}
class Student{
    private String name;
    private int age;
    private String dob;

    public Student(String name, int age, String dob) {
        this.name = name;
        this.age = age;
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", dob='" + dob + '\'' +
                '}';
    }
}
