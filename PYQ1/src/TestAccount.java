public class TestAccount {
    public static void main(String[] args) {
        Account ac1 = new Account(45512);
        ac1.deposit(350);
        System.out.println(ac1.getBalance());
        System.out.println();
        ac1.withdraw(3500);
        System.out.println(ac1.getBalance());
    }
}
