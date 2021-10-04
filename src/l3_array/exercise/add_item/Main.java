package l3_array.exercise.add_item;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length array");
        int n = scanner.nextInt();
        int[] number = new int[n];
        for (int i = 0; i < number.length; i++) {
            System.out.print("Enter the item the " + (i + 1));
            number[i] = scanner.nextInt();
            System.out.println(number[i]);
        }
        System.out.println("Enter the element to be add");
        int x = scanner.nextInt();
        System.out.println("Enter the index to be add");
        int indexX = scanner.nextInt();
        int size2 = n + 1;
        int[] number2 = new int[size2];
        for (int i = 0; i <= number.length; i++) {
            number2[i] = number[i];
            if (i == indexX) {
                number2[i] = x;
                break;
            }
        }
        for (int j = indexX + 1; j <= number.length; j++) {
            number2[j] = number[j - 1];
        }
        System.out.print(Arrays.toString(number2));

    }
}
