package review.review_week1_week2.manage_bank.superclass;

import java.util.Scanner;

public class Account {
    public static final double INTEREST = 0.035;
    private long accountNumber;
    private String accountName;
    private double accountMoney;
    Scanner scanner = new Scanner(System.in);

    public Account() {
    }

    public Account(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Account(long accountNumber, String accountName) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.accountMoney = 50;
    }

    public Account(long accountNumber, String accountName, double accountMoney) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.accountMoney = accountMoney;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public double getAccountMoney() {
        return accountMoney;
    }

    public void setAccountMoney(double accountMoney) {
        this.accountMoney = accountMoney;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber=" + accountNumber +
                ", accountName='" + accountName + '\'' +
                ", accountMoney=" + accountMoney + "VND" +
                '}';
    }

    public double addMoneyAccount() {
        double add;
//        do {
        System.out.print("Enter the amount you want to deposit:  ");
        add = scanner.nextDouble();

        if (add >= 0) {
            this.accountMoney += add;
            System.out.println("You have successfully deposited money into your account");
        } else {
            System.out.println("Invalid deposit amount!");
        }
//        }while (add>=0);
        return this.accountMoney;
    }

    public double withdrawMoneyAccount() {
        double withdraw;
        double withdrawalfee = 5;
        do {
            System.out.print("Enter the amount you want to deposit:  ");
            withdraw = scanner.nextDouble();

            if (withdraw <= (this.accountMoney - withdrawalfee)) {
                this.accountMoney -= withdraw + withdrawalfee;
                System.out.println("you have successfully withdrawn");
            } else {
                System.out.println("Invalid deposit amount!");
            }
        } while (withdraw >= (this.accountMoney - withdrawalfee));
        return this.accountMoney;
    }

    public double expire() {
        return this.accountMoney * this.accountMoney * INTEREST;
    }

    public double transfers() {
        double transferMoney;
        System.out.print("Enter the transfer money : ");
        transferMoney = scanner.nextDouble();
        if (transferMoney >= this.accountMoney) {
            System.out.print("Enter the account number : ");
            Long accountNumber = scanner.nextLong();
            Account account1 = new Account(accountNumber);
            System.out.print("Enter the account number need transfers : ");
            Long accountNumber2 = scanner.nextLong();
            Account account2 = new Account(accountNumber);
            account1.accountMoney = this.accountMoney - transferMoney;
            account2.accountMoney = this.accountMoney + transferMoney;
            System.out.println("Account money of   " + accountNumber + " is : " + account1.accountMoney);
            System.out.println("Account money of  " + accountNumber2 + " is : " + account2.accountMoney);
        } else {
            System.out.println("Invalid deposit amount!");
        }
        return this.accountMoney;
    }
}
