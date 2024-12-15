import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class UserWrite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text (if type 'over' then stop): ");

        try(FileWriter fwu = new FileWriter("eg.txt")){
            String text ;
            while(!(text = sc.nextLine()).equalsIgnoreCase("over")){
                fwu.write(text + "\n");
            }
            System.out.println("Done");
        } catch (IOException e) {
            System.out.println("Error");
        }
    }
}
