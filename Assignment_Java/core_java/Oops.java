// Package: Used to group related classes
package com.corejava.oops;

// INTERFACE
// Interface provides 100% abstraction (before Java 8)
// It defines what a class must do, not how
interface Vehicle {
    void run(); // abstract method
}


// ABSTRACTION
// Abstract class cannot be instantiated
// It can have abstract and concrete methods
abstract class Animal {
    abstract void sound(); // abstract method
}

// INHERITANCE
// Dog inherits Animal class
class Dog extends Animal {

    // METHOD OVERRIDING
    // Child class provides its own implementation
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

// IMPLEMENTING INTERFACE
class Car implements Vehicle {

    @Override
    public void run() {
        System.out.println("Car is running");
    }
}

// ENCAPSULATION
// Data hiding using private variables and public methods
class Employee {

    private int salary; // private data member

    // Setter method
    public void setSalary(int salary) {
        this.salary = salary;
    }

    // Getter method
    public int getSalary() {
        return salary;
    }
}

// MAIN CLASS
public class Oops {
    public static void main(String[] args) {

        // POLYMORPHISM
        // Parent reference, child object
        Animal a = new Dog();
        a.sound(); // calls Dog's sound() method

        // Interface reference
        Vehicle v = new Car();
        v.run();

        // ENCAPSULATION USAGE
        Employee emp = new Employee();
        emp.setSalary(50000); // setting value via setter
        System.out.println("Employee Salary: " + emp.getSalary());
    }
}
