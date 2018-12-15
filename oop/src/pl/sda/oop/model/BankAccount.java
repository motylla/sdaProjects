package pl.sda.oop.model;

public class BankAccount {

    private int id;
    private int accountNumber;
    private double balance;
    private String bankName;


    public BankAccount(int id, int accountNumber, double balance, String bankName) {
        this.id = id;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.bankName = bankName;
    }


    public String getBankName() {
        return bankName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public int getId() {
        return id;

    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


}
