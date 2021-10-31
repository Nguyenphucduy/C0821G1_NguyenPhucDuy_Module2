package l18_solid.demo.open_close_principle.true_design.model;


import java.awt.*;

//Hình tròn
public class Circle {
    private static final double PI = 3.14;
    private Point center;
    private double radius;

    public Circle() {
    }

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public static double getPI() {
        return PI;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


}
