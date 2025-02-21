package ClassWork.class_6;

public class Main {
    public static void main(String[] args) {
        Department d =new Department("ITER",3);
        d.addProfessor(new Professor("Ankush","AD"));
        d.addProfessor(new Professor("Pratik","CSW"));
        d.display();
        d.searchProfessor("Pratik");
        d.searchProfessor("Debashish");
    }
}
