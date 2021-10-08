package l6_inheritance.exercise;

import l6_inheritance.practice.Shape;

public class Triangle  extends Shape {
    private double size1 = 1.0;
    private double size2 = 1.0;
    private double size3 = 1.0;

    public Triangle() {
    }

    public Triangle(double size1, double size2, double size3) {
        this.size1 = size1;
        this.size2 = size2;
        this.size3 = size3;
    }

    public Triangle(String color, boolean filled, double size1, double size2, double size3) {
        super(color, filled);
        this.size1 = size1;
        this.size2 = size2;
        this.size3 = size3;
    }

    public Triangle(String color, boolean filled) {
        super(color, filled);
    }

    public double getSize1() {
        return size1;
    }

    public void setSize1(double size1) {
        this.size1 = size1;
    }

    public double getSize2() {
        return size2;
    }

    public void setSize2(double size2) {
        this.size2 = size2;
    }

    public double getSize3() {
        return size3;
    }

    public void setSize3(double size3) {
        this.size3 = size3;
    }
    public double getPerimeter(){
        return this.size1+this.size2+this.size3;
    }
    public double getArea(){
        return Math.pow((this.getPerimeter()/2)*((this.getPerimeter()/2)-this.size1)*((this.getPerimeter())-this.size2)*((this.getPerimeter()-this.size3)),0.5);
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "size1=" + size1 +
                ", size2=" + size2 +
                ", size3=" + size3 + "\n"+
                super.toString()+
                " \n Perimeter : " + getPerimeter() +
                " \n Area : " + getArea() +
                '}';
    }
}
