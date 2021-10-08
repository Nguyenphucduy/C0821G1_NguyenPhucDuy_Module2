package l6_inheritance.exercise;

public class TestCylinder {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(10,10.50,"blue");
        System.out.println(cylinder);
        System.out.print("Volume = " + cylinder.Volume());
    }
}
