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
                    System.out.println("2. Print the square triangle (The corner is square at 4 different angles: top-left, top-right, down-left, down-right)");
                    System.out.println("input height");
                    height = input.nextInt();
                    System.out.println("Print a right triangle, with right angles at down-left");
                    for (int i =1 ; i<= height; i++){
                        for (int j = 1; j < i; j++){
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    System.out.println("Prints a right triangle, with right angles on the top-left");
                    for (int i = height ; i >= 1; i--){
                        for (int j = 1; j <= i; j++){
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    System.out.println("Prints a right triangle, with left angles on the down-right");
                    for (int i = 0; i < height; i++){
                        for (int j = 5; j > i; j--){
                            System.out.print(" ");; //Vẽ tam giác trống
                        }
                        for (int k= 0; k <= i; k++){
                            System.out.print("*");//Vẽ tam giác bằng *
                        }
                        System.out.println();//XUống dòng khi vẽ xong 1 hàng
                    }
                    System.out.println("Prints a right triangle, with left angles on the top-right");
                    for (int i = 0; i < height; i++){
                        for (int j = 0; j <= i; j++){
                            System.out.print(" ");; //Vẽ tam giác trống
                        }
                        for (int k = height; k > i; k--){
                            System.out.print("*");;//Vẽ tam giác bằng *
                        }
                        System.out.println();; //XUống dòng khi vẽ xong 1 hàng
                    }
                    break;
                case 3:
                    System.out.println("Print isosceles triangle");
                    System.out.println("input height");
                    height = input.nextInt();
//                    width = height * 2 - 1;
                    for (int i = 1; i <= height; i++) {
                        for (int j = 0; j <= height - i; j++) { //col/2 - row ' '
                            System.out.print(" ");
                        }
                        for (int k = 0; k < i * 2 - 1; k++) { // row*2 -1 draw '*'
                            System.out.print("*");;
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
