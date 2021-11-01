package l19_creational_design_patterns.exercise.factory_method.model;

import l19_creational_design_patterns.exercise.factory_method.service.IShape;

public class Rectangle extends Shape {
    @Override
    public void draw() {
//        String fills = "not fill";
        System.out.println("not fill");

    }
}
