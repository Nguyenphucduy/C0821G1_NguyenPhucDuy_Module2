package java01.exercise;

import java.util.Scanner;

public class ReadInteger {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter your Integer");
        int number = read.nextInt();
        String String = null;
        String String2 = null;
        String String3 = null;
        String String4 = null;
//        String[] arr = {"zero","one","two","three","four","five","six","seven","eight","nine"};
//        for (int i = 0; i < arr.length ; i++){
//            changeString = changeString + arr[number[i]];
//        }
        if ((number >= 0) && (number < 10)) {
            switch (number) {
                case 0:
                    String = "zero";
                    break;
                case 1:
                    String = "one";
                    break;
                case 2:
                    String = "two";
                    break;
                case 3:
                    String = "three";
                    break;
                case 4:
                    String = "four";
                    break;
                case 5:
                    String = "five";
                    break;
                case 6:
                    String = "six";
                    break;
                case 7:
                    String = "seven";
                    break;
                case 8:
                    String = "eight";
                    break;
                case 9:
                    String = "nine";
                    break;
            }
            System.out.printf("Your number is :%d Read as : %s ", number, String);
        } else if ((number >= 10) && (number < 20)) {
            int number2 = number % 10;
            switch (number2) {
                case 0:
                    String2 = "ten";
                    break;
                case 1:
                    String2 = "eleven";
                    break;
                case 2:
                    String2 = "twelve";
                    break;
                case 3:
                    String2 = "thirteen";
                    break;
                case 4:
                    String2 = "fourteen";
                    break;
                case 5:
                    String2 = "fifteen";
                    break;
                case 6:
                    String2 = "sixteen";
                    break;
                case 7:
                    String2 = "seventeen";
                    break;
                case 8:
                    String2 = "eighteen";
                    break;
                case 9:
                    String2 = "nineteen";
                    break;
            }
            System.out.printf("Your number %d reads as is : %s", number2, String2);

        } else if ((number >= 20) && (number < 100)) {
            int number3 = number / 10;
            int number4 = number % 10;
            switch (number3) {
                case 2:
                    String3 = "twenty";
                    break;
                case 3:
                    String3 = "thirty";
                    break;
                case 4:
                    String3 = "forty";
                    break;
                case 5:
                    String3 = "fifty";
                    break;
                case 6:
                    String3 = "sixty";
                    break;
                case 7:
                    String3 = "seventy";
                    break;
                case 8:
                    String3 = "eighty";
                    break;
                case 9:
                    String3 = "ninety";
                    break;
            }
            switch (number4) {
                case 0:
                    String4 = null;
                    break;
                case 1:
                    String4 = "one";
                    break;
                case 2:
                    String4 = "two";
                    break;
                case 3:
                    String4 = "three";
                    break;
                case 4:
                    String4 = "four";
                    break;
                case 5:
                    String4 = "five";
                    break;
                case 6:
                    String4 = "six";
                    break;
                case 7:
                    String4 = "seven";
                    break;
                case 8:
                    String4 = "eight";
                    break;
                case 9:
                    String4 = "nine";
                    break;
            }
            System.out.printf("Your number %d reads as is : %s %s", number3, String3, String4);
        } else {
            System.out.println(number + " out of ability");
        }
    }
}
// for ( int i = 100; i <1000; i++){
//        if (i<200){
//        String5 = "one hundred";
//        System.out.printf("Your number %d reads as is : %s %s",i,String5,String);
//        break;
//        }else {
//        System.out.println("I");
//        }