package week_algorithm.week_3;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<List> lines = new ArrayList<List>();
        System.out.println("Nhập số phần tử của dòng : ");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            List<Integer> line = new ArrayList<Integer>();
            System.out.print("Nhập phần tử của dòng : ");
            int d = scanner.nextInt();
            for (int j = 0; j < d; j++) {
                line.add(scanner.nextInt());
            }
            lines.add(line);
        }

        int q = scanner.nextInt();
        for (int i = 0; i < q; i++) {
            System.out.println("Nhập x : ");
            int x = scanner.nextInt();
            System.out.println("Nhập y :");
            int y = scanner.nextInt();
            if (y > lines.get(x - 1).size()) {
                System.out.println("ERROR");
            } else {
                System.out.println(lines.get(x - 1).get(y - 1));
            }
        }

        scanner.close();
    }
}
