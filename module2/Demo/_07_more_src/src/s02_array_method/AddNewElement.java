package s02_array_method;

import java.util.Arrays;
import java.util.Scanner;

public class AddNewElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 0};
        System.out.println(Arrays.toString(arr));
//        int[] arr = {1, 2, 3, 4, 4};
        System.out.print("Enter value of X: ");
        int valueX = scanner.nextInt();
        System.out.print("Enter index of X: ");
        int indexX = scanner.nextInt();

        /*Kiem tra gia tri indexX nhap vao co hop le*/
        if(indexX <= -1 || indexX >= arr.length - 1){
            System.err.println("Index input err. indexX = " + indexX);
        } else {
            //chen phan tu X tai indexX
            for(int index = arr.length - 1; index > indexX; index--){
                arr[index] = arr[index - 1];
            }
            arr[indexX] = valueX;

            System.out.println(Arrays.toString(arr));
        }
    }
}
