package l5_access_modifier_static_method_static_roperty.exercise;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Circle {
    private double radius =1.0;
    private String color = "red";
    public Circle(){

    }
    public Circle (double r){
        this.radius = r;
    }

    public double getRadius() {
        return radius;
    }
    public double getArea (){
        return this.radius*this.radius*3.14;
    }
    public static class TestCircle{
        public static void main(String[] args) {
            Circle circle = new Circle();
            System.out.println(circle.getRadius());
            System.out.println(circle.getArea());
        }
    }
}
