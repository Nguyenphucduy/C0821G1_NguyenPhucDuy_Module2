package l19_creational_design_patterns.exercise.factory_method.model;

import l19_creational_design_patterns.exercise.factory_method.service.Shape;

public class Circle implements Shape  {
    @Override
    public void draw() {
//        String fill = "fill";
        System.out.println("fill");
    }
}
