package l3_array.exercise.del_item;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length array");
        int length = scanner.nextInt();
        int[] numberArr1 = new int[length];
        for (int i = 0; i < numberArr1.length; i++) {
            System.out.print("Enter the item the " + (i + 1) + ": ");
            numberArr1[i] = scanner.nextInt();
        }
        System.out.println("Enter the element to be deleted");
        int x = scanner.nextInt();
        int delIndex = 0;

        for (int i = 0; i < numberArr1.length - 1; i++) {
            if (numberArr1[i] == x) {
                numberArr1[i] = numberArr1[i + 1];
                delIndex = i;
                System.out.println(x+" is your want delete"+" with index is :" + delIndex);
            }
        }
        for (int j = delIndex; j < numberArr1.length - 1; j++) {
            numberArr1[j] = numberArr1[j + 1];
        }
        numberArr1[numberArr1.length - 1] = 0;
        System.out.println(Arrays.toString(numberArr1));
//        int index_del = -1;
//        for (int index = 0; index < numberArr1.length; index++) {
//            if (x == numberArr1[index]) {
//                index_del = index;
//                break;
//            }
//        }
//​
//        if (index_del != -1) { //da tim thay x
//            //chuc nang xoa phan tu tai index pos ra khoi mang
//            for(int index = index_del; index < numberArr1.length - 1; index++){ //index = 7
//                numberArr1[index] = numberArr1[index + 1];
//            }
//            numberArr1[numberArr1.length - 1] = 0;
//        } else {
//            System.err.println("Not found x = " + x);
//        }
//​
//        System.out.print(Arrays.toString(numberArr1));

    }

}
