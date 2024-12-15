public class Account {
    private double balance;
    public Account(double balance) {
        this.balance = balance;
    }
    public void deposit(double amount) {
        this.balance += amount;
        System.out.println("Deposit amount : " + amount);
    }
    public void withdraw(double amount) {
        this.balance -= amount;
        System.out.println("Withdraw amount : " + amount);
    }
    public double getBalance() {
        return balance;
    }
    public double getbalance() {
        return balance;
    }
}
