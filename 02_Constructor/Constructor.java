public class BankAccount {
    String accountHolder;
    String accountNumber;
    double balance;

    // Constructor
    BankAccount(String holder, String accNum, double initialBalance) {
        accountHolder = holder;
        accountNumber = accNum;
        balance = initialBalance;
    }

    void showDetails() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: ₹" + balance);
    }

    public static void main(String[] args) {
        // Creating object using constructor
        BankAccount myAccount = new BankAccount("Pavan", "ACC123456", 5000.0);
        myAccount.showDetails();
    }
}

