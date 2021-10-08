package l6_inheritance.exercise;

import java.util.Arrays;

public class Point2DTest {
    public static void main(String[] args) {
        Point2D point2D =new Point2D();
        System.out.println(point2D);
        point2D = new Point2D(1.1f,2.2f);
        System.out.println(point2D);
        System.out.print("array : "+Arrays.toString(point2D.getXY()));
    }
}
