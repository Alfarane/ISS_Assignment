//package com.corejava.collections;

import java.util.Arrays;
import java.util.Comparator;

// Custom object implementing Comparable
class Student implements Comparable<Student> {

    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Comparable: natural sorting order (by ID)
    @Override
    public int compareTo(Student s) {
        return this.id - s.id;
    }

    @Override
    public String toString() {
        return id + " - " + name;
    }
}

public class SortingDemo
 {

    public static void main(String[] args) {

        // Sorting primitives using Arrays.sort()
        int[] numbers = {40, 10, 30, 20};
        Arrays.sort(numbers);

        System.out.println("Sorted primitives:");
        for (int n : numbers) {
            System.out.print(n + " ");
        }

        System.out.println("\n");

        // Sorting custom objects using Comparable
        Student[] students = {
                new Student(3, "Charlie"),
                new Student(1, "Alpha"),
                new Student(2, "Bravo")
        };

        Arrays.sort(students); // uses compareTo()
        System.out.println("Students sorted by ID:");
        for (Student s : students) {
            System.out.println(s);
        }

        System.out.println();

        // Sorting custom objects using Comparator (by name)
        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.name.compareTo(s2.name);
            }
        });

        System.out.println("Students sorted by Name:");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
