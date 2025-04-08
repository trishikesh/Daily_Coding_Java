import java.util.Scanner;
public class Loops {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //Sum of n natural numbers
        int sum = 0;
        for(int i=1;i<=n;i++){
            sum+=i;
        }
        System.out.print("Result: " + sum);

        // print the table of n
        int val = 1;
        System.out.println("The table of "+ n + " is: ");
        for(int i=1;i<=10;i++){
            val = n*i;
            System.out.println(val);
        }

    }
}
