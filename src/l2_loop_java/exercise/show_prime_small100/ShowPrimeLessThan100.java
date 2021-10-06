package l2_loop_java.exercise.show_prime_small100;

public class ShowPrimeLessThan100 {
    public static void main(String[] args) {
        int prime = 2;
        for (;prime < 100;) {
            if (isPrimeNumber(prime)) {
                System.out.print(prime + " ");
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
