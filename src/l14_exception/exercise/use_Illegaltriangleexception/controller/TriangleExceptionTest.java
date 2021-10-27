package l14_exception.exercise.use_Illegaltriangleexception.controller;

import l14_exception.utils.exception.IllegalTriangleException;


import java.util.Scanner;

public class TriangleExceptionTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        int count = 0;
        while (true) {


            try {

                System.out.print("input a : ");
                a = sc.nextInt();
                System.out.print("input b : ");
                b = sc.nextInt();
                System.out.print("input c : ");
                c = sc.nextInt();

                if (a < 0 || b < 0 || c < 0) {
                    throw new IllegalTriangleException("Error :  because a , b or c < 0");
                }

                if (a + b < c || b + c < a || a + c < b) {
                    throw new IllegalTriangleException("Error : because sum of 2 sides is not greater than the other side ");
                }

                break;
            } catch (IllegalTriangleException illegalTriangleException) {
                System.out.println(illegalTriangleException.getMessage());
            } catch (Exception exception) {
                System.err.println("Error" + exception);
            } finally {
                count++;
                System.err.println("input " + count + " time");
            }


        }

    }

}
