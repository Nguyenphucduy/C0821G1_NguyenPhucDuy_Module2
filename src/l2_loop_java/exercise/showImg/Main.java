package l2_loop_java.exercise.showImg;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int choice;
        do {
            Scanner input = new Scanner(System.in);
            System.out.println("Menu");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)");
            System.out.println("3. Print isosceles triangle");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    int height;
                    int width;
                    System.out.println("1. Print the rectangle");
                    System.out.println("input height");
                    height = input.nextInt();
                    System.out.println("input width");
                    width = input.nextInt();
                    for (int i = 1; i <= height; i++) {
                        for (int j = 2; j <= width; j++) {
                            System.out.print("*");
                        }
                        System.out.println("*");
                    }
                    break;
                case 2:
                    System.out.println("2. Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)");
                    System.out.println("input height");
                    height = input.nextInt();
                    for (int i =1 ; i<= height; i++){
                        for (int j = 1; j < i; j++){
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("Print isosceles triangle");
                    System.out.println("input height");
                    height = input.nextInt();
                    for (int i = height ; i >= 1; i--){
                        for (int j = 1; j <= i; j++){
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    System.exit(4);
                default:
                    System.out.println("No choice!");
            }
        }while (choice != 4) ;
    }
}
