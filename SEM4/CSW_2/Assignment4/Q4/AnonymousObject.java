package Assignment4.Q4;

public class AnonymousObject {
    private String name;
    public AnonymousObject(String name) {
        this.name = name;
        System.out.println(name + " created.");
    }
    protected void finalize() throws Throwable {
        System.out.println(name + " is garbage collected.");
        super.finalize();
    }
    public static void main(String[] args) {
        new AnonymousObject("AnonymousObject");
        System.gc();
    }
}
