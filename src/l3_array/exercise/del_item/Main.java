package l3_array.exercise.del_item;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new  Scanner(System.in);
        System.out.println("Enter the length array");
        int n = scanner.nextInt();
        int[] number = new int[n];
        for (int i = 0;i<number.length;i++){
            System.out.print("Enter the item the " + (i+1));
            number[i] = scanner.nextInt();
            System.out.println(number[i]);
        }
        System.out.println("Enter the element to be deleted");
        int x = scanner.nextInt();
        for (int i = 0; i < number.length-1;i++){
            if (number[i]==x){
                number[i]= number[i+1];
            }
            System.out.println(number[i]);
        }
    }
}
