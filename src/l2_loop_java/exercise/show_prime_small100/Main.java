package l2_loop_java.exercise.show_prime_small100;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int count = 0;
        int n = 2;
        for (;n < 100;) {
            if (isPrimeNumber(n)) {
                System.out.println(n);
                count++;
            }
            n++;
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
