//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.UUID;

public class Hdfc implements BankAccount {
    private String password;
    private String holderName;
    private String accountNumber = String.valueOf(UUID.randomUUID());
    private final double roi;
    private int balance;

    Hdfc(String password, int balance, String holderName) {
        this.password = password;
        this.roi = (double)7.5F;
        this.holderName = holderName;
        this.balance = balance;
    }

    public String getHolderName() {
        return this.holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public double getRoi() {
        return this.roi;
    }

    public int checkBalance(String password) {
        return this.password.equals(password) ? this.balance : -1;
    }

    public int deposit(int amount) {
        this.balance += amount;
        return this.balance;
    }

    public void withdraw(int amount, String password) {
        if (!this.password.equals(password)) {
            System.out.println("wrong password");
        } else if (amount > this.balance) {
            System.out.println("Insuffcient Balance");
        } else {
            this.balance -= amount;
            System.out.println("your final balance" + this.balance);
        }
    }

    public void passwordChange(String currPassword, String newPassword) {
        if (!this.password.equals(currPassword)) {
            System.out.println("Password is wrong");
        }

        this.password = newPassword;
        System.out.println("Pass change successfully");
    }

    public double calculateInterest(int years) {
        return (double)this.balance * this.roi * (double)years / (double)100.0F;
    }
}
