package l3_array.exercise.min_in_array;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length array");
        int size = scanner.nextInt();
        int[] numberArr = new int[size];
        for (int i = 0; i < numberArr.length; i++) {
            System.out.print("Enter the item the " + (i + 1));
            numberArr[i] = scanner.nextInt();
            System.out.println("The item array is : " + numberArr[i] + " With index : " + i);
        }
        int min = numberArr[0];
        for (int i = 0; i < numberArr.length;i++){
            if (numberArr[i] < min) {
                min = numberArr[i];
            }
        }
        System.out.print("Min in array is : " + min);
    }
}
