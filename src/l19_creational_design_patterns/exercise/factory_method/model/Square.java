package l19_creational_design_patterns.exercise.factory_method.model;

import l19_creational_design_patterns.exercise.factory_method.service.Shape;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("half fill");
    }
}
