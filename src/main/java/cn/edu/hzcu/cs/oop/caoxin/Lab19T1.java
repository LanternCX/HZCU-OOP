package cn.edu.hzcu.cs.oop.caoxin;

import java.util.ArrayList;
import java.util.Date;

class Transaction {
    private char type;          // 'W' or 'D'
    private double amount;
    private double balance;
    private String description;
    private Date date;

    public Transaction(char type, double amount, double balance, String description) {
        this.type = type;
        this.amount = amount;
        this.balance = balance;
        this.description = description;
        this.date = new Date();
    }

    public char getType() {
        return type;
    }

    public double getAmount() {
        return amount;
    }

    public double getBalance() {
        return balance;
    }

    public String getDescription() {
        return description;
    }

    public Date getDate() {
        return date;
    }
}

class Account {
    private String name;
    private int id;
    private double balance;
    private static double annualInterestRate;
    private Date dateCreated;
    private ArrayList<Transaction> transactions = new ArrayList<>();

    public Account() {
        dateCreated = new Date();
    }

    public Account(String name, int id, double balance) {
        this.name = name;
        this.id = id;
        this.balance = balance;
        this.dateCreated = new Date();
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public static double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static void setAnnualInterestRate(double annualInterestRate) {
        Account.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public double getMonthlyInterest() {
        return balance * (annualInterestRate / 1200);
    }

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    public void withdraw(double amount) {
        balance -= amount;
        transactions.add(new Transaction('W', amount, balance, "withdraw"));
    }

    public void deposit(double amount) {
        balance += amount;
        transactions.add(new Transaction('D', amount, balance, "deposit"));
    }
}

public class Lab19T1 {
    public static void main(String[] args) {
        Account account = new Account("George", 1122, 1000);
        Account.setAnnualInterestRate(1.5);

        // 存款
        account.deposit(30);
        account.deposit(40);
        account.deposit(50);

        // 取款
        account.withdraw(5);
        account.withdraw(4);
        account.withdraw(2);

        // 打印账户信息
        System.out.println("Account Holder: " + account.getName());
        System.out.println("Annual Interest Rate: " + Account.getAnnualInterestRate() + "%");
        System.out.println("Balance: " + account.getBalance());
        System.out.println("\nTransactions:");

        for (Transaction t : account.getTransactions()) {
            System.out.println(
                    t.getDate() + "  " +
                            t.getType() + "  " +
                            t.getAmount() + "  Balance=" + t.getBalance() +
                            "  " + t.getDescription()
            );
        }
    }
}
