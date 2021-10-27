package l5_access_modifier_static_method_static_property.exercise;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle() {

    }

    public Circle(double r) {
        this.radius = r;
    }

    public double getRadius() {//public->private
        return this.radius;
    }

    public double getArea() {////public->private:pham vi trong lop
        return this.radius * this.radius * 3.14;
    }
}
