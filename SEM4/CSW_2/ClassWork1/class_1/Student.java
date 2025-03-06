package ClassWork1.class_1;

public class Student {
    private String name;
    private int roll;
    private String branch;
    private int age;
    public Student(){
        super();
    }
    public Student(String name,int roll,String branch,int age){
        this.name = name;
        this.roll = roll;
        this.branch = branch;
        this.age = age;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setRoll(int roll) {
        this.roll = roll;
    }
    public void setBranch(String branch) {
        this.branch = branch;
    }
    public void setAge(int age) {
        if(age >= 16){
            this.age = age;
        }else {
            System.out.println("Not allowed");
        }
    }
    public String getName() {
        return name;
    }
    public int getRoll() {
        return roll;
    }
    public String getBranch() {
        return branch;
    }
    public int getAge() {
        return age;
    }
    public String toString(){
        return name + " " + roll + " " + branch + " " + age;
    }
    public static void main(String[] args) {
        Student s = new Student("Ankush",51,"CSE",19);
        System.out.println(s);
        s.setAge(15);
    }
}
