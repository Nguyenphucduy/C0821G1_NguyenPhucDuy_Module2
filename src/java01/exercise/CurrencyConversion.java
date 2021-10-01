package java01.exercise;

import java.util.Scanner;

public class CurrencyConversion {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the money USD");
        usd = input.nextDouble();
        double exchange = usd * vnd;
        System.out.println("The Money of your is " + exchange + "VND");
    }
}
