package l18_solid.demo.open_close_principle.true_design.service.impl;


import l18_solid.demo.open_close_principle.true_design.model.Circle;
import l18_solid.demo.open_close_principle.true_design.service.IShape;

public class CircleService implements IShape {
    @Override
    public double area(Object shape) {
        Circle circle = (Circle) shape;
        return circle.getRadius()*circle.getRadius();
    }
}
