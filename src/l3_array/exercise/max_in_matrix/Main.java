package l3_array.exercise.max_in_matrix;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int row, col;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the row in array");
        row = scanner.nextInt();
        System.out.println("Enter the col in array");
        col = scanner.nextInt();
        int[][] matrix = new int[row][col];
        int max = matrix[0][0];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Enter the item the [" + i + ", " + j + "]: ");
                matrix[i][j] = scanner.nextInt();
                if (max<matrix[i][j]){
                    max = matrix[i][j];
                }
            }
        }
        System.out.print("max in matrix is : " + max);

    }
}
