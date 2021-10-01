package lesson_1.Exercise;

import java.util.Scanner;

public class ReadInteger {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter your Integer");
        int number = read.nextInt();
        String[] arr = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        for (int i = 0; i < arr.length ; i++){
            String result;
            result = arr[number-1];
        }
    }
}
