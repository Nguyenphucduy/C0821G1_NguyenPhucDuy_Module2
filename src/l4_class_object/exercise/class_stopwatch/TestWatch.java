package l4_class_object.exercise.class_stopwatch;

import java.time.LocalTime;

public class TestWatch {
    public static int[] selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[i]) {
                    int tempt = array[i];
                    array[i] = array[j];
                    array[j] = tempt;
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = new int[100000];
        for (int i = 0; i < 100000; i++) {
            array[i] = (int) (Math.random() * 1000);
        }
        LocalTime start = LocalTime.now();
        array = selectionSort(array);
        LocalTime end = LocalTime.now();
        StopWatch stopWatch = new StopWatch(start, end);
        System.out.println("Elapsed Time is: " + stopWatch.getElapsedTime() + " milisecond");
        for (int x : array) {
            System.out.println(x);
        }
    }

}
