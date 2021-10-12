package s02_array_method;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//        int[] arr1 = {1, 2, 3, 4, 5, 6, 8, 9, 0};

        System.out.println("Array before: " + Arrays.toString(arr));
        System.out.print("Please input number remove: "); //7
        int x = new Scanner(System.in).nextInt();

        int index_del = -1; //vi tri index can xoa
        /*Tim x trong mang*/
        for (int index = 0; index < arr.length; index++) {
            if (x == arr[index]) {
                index_del = index;
                break;
            }
        }

        if (index_del != -1) { //da tim thay x
            //chuc nang xoa phan tu tai index pos ra khoi mang
            for(int index = index_del; index < arr.length - 1; index++){ //index = 7
                arr[index] = arr[index + 1];
            }
            arr[arr.length - 1] = 0;
        } else {
            System.err.println("Not found x = " + x);
        }

        System.out.println("Array after: " + Arrays.toString(arr));
    }
}
