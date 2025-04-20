package ClassWork5;

import java.io.File;
import java.io.IOException;

public class DirectoryOperation {
    public static void main(String[] args) throws IOException {
        File f = new File("demo");
        System.out.println(f.exists());
        System.out.println(f.mkdir());
        File f1 = new File("demo","abc.txt");
        System.out.println(f1.exists());
        System.out.println(f1.createNewFile());
        System.out.println(f.isDirectory());
        System.out.println(f.isFile());
    }
}
