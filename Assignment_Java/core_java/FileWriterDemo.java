import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
    public static void main(String[] args) {

        try {
            // FileWriter creates or overwrites the file
            FileWriter fw = new FileWriter("example.txt");

            fw.write("Hello Java File Handling\n");
            fw.write("This is file write example");

            // Close the file
            fw.close();

            System.out.println("Data written successfully");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
