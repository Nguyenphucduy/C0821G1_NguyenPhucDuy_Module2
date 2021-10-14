package week_algorithm.week_2;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập q");
        int q = sc.nextInt();
        if (q <= 500 && q >= 0) {
            for (int i = 0; i < q; i++) {
                System.out.println("Nhập a");
                int a = sc.nextInt();
                System.out.println("Nhập b");
                int b = sc.nextInt();
                System.out.println("Nhập n");
                int n = sc.nextInt();
                int sum = a;
                if (a >= 0 && a <= 50 && b >= 0 && b <= 50 && n >= 1 && n <= 15) {
                    for (int j = 0; j < n; j++) {
                        sum += b * Math.pow(2, j);
                        System.out.print(sum + " ");
                    }
                    System.out.println();
                }
                else {
                    System.out.println("Xin nhập lại");
                    q++;
                }
            }
        } else {
            System.out.println("Không hợp lệ");
        }
    }
}
