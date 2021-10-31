package l18_solid.demo.open_close_principle.true_design.model;


import l18_solid.demo.open_close_principle.true_design.service.IShape;

import java.awt.*;

//Hình chữ nhật
public class Rectangle implements IShape {
    private Point topLeft;
    private double height;
    private double width;

    public Rectangle() {
    }

    public Rectangle(Point topLeft, double height, double width) {
        this.topLeft = topLeft;
        this.height = height;
        this.width = width;
    }

    public Point getTopLeft() {
        return topLeft;
    }

    public void setTopLeft(Point topLeft) {
        this.topLeft = topLeft;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double area(Object shape) {
        return 0;
    }
}
