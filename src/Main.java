import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Customer c;

        System.out.print("Enter account number: ");
        int account = sc.nextInt();
        System.out.print("Enter account holder: ");
        sc.nextLine();
        String customer = sc.nextLine();
        System.out.print("Is there an initial deposit (y/n)? ");
        char option = sc.next().charAt(0);
        if (option == 'y') {
            System.out.print("Enter initial deposit value: ");
            double initialBalance = sc.nextDouble();
            c = new Customer(account, customer, initialBalance);
        } else {
            c = new Customer(account, customer);
        }

        System.out.println();
        System.out.println("Account data: ");
        System.out.println(c);
        System.out.print("Enter a deposit value: ");
        double valueDeposit = sc.nextDouble();
        System.out.println("Updated account data: ");
        c.deposit(valueDeposit);
        System.out.print(c);
        System.out.println();
        System.out.print("Enter a withdraw value: ");
        double valueWithdraw = sc.nextDouble();
        System.out.println("Updated account data: ");
        c.withdraw(valueWithdraw);
        System.out.print(c);
        sc.close();
    }
}