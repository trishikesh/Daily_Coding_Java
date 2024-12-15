public class Test {
    public static void main(String[] args) {
        Employee em1 = new Employee(1, "shela", 35000);
        Employee em2 = new Employee(2, "lela", 5000);
        Manager m1 = new Manager(11 , "Jeni", 46789 , 23);
        Manager m2 = new Manager(24 , "Leni", 86789 , 13);
        em1.getDetails();
        em2.getDetails();
        m1.getDetails();
        m2.getDetails();
    }
}
