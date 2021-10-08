package l6_inheritance.exercise;

import java.util.Arrays;

public class TestPoint3D {
    public static void main(String[] args) {
        Point3D point3D = new Point3D();
        System.out.println(point3D);
        point3D = new Point3D(1.1f,1.2f,1.3f);
        System.out.println(point3D);
        System.out.println(Arrays.toString(point3D.getXYZ()));
    }
}
