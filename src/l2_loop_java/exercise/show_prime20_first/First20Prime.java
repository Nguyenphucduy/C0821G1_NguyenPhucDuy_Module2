package l2_loop_java.exercise.show_prime20_first;

import java.util.Scanner;

public class First20Prime {
    public static void main(String[] args) {
        int number;
        int count = 0;
        int prime = 2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number");
        number = scanner.nextInt();
        while (count < number) {
            if (isPrimeNumber(prime)) {
                System.out.println(prime);
                count++;
            }
            prime++;
        }
    }
    public static boolean isPrimeNumber(int number) {
        if (number < 2) {
            return false;
        }
        for (int n = 2; n <= Math.sqrt(number); n++) {
            if (number % n == 0) {
                return false;
            }
        }
        return true;
    }
}
