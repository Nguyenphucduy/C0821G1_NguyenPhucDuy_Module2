package l19_creational_design_patterns.exercise.factory_method.model;

import l19_creational_design_patterns.exercise.factory_method.service.IShape;

public class Square extends Shape {
    @Override
    public void draw() {
        System.out.println("half fill");
    }
}
