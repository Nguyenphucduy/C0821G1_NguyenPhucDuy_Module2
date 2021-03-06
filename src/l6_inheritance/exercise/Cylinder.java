package l6_inheritance.exercise;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(double height,double radius, String color) {
        super(radius,color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double Volume(){
        return this.height * super.getRadius() * Math.PI;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                super.toString() +
                '}';
    }
}
