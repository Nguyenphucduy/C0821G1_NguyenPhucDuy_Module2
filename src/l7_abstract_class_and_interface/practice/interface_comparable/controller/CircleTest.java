package l7_abstract_class_and_interface.practice.interface_comparable.controller;

import l7_abstract_class_and_interface.practice.interface_comparable.model.Circle;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(3.5);
        System.out.println(circle);

        circle = new Circle(3.5, "indigo", false);
        System.out.println(circle);
    }
}
