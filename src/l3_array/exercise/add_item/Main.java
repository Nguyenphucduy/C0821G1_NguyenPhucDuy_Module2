package l3_array.exercise.add_item;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length array");
        int n = scanner.nextInt();
        int[] numberArray = new int[n];
        for (int i = 0; i < numberArray.length; i++) {
            System.out.print("Enter the item the " + (i + 1));
            numberArray[i] = scanner.nextInt();
            System.out.println(numberArray[i]);
        }
        System.out.println("Enter the element to be add");
        int x = scanner.nextInt();
        System.out.println("Enter the index to be add");
        int indexX = scanner.nextInt();
        int size2 = n + 1;
        int[] numberArray2 = new int[size2];
        for (int i = 0; i <= numberArray.length; i++) {
            numberArray2[i] = numberArray[i];
            if (i == indexX) {
                numberArray2[i] = x;
                break;
            }
        }
        for (int j = indexX + 1; j <= numberArray.length; j++) {
            numberArray2[j] = numberArray[j - 1];
        }
        System.out.print(Arrays.toString(numberArray2));
    }
}
