package review_week1_week2.test;

import review_week1_week2.superclass.Account;
import review_week1_week2.superclass.Vehicle;

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choose;
        do {
            System.out.println("Menu");
            System.out.println("1. Enter your bank account information ");
            System.out.println("2. Deposit money into your account.");
            System.out.println("3. Withdraw MoneyAccount");
            System.out.println("4. Expire");
            System.out.println("5. Transfers");
            System.out.println("6. Exit");
            System.out.print("Enter your choose: ");
            choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    System.out.print("Enter the account number : ");
                    Long accountNumber = Long.parseLong(scanner.nextLine());
                    System.out.print("Enter the account name: ");
                    String accountName = scanner.nextLine();
                    System.out.print("Enter the accountMoney : ");
                    double accountMoney = scanner.nextDouble();
                    Account account = new Account(accountNumber, accountName, accountMoney);
                    System.out.println(account);
                    break;
                case 2:
                    System.out.print("Enter the account number : ");
                    Long accountNumber1 = scanner.nextLong();
                    System.out.print("Enter the account name: ");
                    String accountName1 = scanner.nextLine();
                    System.out.print("Enter the accountMoney : ");
                    double accountMoney1 = scanner.nextDouble();
                    Account account1 = new Account(accountNumber1, accountName1, accountMoney1);
                    System.out.println(account1);
                    System.out.println("Account Money of you : " + account1.addMoneyAccount());
                    break;
                case 3:
                    System.out.print("Enter the account number : ");
                    Long accountNumber2 = scanner.nextLong();
                    System.out.print("Enter the account name: ");
                    String accountName2 = scanner.nextLine();
                    System.out.print("Enter the accountMoney : ");
                    double accountMoney2 = scanner.nextDouble();
                    Account account2 = new Account(accountNumber2, accountName2, accountMoney2);
                    System.out.println(account2);
                    System.out.println("Account Money of you : " + account2.withdrawMoneyAccount());
                    break;
                case 4:
                    System.out.print("Enter the account number : ");
                    Long accountNumber3 = scanner.nextLong();
                    System.out.print("Enter the account name: ");
                    String accountName3 = scanner.nextLine();
                    System.out.print("Enter the accountMoney : ");
                    double accountMoney3 = scanner.nextDouble();
                    Account account3 = new Account(accountNumber3, accountName3, accountMoney3);
                    System.out.println(account3);
                    System.out.println("Account Money of you : " + account3.expire());
                    break;
                case 5:
                    Account account4 = new Account();
                    System.out.println("Account Money of you : " + account4.transfers());
                    break;
                case 6:
                    System.exit(6);
                default:
                    System.out.println("No choose!");

            }
        } while (choose != 6);
    }
}
