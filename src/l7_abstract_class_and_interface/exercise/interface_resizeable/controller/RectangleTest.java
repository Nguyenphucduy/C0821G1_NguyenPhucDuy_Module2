package l7_abstract_class_and_interface.exercise.interface_resizeable.controller;

import l7_abstract_class_and_interface.exercise.interface_resizeable.model.Rectangle;

public class RectangleTest {
    public static <rectangles> void main(String[] args) {
        int x = (int) Math.floor(Math.random() * 10);
        Rectangle[] rectangles = new Rectangle[3];
        rectangles[0] = new Rectangle(x,x, "yellow", false);
        rectangles[1] = new Rectangle();
        rectangles[2] = new Rectangle(x,x);
        System.out.println("Before : ");
        for (Rectangle i : rectangles){
            System.out.println(i);
        }
        System.out.println("After : ");
        for (Rectangle i : rectangles) {
            i.resize(Math.random() * 100);
            System.out.println(i);
        }
    }
}
