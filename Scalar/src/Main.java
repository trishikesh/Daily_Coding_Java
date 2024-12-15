import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        String myfile = "D:\\NewData\\Study\\Git Code\\Daily_Coding_Java\\Scalar\\src\\test.txt";
        int s = 0 ;
        try (Scanner sc = new Scanner(new File(myfile))) {
            while (sc.hasNext()) {
                int word = Integer.parseInt(sc.next());
                s +=word ;
            }
            System.out.println(s);
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + myfile);
        }
    }
}
