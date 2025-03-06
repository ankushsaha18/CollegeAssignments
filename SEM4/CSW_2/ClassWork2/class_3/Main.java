package com.collections_generics;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Student> ts = new TreeSet<Student>(new MyComparator());
        ts.add(new Student("Ankush",51));
        ts.add(new Student("AAb",15));
        System.out.println(ts);
    }
}
