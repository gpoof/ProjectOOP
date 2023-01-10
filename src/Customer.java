public class Customer {

    private int account;
    private String customer;
    private double balance;

    public Customer(int account, String customer) {
        this.account = account;
        this.customer = customer;
    }

    public Customer(int account, String customer, double initialBalance) {
        this.account = account;
        this.customer = customer;
        deposit(initialBalance);
    }

    public void deposit(double amount){
        this.balance += amount;
    }

    public void withdraw(double amount){
        this.balance -= amount + 5.00;
    }

    public String toString(){
        return "Account " + account + ", Holder: " + customer + ", Balance: $" + String.format("%.2f%n", balance);
    }
}
