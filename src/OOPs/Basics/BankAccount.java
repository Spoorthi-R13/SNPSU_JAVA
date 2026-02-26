package OOPs.Basics;

public class BankAccount {
    String accountHolder;
    double balance;

    public BankAccount(String accHolder, double balance) {
        accountHolder = accHolder;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Amount Deposited : " + amount);
        System.out.println("Updated Balance is : " + balance);
    }

    void withdraw(double amount) {
        if (amount < balance) {
            balance -= amount;
            System.out.println("Amount Withdrawn: " + amount);
            System.out.println("Updated Balance After withdraw : " + balance);
        }
        else {
            System.out.println("Insufficient Balance");
        }
    }

    void displaybalance() {
        System.out.printf("Account holder : %s ", accountHolder);
        System.out.println("\nCurrent Balance :  "+ balance);
    }
}

    class bank {
        public static void main(String[] args) {
            BankAccount acc = new BankAccount("Spoorthi", 1000);
            acc.displaybalance();
            acc.deposit(500);
            acc.withdraw(1000);

        }
    }
