package l7_abstract_class_and_interface.exercise.interface_resizeable.controller;

import l7_abstract_class_and_interface.exercise.interface_resizeable.model.Circle;

public class CircleTest {
    public static <circles> void main(String[] args) {
        int x = (int) Math.floor(Math.random() * 10);
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(x, "yellow", false);
        circles[1] = new Circle();
        circles[2] = new Circle(x);
        System.out.println("Before : ");
        for (Circle i : circles){
            System.out.println(i);
        }
        System.out.println("After : ");
        for (Circle i : circles) {
            i.resize(Math.random() * 100);
            System.out.println(i);
        }
    }
}
