import java.io.File;
import java.io.IOException;

public class NewFileCreate {
    public static void main(String[] args) {
        try {

            File f = new File("eg.txt");
            if (f.createNewFile()) {
                System.out.println("File Created: " + f.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An IO Exception occurred: ");
        }
    }
}
