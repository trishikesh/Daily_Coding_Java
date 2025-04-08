import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        var a = sc.nextInt();
        System.out.println("Enter the second number: ");
        var b = sc.nextInt();
        System.out.println("Press 1 for: Addition" +
                "  Press 2 for: Subtraction" +
                "  Press 3 for: Multiplication" +
                "  Press 4 for: Division ");
        System.out.println("Enter the operator: ");
        int operators = sc.nextInt();
        switch(operators) {
            case 1:
                System.out.println("Result: " + (a + b));
                break;
            case 2:
                System.out.println(a - b);
                break;
            case 3:
                System.out.println(a * b);
                break;
            case 4:
                System.out.println(a / b);
                break;
            default:
                System.out.println("Invalid operator");
        }
    }
}
