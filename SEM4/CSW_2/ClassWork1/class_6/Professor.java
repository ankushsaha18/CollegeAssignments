package ClassWork1.class_6;

public class Professor {
    private String profname;
    private String specialization;

    public Professor(String profname, String specialization) {
        this.profname = profname;
        this.specialization = specialization;
    }

    public String getProfname() {
        return profname;
    }

    @Override
    public String toString() {
        return profname + " " + specialization;
    }
}
