package l4_class_object.exercise.class_stopwatch;

import java.time.LocalTime;

public class StopWatch {
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

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }

    public int getElapsedTime() {
        int miliSecond =  (endTime.getSecond() - startTime.getSecond()) * 1000;
        return miliSecond;
    }

}
