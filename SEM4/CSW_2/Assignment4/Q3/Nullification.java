package Assignment4.Q3;

public class Nullification {
    private String name;

    public Nullification(String name) {
        System.out.println(name + " created");
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println(name + " destroyed");
        super.finalize();
    }

    public static void main(String[] args) {
        Nullification obj = new Nullification("Object1");
        obj = null;
        System.gc();
    }
}
