
class BankAccount {
    String name, accNo;
    double balance;
    int deposits = 0, withdrawals = 0;

    BankAccount(String name, String accNo, double balance) {
        this.name = name;
        this.accNo = accNo;
        this.balance = balance;
    }

    void deposit(double amount, String type) {
        balance += amount;
        deposits++;
        System.out.println("Deposit Amount       : Rs. " + String.format("%.2f", amount));
        System.out.println("Transaction Status   : Deposit Successful");
        System.out.println("Updated Balance      : Rs. " + String.format("%.2f", balance));
    }

    void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            withdrawals++;
            System.out.println("Withdrawal Successful");
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    void display(String enteredName) {
        System.out.println(name.toUpperCase() + " " + accNo + " " + String.format("%.2f", balance));
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount b = new BankAccount("Ravi Kumar", "1234567890", 10000.00);
        b.deposit(5000.00, "Cash Deposit");
        b.withdraw(2000.00);
        b.withdraw(20000.00);
        b.display("Ravi Kumar");
    }
}
