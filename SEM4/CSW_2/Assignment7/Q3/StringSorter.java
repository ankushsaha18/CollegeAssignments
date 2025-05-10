package Assignment7.Q3;

import java.util.Arrays;
import java.util.List;

public class StringSorter {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Java", "Functional Interface", "Lambda", "Comparator");
        strings.sort((s1, s2) -> Integer.compare(s2.length(), s1.length()));
        System.out.println("Sorted Strings (by length, descending):");
        strings.forEach(System.out::println);
    }
}
