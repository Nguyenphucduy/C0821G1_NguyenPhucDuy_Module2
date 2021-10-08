package l6_inheritance.exercise;

import java.util.Scanner;

public class TestTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the a : ");
        double a = scanner.nextDouble();
        System.out.print("Enter the b : ");
        double b = scanner.nextDouble();
        System.out.print("Enter the c : ");
        double c = scanner.nextDouble();
        Triangle triangle = new Triangle(a,b,c);
        System.out.println(triangle);
//        System.out.print("Enter the color : ");
//        String color = scanner.nextLine();
//        System.out.println("Enter the filled : ");
//        boolean filled = scanner.nextBoolean();
//        Triangle triangle1 = new Triangle(color,filled);
//        System.out.println(triangle1);

    }
}
