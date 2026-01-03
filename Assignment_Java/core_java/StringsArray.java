class StringDemo {
        String s1 = "Java";
        String s2 = new String("Programming");

        void displayStrings() {
        System.out.println(s1.length());              // Length of the string
        System.out.println(s2.toUpperCase());          // Convert to uppercase
        System.out.println(s1.concat(" Language"));    // Concatenate strings
    }
}

class ArrayDemo {
        int[] numbers = {10, 20, 30, 40};

        void displayArray(){
            for (int i = 0; i < numbers.length; i++) {
                System.out.println(numbers[i]);
            }
        }
}

public class StringsArray {
    public static void main(String[] args) {
        StringDemo stringDemo = new StringDemo();
        ArrayDemo arrayDemo = new ArrayDemo();
        arrayDemo.displayArray();
    }
}
