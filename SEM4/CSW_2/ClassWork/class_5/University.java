package ClassWork.class_5;

public class University {
    private String uniname;
    private Department [] departments;
    private int deptcount;

    public University(String uniname,int size) {
        super();
        this.uniname = uniname;
        this.departments = new Department[size];
        this.deptcount=0;
    }
    public void addDepartment(String d){
        if (this.deptcount >= this.departments.length){
            System.out.println("Departments Full !!!");
        }else{
            this.departments[this.deptcount++] = new Department(d);
            System.out.println("Department added");
        }
    }
    public void display(){
        for (int i = 0 ; i < this.deptcount ; i++){
            System.out.println(uniname + " :" + this.departments[i]);
        }
        if(this.deptcount == 0){
            System.out.println("No Departments");
        }
    }
}
