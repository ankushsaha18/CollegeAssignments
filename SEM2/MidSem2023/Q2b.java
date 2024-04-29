public class Q2b {
    public static void main(String[] args) {
        Employee e1 = new Employee("Ankush",18,1001,"SDE",50000);
        Employee e2 = new Employee("Kunal",27,1251,"SDE-2",100000);
        e1.displayDetails();
        e2.displayDetails();
    }
}
class Person {
    String name;
    int age;
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    void displayStudent(){
        System.out.print(name+"\t"+age);
    }
}
class Employee extends Person{
    int eid;
    String dept;
    int salary;
    Employee(String name, int age, int eid, String dept, int salary) {
        super(name, age);
        this.eid = eid;
        this.dept = dept;
        this.salary = salary;
    }
    void displayDetails(){
        super.displayStudent();
        System.out.println("\t"+eid+"\t"+dept+"\t"+salary);
    }
}

