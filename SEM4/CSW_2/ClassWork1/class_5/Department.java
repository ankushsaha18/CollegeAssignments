package ClassWork1.class_5;

public class Department {
    private String deptname;

    public Department(String deptname) {
        super();
        this.deptname = deptname;

    }

    public String getDeptname() {
        return deptname;
    }

    @Override
    public String toString() {
        return deptname;
    }
}
