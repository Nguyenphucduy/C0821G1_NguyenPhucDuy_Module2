package l13_sorting_algorithms.exercise.setting_insertion_sort.controller;

public class InsertionSort {
    public void insertionSort(int arr[]) {
        int i;
        for (i = 0; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public void display(int arr[]) {
        int i;
        System.out.print("[");

        for (i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.print("]\n");
    }

    public static void main(String[] args) {
        int arr[] = {6, 7, 0, 2, 8, 1, 3, 9, 4, 5};

        InsertionSort insertionSort = new InsertionSort();
        System.out.println("After: ");
        insertionSort.display(arr);
        System.out.println("-----------------------------");
        insertionSort.insertionSort(arr);
        System.out.println("-----------------------------");
        System.out.println("Before: ");
        insertionSort.display(arr);
    }
}
