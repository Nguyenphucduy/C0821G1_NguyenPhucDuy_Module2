package l3_array.exercise.concat_item;

import java.util.Arrays;
import java.util.Scanner;

public class ConcatElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length array 1");
        int size1 = scanner.nextInt();
        int[] numberArr1 = new int[size1];
        for (int i = 0; i < numberArr1.length; i++) {
            System.out.print("Enter the item the " + (i + 1));
            numberArr1[i] = scanner.nextInt();
            System.out.println("item array 2 is " + numberArr1[i] + " with index is : " + i);
        }
        System.out.println("Enter the length array 2");
        int size2 = scanner.nextInt();
        int[] numberArr2 = new int[size2];
        for (int i = 0; i < numberArr2.length; i++) {
            System.out.print("Enter the item the " + (i + 1));
            numberArr2[i] = scanner.nextInt();
            System.out.println("item array 2 is " + numberArr2[i] + " with index is : " + i);
        }
        int size3 = size1 + size2;
        int[] numberArr3 = new int[size3];
        int k = 0;
        for (int i : numberArr1 ){
            numberArr3[k] = i;
            k++;
        }
        for (int i : numberArr2) {
            numberArr3[k] = i;
            k++;
        }
        System.out.println("the array 1 + array 2 is : " + Arrays.toString(numberArr3));
    }
}
