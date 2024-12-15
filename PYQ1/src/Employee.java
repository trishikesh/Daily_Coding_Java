public class Employee {
    int id;
    String name;
    int salary;

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }


    void getDetails() {
        System.out.println("id: " + id);
        System.out.println("name: " + name);
        System.out.println("salary: " + salary);
    }
}
