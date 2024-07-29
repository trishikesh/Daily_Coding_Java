import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Q. LINEAR SEARCH --- Find the key, if not print -1.
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int[] arr =new int[n];
       for (int i=0;i<arr.length;i++){
           arr[i] = sc.nextInt();
       }
       int key = 45;
       int ans = -1;

        for (int i=0;i<arr.length;i++){
            if (arr[i]==key){
                ans = i;
                break;
            }
        }
        System.out.println(ans);


        }
}