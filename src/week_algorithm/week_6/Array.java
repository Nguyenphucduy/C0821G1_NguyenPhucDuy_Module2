package week_algorithm.week_6;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] ints = {1,2,3};
        int sum = 0;
        for(int i =0 ; i < ints.length; i++){
            sum += ints[i];
            ints[i] = sum;
        }
        System.out.println(Arrays.toString(ints));
    }
}
