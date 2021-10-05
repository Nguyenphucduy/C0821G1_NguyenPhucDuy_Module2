package l4_class_object.exercise.classStopwatch;

import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[100000];
        for (int i = 0; i < 100000; i++) {
            arr[i] = ((int) (Math.random() * 99));
        }
        LocalTime start = LocalTime.now();
        arr = selectionSort(arr);
        LocalTime end = LocalTime.now();
        StopWatch stopWatch1 = new StopWatch(start, end);
//        System.out.println("LocalTime(reset) is : "+ stopWatch1.getStartTime());
//        System.out.println("LocalTime (relay) is : "+ stopWatch1.getEndTime());
        System.out.println("Elapsed Time is: " + stopWatch1.getElapsedTime() + " milisecond");
//        for (int x : arr){
//            System.out.println(x);
//        }
    }

    public static int[] selectionSort(int[] array) {
        for (int i = 0; i < array.length-1; i++) {
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

    public static class StopWatch {
        private LocalTime startTime, endTime;

        public StopWatch() {

            startTime = LocalTime.now();
        }

        public StopWatch(LocalTime startTime, LocalTime endTime) {
            this.startTime = startTime;
            this.endTime = endTime;
        }

        public LocalTime getStartTime() {
            return startTime;
        }

        public LocalTime getEndTime() {
            return endTime;
        }

        public void start() {
            startTime = LocalTime.now();
        }

        public void stop() {
            endTime = LocalTime.now();
        }

        public int getElapsedTime() {
            int miliSecond = (((endTime.getHour() - startTime.getHour()) * 3600) * 1000 + ((endTime.getMinute() - startTime.getMinute()) * 60) * 1000 + (endTime.getSecond() - startTime.getSecond()) * 1000);
            return miliSecond;
        }

    }
}
