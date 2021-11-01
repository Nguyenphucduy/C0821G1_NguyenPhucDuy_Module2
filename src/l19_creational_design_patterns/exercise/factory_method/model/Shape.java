package l19_creational_design_patterns.exercise.factory_method.model;

import l19_creational_design_patterns.exercise.factory_method.service.IShape;

public class Shape implements IShape {
    @Override
    public void draw() {
//        String fill = "";
        System.out.println("do something");
    }
}
