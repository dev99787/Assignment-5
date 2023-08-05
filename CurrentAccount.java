//Practical 14

class CurrentAccount extends BankAccount {
    public CurrentAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    public void deposit(double amount) {
        setBalance(getBalance() + amount);
        System.out.println("Deposit of Rs" + amount + " successful. Current balance: Rs" + getBalance());
    }

    public void withdraw(double amount) {
        if (getBalance() >= amount) {
            setBalance(getBalance() - amount);
            System.out.println("Withdrawal of Rs" + amount + " successful. Current balance: Rs" + getBalance());
        } else {
            System.out.println("Insufficient funds. Withdrawal failed.");
        }
    }
}
