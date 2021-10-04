package l3_array.exercise.concat_item;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new  Scanner(System.in);
        System.out.println("Enter the length array 1");
        int size1 = scanner.nextInt();
        int[] number1 = new int[size1];
        for (int i = 0;i<number1.length;i++){
            System.out.print("Enter the item the " + (i+1));
            number1[i] = scanner.nextInt();
            System.out.println("item array 2 is " + number1[i] +" with index is : " + i);
        }
        System.out.println("Enter the length array 2");
        int size2 = scanner.nextInt();
        int[] number2 = new int[size2];
        for (int i = 0;i<number2.length;i++){
            System.out.print("Enter the item the " + (i+1));
            number2[i] = scanner.nextInt();
            System.out.println("item array 2 is " + number2[i] +" with index is : " + i);
        }
        int size3 = size1 + size2;
        int[] number3 = new int[size3];
        int k = 0 ;
        for (int i : number1){
            number3[k] = i;
            k++;
        }
        for (int i : number2){
            number3[k] = i;
            k++;
        }
        System.out.println("the array 1 + array 2 is : " + Arrays.toString(number3));
    }
}
