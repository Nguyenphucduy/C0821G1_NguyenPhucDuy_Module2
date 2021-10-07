package l4_class_object.exercise.class_quadratic_equation;

import java.util.Scanner;

public class QuadraticEquation {
    private double a,b,c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
    public double getDiscriminant(){
        return this.b*this.b-(4*this.a*this.c);
    }
    public double  getRoot1(){
        return (-this.b + this.b - Math.pow((4*this.a*this.c),0.5))/(2*this.a);
    }
    public double  getRoot2(){
        return (-this.b - this.b - Math.pow((4*this.a*this.c),0.5))/(2*this.a);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the a:");
        double a = scanner.nextDouble();
        System.out.print("Enter the b:");
        double b = scanner.nextDouble();
        System.out.print("Enter the c:");
        double c = scanner.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation( a,b,c);
        if (quadraticEquation.getDiscriminant()>0){
            System.out.print("The equation has two roots "+" Root1: = " + quadraticEquation.getRoot1() + " Root2 : = " + quadraticEquation.getRoot2());
        }else if (quadraticEquation.getDiscriminant()==0){
            System.out.print("The equation has 1 roots"+" Root: = "+ quadraticEquation.getRoot1());
        }else {
            System.out.print("The equation has no roots");
        }
    }
}
