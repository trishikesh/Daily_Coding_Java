import java.util.*;

public class TwoDArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter columns: ");
        int cols = sc.nextInt();
        int[][] arr1 = new int[rows][cols];

        // creating user input matrix
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                arr1[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }
        //finding a key
        System.out.print("Enter number to find: ");
        int key = sc.nextInt();
        for(int i=0;i<rows;i++) {
            for (int j = 0; j < cols; j++) {
                if (arr1[i][j] == key){
                    System.out.print("row: " + i +"and column: " + j);
                }
            }
            System.out.println();
        }

    }
}
