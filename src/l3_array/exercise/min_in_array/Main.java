package l3_array.exercise.min_in_array;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length array");
        int size = scanner.nextInt();
        int[] number = new int[size];
        for (int i = 0; i < number.length; i++) {
            System.out.print("Enter the item the " + (i + 1));
            number[i] = scanner.nextInt();
            System.out.println("The item array is : " + number[i] + " With index : " + i);
        }
        int min = number[0];
        for (int i = 0; i < number.length;i++){
            if (number[i] < min) {
                min = number[i];
            }
        }
        System.out.print("Min in array is : " + min);
    }
}
