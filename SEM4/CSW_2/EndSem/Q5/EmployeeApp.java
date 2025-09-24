package EndSem.Q5;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.Comparator;

class Employee{
    private int empid;
    private String name;
    private LocalDate doj;
    private LocalDate dob;

    public Employee(int empid, String name, LocalDate doj, LocalDate dob) {
        this.empid = empid;
        this.name = name;
        this.doj = doj;
        this.dob = dob;
    }

    public int getEmpid() {
        return empid;
    }
    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDoj() {
        return doj;
    }
    public void setDoj(LocalDate doj) {
        this.doj = doj;
    }

    public LocalDate getDob() {
        return dob;
    }
    public void setDob(LocalDate dob) {
        this.dob = dob;
    }
}
public class EmployeeApp {
    public static void age_and_experience(Employee e){
        long experience = ChronoUnit.YEARS.between(e.getDoj(),LocalDate.now());
        long age = ChronoUnit.YEARS.between(e.getDob(),LocalDate.now());
        System.out.println("Experience = " + experience + " years");
        System.out.println("Age = " + age + " years");
    }
    public static void seniorEmployee(Employee a,Employee b){
        int result = a.getDoj().compareTo(b.getDoj());
        if(result < 0){
            System.out.println(a.getName() + " is senior");
        }else if(result > 0){
            System.out.println(b.getName() + " is senior");
        }else {
            System.out.println("Both have same experience");
        }
    }
    public static void sort(Employee[] eArray){
        Arrays.sort(eArray, (a,b) -> Integer.compare(a.getEmpid(),b.getEmpid()));
    }

    public static void main(String[] args) {
        Employee e1 = new Employee(12,"ABC",LocalDate.of(2020,9,12),LocalDate.of(2000,9,12));
        Employee e2 = new Employee(1,"ESD",LocalDate.of(2022,9,12),LocalDate.of(1999,9,12));
        Employee e3 = new Employee(10,"USB",LocalDate.of(2018,9,12),LocalDate.of(2003,9,12));
        seniorEmployee(e1,e2);
        age_and_experience(e3);
        Employee[] earr = {e1,e2,e3};
        sort(earr);
        for (Employee e : earr){
            System.out.println(e.getName());
        }
    }
}
