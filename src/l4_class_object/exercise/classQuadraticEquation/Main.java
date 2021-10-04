package l4_class_object.exercise.classQuadraticEquation;

import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the a:");
            double a = scanner.nextDouble();
            System.out.print("Enter the b:");
            double b = scanner.nextDouble();
            System.out.print("Enter the c:");
            double c = scanner.nextDouble();
            QuadraticEquation quadraticEquation = new QuadraticEquation(a, b,c);
            System.out.println("Your QuadraticEquation \n"+ quadraticEquation.disPlay());
        }
    public static class QuadraticEquation {
        double a, b, c;

        public QuadraticEquation() {
        }

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

        public double getDiscriminant() {
            return (this.b * 2) - (4 * this.a * this.c);
        }

        public double getRoot1() {
            return (-this.b + (b - Math.pow(4 * this.c * this.a, 0.5))) / (2 * this.a);
        }

        public double getRoot2() {
            return (-this.b - (b - Math.pow(4 * this.c * this.a, 0.5))) / (2 * this.a);
        }

        public String disPlay(){
            if (getDiscriminant()>0){
               return "The solution of the equation is {" + "Root1=" + getRoot1() + ", Root2=" + getRoot2() + "}";
            }else if (getDiscriminant()==0){
                return "The solution of the equation is {" + "Root=" + getRoot1() +"}";
            }else {
                return "The equation has no roots";
            }

        }

    }

}
