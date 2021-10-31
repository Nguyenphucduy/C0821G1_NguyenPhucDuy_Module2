package ss19_solid.open_close_principle.true_design.model;

import ss19_solid.open_close_principle.true_design.service.IShape;

import java.awt.*;

//class hình vuông
public class Square implements IShape {
    private Point topLeft;
    private double side;

    public Square() {
    }

    public Square(Point topLeft, double side) {
        this.topLeft = topLeft;
        this.side = side;
    }

    public Point getTopLeft() {
        return topLeft;
    }

    public void setTopLeft(Point topLeft) {
        this.topLeft = topLeft;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }


    @Override
    public double area(Object shape) {
        return 0;
    }
}
