package l3_array.practice.min_in_array_with_funcion;

public class MinArray {
    public static int minValue(int[] array){
        return -1;
    }
    public static void main(String[] args) {
        int []arr = {4, 12, 7, 8, 1, 6, 9};
        int index = arr[0];
        for (index = 0; index < arr.length;index++){
            if (arr[index]<index){
                System.out.println("The smallest element in the array is: " + arr[index] + " with index : " + index);
            }
        }
    }
}
