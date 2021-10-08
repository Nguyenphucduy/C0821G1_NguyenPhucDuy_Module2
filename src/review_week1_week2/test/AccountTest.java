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
            System.out.println("3. Exit");
            System.out.print("Enter your choose: ");
            choose = scanner.nextInt();
            switch (choose){
                case 1:
                    System.out.print("Enter the account number : ");
                    Long accountNumber = scanner.nextLong();
                    System.out.print("Enter the account name: ");
                    String accountName = scanner.nextLine();
                    System.out.print("Enter the accountMoney : ");
                    double accountMoney = scanner.nextDouble();
                    Account account = new Account(accountNumber,accountName,accountMoney);
                    System.out.println(account);
                    break;
                case 2:
                    System.out.print("Enter the account number : ");
                    Long accountNumber1 = scanner.nextLong();
                    System.out.print("Enter the account name: ");
                    String accountName1 = scanner.nextLine();
                    System.out.print("Enter the accountMoney : ");
                    double accountMoney1 = scanner.nextDouble();
                    Account account1 = new Account(accountNumber1,accountName1,accountMoney1);
                    System.out.println(account1.addMoneyAccount());
                    break;
                case 3:
                    System.exit(3);
                default:
                    System.out.println("No choose!");

            }
        }while (choose != 3) ;
    }
}
