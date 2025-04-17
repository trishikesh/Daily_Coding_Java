import java.util.*;

public class ArraysLec {
    public static void main(String[] args) {
        //take array as input. search for a given number and print its index in array
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int[] arr1 = new int[size];
        System.out.println("Enter elements: ");
        for (int i = 0; i < size; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter element to look for: ");
        int key = sc.nextInt();
        for (int i = 0; i < size; i++) {
            if (arr1[i] == key) {
                System.out.print("The index is: " + i);
            } else {
                continue;
            }
        }

    }
}
