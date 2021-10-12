package l7_abstract_class_and_interface.exercise.interface_resizeable.controller;

import l7_abstract_class_and_interface.exercise.interface_resizeable.model.Rectangle;
import l7_abstract_class_and_interface.exercise.interface_resizeable.model.Square;

public class SquareTest {
    public static void main(String[] args) {
        int x = (int) Math.floor(Math.random() * 10);
        Square[] squares = new Square[3];
        squares[0] = new Square(x, "yellow", false);
        squares[1] = new Square();
        squares[2] = new Square(x);
        System.out.println("Before : ");
        for (Square i : squares){
            System.out.println(i);
        }
        System.out.println("After : ");
        for (Square i : squares) {
            i.resize(Math.random() * 100);
            System.out.println(i);
        }
    }
}
