class VariablesDemo {

    int instanceVar = 10;            // Instance variable
    static int staticVar = 20;        // Static variable

    void show() {
        int localVar = 30;            // Local variable
        System.out.println(localVar);
    }
}

class ModifiersDemo {

    public int publicVar = 10;
    private int privateVar = 20;
    protected int protectedVar = 30;
    int defaultVar = 40;  // Default modifier  available to any other class in the same package
}

//final class cannot be subclassed. No other class can extend a final class.
final class FinalClass {

    final int VALUE = 100; // Constant

    final void show() {
        System.out.println("Final method");
    }
}

class Employee {

    int id;
    String name;

    // Constructor
    Employee(int i, String n) {
        id = i;
        name = n;
    }

    void display() {
        System.out.println(id + " " + name);
    }
}



public class BasicDatatypes {
    public static void main(String[] args) {

        // Primitive data types
        int age = 25;
        double salary = 50000.50;
        char grade = 'A';
        boolean isActive = true;

        // Non-primitive
        String name = "Java";

        System.out.println(age);
        System.out.println(salary);
        System.out.println(grade);
        System.out.println(isActive);
        System.out.println(name);
    }
}

