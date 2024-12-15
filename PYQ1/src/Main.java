//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee(123,"John" ,4500 );
        employee.getDetails();
        System.out.println();
        Manager manager = new Manager(143, "Handa", 5678 , 234);
        manager.getDetails();


    }
}