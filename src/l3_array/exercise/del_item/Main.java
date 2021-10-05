package l3_array.exercise.del_item;

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
        System.out.println("Enter the element to be deleted");
        int x = scanner.nextInt();
        int delIndex;
        for (int i  = 0; i < number.length; i++) {
            if (number[i] != x) {
                number[i] = number[i + 1];
                delIndex = i;
                System.out.println("deleted element is" + x + " with index is : " + delIndex);
            }
        }
//        for (int i = delIndex+1;i<number.length;i++){
//            number[i]=number[i+1];
//        }
    }
}
