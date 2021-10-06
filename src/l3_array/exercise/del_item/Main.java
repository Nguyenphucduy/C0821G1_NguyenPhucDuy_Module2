package l3_array.exercise.del_item;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length array");
        int length = scanner.nextInt();
        int[] numberArr1 = new int[length];
        for (int i = 0; i < numberArr1.length; i++) {
            System.out.print("Enter the item the " + (i + 1));
            numberArr1[i] = scanner.nextInt();
            System.out.println(numberArr1[i]);
        }
        System.out.println("Enter the element to be deleted");
        int x = scanner.nextInt();
        int delIndex;
        int length2 = length + 1;
        int[] numberArr2 = new int[length2];

        for (int i = 0; i < numberArr1.length; i++) {
            numberArr2[i] = numberArr1[i];
            if (numberArr1[i] == x) {
                numberArr2[i] = numberArr1[i + 1];
                delIndex = i;
                System.out.println("deleted element is : " + x + " with index is : " + delIndex);
                break;
            }
            System.out.println("item is : " + numberArr2[i] + " with index is: " + i);
        }
        for (int j = numberArr1.length - 1; j >= 0; j--) {
            numberArr2[j] = numberArr1[j];
            if (numberArr1[j] == x) {
                break;
            }
            System.out.println("item is: " + numberArr2[j] + " with index is : " + j);
        }

    }
}
