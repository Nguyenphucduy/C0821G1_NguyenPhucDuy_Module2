package s04_class_and_object;

import java.util.Arrays;
import java.util.Date;

public class StopWatch {
    private Date startTime;
    private Date endTime;

    public StopWatch() {
        this.startTime = new Date();
        //System.out.println(this.startTime);
    }

    public void start() {
        this.startTime = new Date();
    }

    public void stop() {
        this.endTime  = new Date();
    }

    public float getElapsedTime(){
        return this.endTime.getTime() - this.startTime.getTime();
    }

    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();

        stopWatch.start();
        //thuc hien thuat toan:

        double[] arr1 = new double[50000];
        for(int i= 0; i<50000; i++){
            arr1[i] = Math.random()*100 + 1;
        }
        System.out.println(Arrays.toString(arr1));

        stopWatch.stop();

        System.out.printf("Elapsed time: %.2f ms", stopWatch.getElapsedTime());
    }
}
