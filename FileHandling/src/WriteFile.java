import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile{
    public static void main(String[] args) {
        try {

            FileWriter fw = new FileWriter("eg.txt", true);
            fw.write("Hello World");
            fw.close();
            System.out.println("File written successfully");

        } catch (IOException e) {
            System.out.println("An IO Exception occurred: ");
        }
    }
}

