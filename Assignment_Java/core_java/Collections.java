//package com.corejava.collections;

import java.util.*;

// Custom object used in collections
class Student {

    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Overriding equals for Set and Map key comparison
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student s = (Student) o;
        return id == s.id && name.equals(s.name);
    }

    // Overriding hashCode for hash-based collections
    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return id + " - " + name;
    }
}

public class Collections {

    public static void main(String[] args) {

        // LIST with primitive wrapper (allows duplicates, maintains order)
        List<Integer> numberList = new ArrayList<>();
        numberList.add(10);
        numberList.add(20);
        numberList.add(10);
        System.out.println("List of Integers: " + numberList);

        // SET with primitive wrapper (no duplicates, no guaranteed order)
        Set<Integer> numberSet = new HashSet<>();
        numberSet.add(10);
        numberSet.add(20);
        numberSet.add(10);
        System.out.println("Set of Integers: " + numberSet);

        // LIST of custom objects
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(1, "Alpha"));
        studentList.add(new Student(2, "Beta"));
        studentList.add(new Student(1, "Alpha"));
        System.out.println("List of Students: " + studentList);

        // SET of custom objects (duplicates removed using equals & hashCode)
        Set<Student> studentSet = new HashSet<>();
        studentSet.add(new Student(1, "Alpha"));
        studentSet.add(new Student(2, "Beta"));
        studentSet.add(new Student(1, "Alpha"));
        System.out.println("Set of Students: " + studentSet);

        // MAP with primitive keys and values
        Map<Integer, String> simpleMap = new HashMap<>();
        simpleMap.put(1, "Java");
        simpleMap.put(2, "Python");
        System.out.println("Map of primitives: " + simpleMap);

        // MAP with custom object as key and value
        Map<Student, Student> studentMap = new HashMap<>();
        Student s1 = new Student(1, "Alpha");
        Student s2 = new Student(2, "Beta");

        studentMap.put(s1, s2);
        studentMap.put(new Student(1, "Alpha"), new Student(3, "Gamma"));

        System.out.println("Map<Student, Student>:");
        for (Map.Entry<Student, Student> entry : studentMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
