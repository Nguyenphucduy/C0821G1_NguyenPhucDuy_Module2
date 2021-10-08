package l6_inheritance.exercise;

import java.util.Arrays;

public class TestPoint {
    public static void main(String[] args) {
        Point point = new Point(2.2f,3.3f);
        System.out.println(point);
        System.out.println(Arrays.toString(point.getXY()));

    }
}
