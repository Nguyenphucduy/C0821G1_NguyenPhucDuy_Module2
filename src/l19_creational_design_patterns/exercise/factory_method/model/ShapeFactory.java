package l19_creational_design_patterns.exercise.factory_method.model;

public class ShapeFactory {
    public Shape getShape(String type) {
        if ("fill".equals(type)) {
            return new Circle();
        } else if ("not fill".equals(type)){
            return new Rectangle();
        }else {
            return new Square();
        }
    }
}
