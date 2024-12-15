import java.util.Scanner;
import java.util.Arrays;

public class SortArray {

    // Method to sort the array
    public static void sortArray(int[] arr) {
        // Using Arrays.sort() to sort the array
        Arrays.sort(arr);
    }

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Accept the size of the array
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        // Create an array of size 'n'
        int[] arr = new int[n];

        // Accept array elements from the user
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Call the sortArray method to sort the array
        sortArray(arr);

        // Print the sorted array
        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        // Close the scanner
        scanner.close();
    }
}
