package ss19_solid.open_close_principle.true_design.service.impl;

import ss19_solid.open_close_principle.true_design.service.IShape;
import ss19_solid.open_close_principle.wong_design.Circle;

public class CircleService implements IShape {
    @Override
    public double area(Object shape) {
        Circle circle = (Circle) shape;
        return circle.getRadius()*circle.getRadius();
    }
}
