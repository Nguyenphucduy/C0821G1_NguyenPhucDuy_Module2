package l6_inheritance.exercise;

import java.util.Scanner;

public class TestTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the a : ");
        double a = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter the b : ");
        double b = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter the c : ");
        double c = Double.parseDouble(scanner.nextLine());
        Triangle triangle = new Triangle(a,b,c);
        System.out.println(triangle);
        System.out.print("Enter the color : ");
        String color = scanner.nextLine();
        System.out.println("Enter the filled : ");
        boolean filled = Boolean.parseBoolean(scanner.nextLine());
        Triangle triangle1 = new Triangle(color,filled);
        System.out.println(triangle1);
    }
}
