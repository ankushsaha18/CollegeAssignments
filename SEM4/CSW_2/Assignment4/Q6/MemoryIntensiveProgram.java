package Assignment4.Q6;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MemoryIntensiveProgram {
    public static void main(String[] args) {
        List<Object> objectList = new ArrayList<>();
        printMemoryDetails("Initial");
        try {
            for (int i = 0; i < 1000; i++) {
                objectList.add(new byte[1024]);
                if (i % 500 == 0) {
                    printMemoryDetails("After creating " + i + " objects");
                }
            }
        } catch (OutOfMemoryError e) {
            System.out.println("Out of memory! The program generated too many objects.");
        }
        objectList.clear(); System.gc();
        printMemoryDetails("Final");
    }
    private static void printMemoryDetails(String phase) {
        long totalMemory = Runtime.getRuntime().totalMemory();
        long freeMemory = Runtime.getRuntime().freeMemory();
        long usedMemory = totalMemory - freeMemory;
        System.out.println("[" + new Date() + "] " + phase);
        System.out.println("Total Memory: " + totalMemory / 1024 + " KB");
        System.out.println("Free Memory: " + freeMemory / 1024 + " KB");
        System.out.println("Used Memory: " + usedMemory / 1024 + " KB");
    }
}
