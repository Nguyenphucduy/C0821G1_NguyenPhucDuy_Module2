package l7_abstract_class_and_interface.exercise.interface_colorable.model;

import l7_abstract_class_and_interface.exercise.interface_colorable.service.Colorable;
import l7_abstract_class_and_interface.practice.interface_comparable.model.Shape;

public class Square extends Shape implements Colorable {

    private double side;

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public Square(double side, String color, boolean filled) {
        super(color,filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "A Square with side="
                + getSide()
                + ", which is a subclass of "
                + super.toString()
                + ", Area=" +
                + getArea();
    }

    double getArea() {
        return side * side;
    }


    @Override
    public void howToColor() {
        System.out.println( " Color all four sides");
    }
}
