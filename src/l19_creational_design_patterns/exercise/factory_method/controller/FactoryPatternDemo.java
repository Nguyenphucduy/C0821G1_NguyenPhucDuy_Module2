package l19_creational_design_patterns.exercise.factory_method.controller;

import l19_creational_design_patterns.exercise.factory_method.model.Shape;
import l19_creational_design_patterns.exercise.factory_method.model.ShapeFactory;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape a1 = shapeFactory.getShape("fill");
        a1.draw();

        Shape a2 = shapeFactory.getShape("not fill");
        a2.draw();
        Shape a3 = shapeFactory.getShape("hello");
        a3.draw();
    }
}
