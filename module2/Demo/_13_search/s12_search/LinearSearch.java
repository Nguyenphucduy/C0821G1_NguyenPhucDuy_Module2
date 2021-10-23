package s12_search;

public class LinearSearch {

    public static int search(int[] array, int key){
        for(int index = 0; index< array.length; index++){
            if(array[index] == key){
                return index;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] myArr = {8,7,9,11,12,15,1};
//        int key = 1;
        int key = 48;
        System.out.println(search(myArr, key));
    }
}
