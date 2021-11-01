package l19_creational_design_patterns.exercise.factory_method.model;

import l19_creational_design_patterns.exercise.factory_method.service.IShape;

public class Circle extends Shape  {
    @Override
    public void draw() {
//        String fill = "fill";
        System.out.println("fill");
    }
}
