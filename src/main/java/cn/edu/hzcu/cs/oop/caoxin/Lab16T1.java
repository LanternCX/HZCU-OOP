package cn.edu.hzcu.cs.oop.caoxin;

class SavingsAccount extends Account {
    public SavingsAccount(int id, double balance) {
        super(id, balance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount > getBalance()) {
            System.out.println("SavingsAccount: Insufficient balance. Withdrawal denied.");
        } else {
            super.withdraw(amount);
        }
    }

    @Override
    public String toString() {
        return "SavingsAccount ID: " + getId() + ", Balance: " + getBalance();
    }
}

class CheckingAccount extends Account {
    private double overdraftLimit;

    public CheckingAccount(int id, double balance, double overdraftLimit) {
        super(id, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() - amount < -overdraftLimit) {
            System.out.println("CheckingAccount: Overdraft limit exceeded. Withdrawal denied.");
        } else {
            super.withdraw(amount);
        }
    }

    @Override
    public String toString() {
        return "CheckingAccount ID: " + getId() + ", Balance: " + getBalance() +
                ", Overdraft Limit: " + overdraftLimit;
    }
}

public class Lab16T1 {
    public static void main(String[] args) {
        Account.setAnnualInterestRate(0.045);

        Account account = new Account(1001, 5000);
        SavingsAccount savings = new SavingsAccount(1002, 3000);
        CheckingAccount checking = new CheckingAccount(1003, 2000, 1000);

        account.withdraw(1000);
        savings.withdraw(3500); // Should be denied
        checking.withdraw(2800); // Allowed due to overdraft

        System.out.println(account);
        System.out.println(savings);
        System.out.println(checking);
    }
}
