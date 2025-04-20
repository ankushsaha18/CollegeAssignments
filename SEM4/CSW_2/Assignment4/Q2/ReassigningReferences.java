package Assignment4.Q2;

public class ReassigningReferences {
    private String name;

    public ReassigningReferences(String name) {
        this.name = name;
        System.out.println(name + " created");
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println(name + " destroyed");
        super.finalize();
    }

    public static void main(String[] args) {
        ReassigningReferences obj1 = new ReassigningReferences("Object1");
        ReassigningReferences obj2 = new ReassigningReferences("Object2");
        obj1 = obj2;
        System.gc();
    }
}
