// Class definition
class Student {

    // State (Instance variables)
    int id;
    String name;

    // Behavior (Methods)
    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }
}

public class BasicsOfJava {
    public static void main(String[] args) {

        // Object creation
        Student s1 = new Student();

        // Assigning values to object state
        s1.id = 101;
        s1.name = "Alpha";

        // Calling behavior
        s1.display();
    }
}
