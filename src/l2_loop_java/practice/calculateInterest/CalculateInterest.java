package l2_loop_java.practice.calculateInterest;

import java.util.Scanner;

public class CalculateInterest {
    public static void main(String[] args) {
        double money;
        int month;
        double rate;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter investment amount: ");
        money = input.nextDouble();
        System.out.println("Enter number of months: ");
        month = input.nextInt();
        System.out.println("Enter annual interest rate in percentage: ");
        rate = input.nextDouble();
        double total = 0;
        for(int i = 0; i < month; i++){
            total += money * (rate/100)/12 * month;
        }
        System.out.println("Total of interest: " + total);
    }
}
