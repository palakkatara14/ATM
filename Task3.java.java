import java.util.*;

class ATM {
    private double balance;

    public ATM(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. Remaining balance: " + balance);
        } else {
            System.out.println("Withdrawal failed. Insufficient funds or invalid amount.");
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. New balance: " + balance);
        } else {
            System.out.println("Deposit failed. Invalid amount.");
        }
    }

    public double checkBalance() {
        return balance;
    }



    public static void main(String[] args) {
        ATM atm = new ATM(1000); 

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Check Balance");
            System.out.print("Enter your choice (1/2/3): ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = sc.nextDouble();
                    atm.withdraw(withdrawAmount);
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = sc.nextDouble();
                    atm.deposit(depositAmount);
                    break;
                case 3:
                    System.out.println("Your account balance is: " + atm.checkBalance());
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}