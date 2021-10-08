package l6_inheritance.exercise;

import java.util.Arrays;

public class TestMovablePoint {
    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint(4.4f,5.5f);
        System.out.println(movablePoint);
        System.out.println(Arrays.toString(movablePoint.getSpeed()));
        System.out.println(movablePoint.move());
    }
}
