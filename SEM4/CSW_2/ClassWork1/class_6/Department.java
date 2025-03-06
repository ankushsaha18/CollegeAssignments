package ClassWork1.class_6;

public class Department {
    private String deptname;
    private Professor[] professors;
    private int profcount;

    public Department(String deptname,int size) {
        super();
        this.deptname = deptname;
        this.professors=new Professor[size];
        this.profcount=0;
    }
    public void addProfessor(Professor p){
        if (this.profcount < this.professors.length){
            this.professors[this.profcount++] = p;
            System.out.println("Professor added");
        }else{
            System.out.println("Professors Full !!!");
        }
    }
    public void display(){
        if(this.profcount == 0){
            System.out.println("No Student");
        }else {
            System.out.println("List of Professor in " + this.deptname);
            for (int i = 0; i < this.profcount; i++) {
                System.out.println(deptname + " :" + this.professors[i]);
            }
        }
    }
    public Professor searchProfessor(String profname){
        for (int i = 0 ; i < this.profcount ; i++){
            if(this.professors[i].getProfname() == profname){
                System.out.println("Professor found -> " + this.professors[i]);
                return this.professors[i];
            }
        }
        System.out.println("Professor not found");
        return null;
    }
}


