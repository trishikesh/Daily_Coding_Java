import java.util.Scanner;
import java.io.*;

public class sum {
    public static void main(String[] args) {
                    try (Scanner sc = new Scanner(new File("test.txt"))) {

                        while (sc.hasNext()) {
                            String word = sc.next();
                            System.out.println();    // Print the word
                        }
                    } catch (FileNotFoundException e) {
                        System.out.println("File not found: " + "test.txt");
                    }
                }
    }
