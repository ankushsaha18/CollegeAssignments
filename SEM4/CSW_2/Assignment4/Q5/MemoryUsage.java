package Assignment4.Q5;

public class MemoryUsage {
    private int intVal; private double dblVal;
    public MemoryUsage(int intVal, double dblVal) {
        this.intVal = intVal; this.dblVal = dblVal;
    }
    public void setintVal(int intVal) {
        this.intVal = intVal;
    }
    public void setdblVal(double dblVal) {
        this.dblVal = dblVal;
    }
    public void displayValues() {
        System.out.println("[Integer Value: " + intVal + ", Double Value: " +
                dblVal + "]");
    }
    private static void displayMemoryStatus(String message) {
        Runtime runtime = Runtime.getRuntime();
        long totalMemory = runtime.totalMemory();
        long freeMemory = runtime.freeMemory();
        long usedMemory = totalMemory - freeMemory;
        System.out.println(message);
        System.out.println("Total Memory: " + totalMemory + " | Free Memory: " +
                freeMemory + " | Used Memory: " + usedMemory);
    }
    public static void main(String[] args) {
        displayMemoryStatus("Initial Memory Status:");
        MemoryUsage obj1 = new MemoryUsage(10, 20.5);
        MemoryUsage obj2 = new MemoryUsage(30, 40.8);
        obj1.setintVal(15); obj1.setdblVal(25.5);
        obj2.setintVal(35); obj2.setdblVal(45.5);
        System.out.print("\nObject 1: ");
        obj1.displayValues();
        System.out.print("Object 2: ");
        obj2.displayValues();
        displayMemoryStatus("\nMemory Status After Object Creation:");
        obj1 = null; obj2 = null;
        System.gc();
        displayMemoryStatus("\nMemory Status After Garbage Collection:");
    }
}
