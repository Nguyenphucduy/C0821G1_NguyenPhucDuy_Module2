package l13_sorting_algorithms.exercise.show_insertion_sort.controller;

import java.util.Scanner;

public class InsertionSortByStep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter list size:");
        int size = scanner.nextInt();
        int[] list = new int[size];
        System.out.println("Enter " + list.length + " values:");
        for (int i = 0; i < list.length; i++) {
            list[i] = scanner.nextInt();
        }
        System.out.print("Your input list: ");
        display(list);
        System.out.println("\nBegin sort processing...");
        insertionSortByStep(list);
    }

    public static void display(int arr[]) {
        int i;
        System.out.print("[");

        for (i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.print("]\n");
    }

    public static void insertionSortByStep(int arr[]) {
        int i;
        for (i = 0; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                /* Swap list[j] with list[j + 1] */
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        /* Show the list after sort */
        display(arr);
    }

}
