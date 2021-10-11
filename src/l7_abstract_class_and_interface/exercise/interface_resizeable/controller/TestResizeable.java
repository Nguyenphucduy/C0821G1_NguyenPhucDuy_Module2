package l7_abstract_class_and_interface.exercise.interface_resizeable.controller;

import l7_abstract_class_and_interface.exercise.interface_resizeable.model.Circle;
import l7_abstract_class_and_interface.exercise.interface_resizeable.model.Rectangle;
import l7_abstract_class_and_interface.exercise.interface_resizeable.model.Square;
import l7_abstract_class_and_interface.exercise.interface_resizeable.service.Shape;

public class TestResizeable {
    public static void main(String[] args) {
        int x = (int) Math.floor(Math.random() * 10);
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(x, "yellow", false);
        shapes[1] = new Rectangle(x, x, "infinity", true);
        shapes[2] = new Square(x, "melinda", true);
        System.out.println("Before : ");
        for (Shape i : shapes){
            System.out.println(i);
        }

        for (Shape i : shapes) {
            i.resize(Math.random() * 100);
        }
        System.out.println("After : ");
        Shape.printShape(shapes);
    }

}
