package s12_search;

import java.util.Arrays;

public class BinarySearch {

    public static int search(int[] array, int key){
        int head = 0;
        int tail = array.length - 1;
        int mid = 0;

        while (head <= tail){
            mid = (head + tail) / 2;
            if(key == array[mid]){ //b1
                return mid;
            } else if( key > array[mid]){
                head = mid + 1;
            } else {
                tail = mid - 1;
            }
        }


        return -1;
    }
    public static void main(String[] args) {
        int[] myArr = {1,2,3,4,5,6,7,8};
        int key = 8;

        System.out.println(search(myArr, key));
        System.out.println(Arrays.binarySearch(myArr, key));
    }
}
