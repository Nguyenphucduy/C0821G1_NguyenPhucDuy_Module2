package review.week5.common;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Validate {
    static Scanner scanner = new Scanner(System.in);

    public static String inputEmail() {
        System.out.print ("Enter email : ");
        String email = scanner.nextLine();
        while (!Pattern.matches("^\\w+@\\w+(\\.\\w+){1,2}$", email)) {
            System.out.print("Enter email : ");
            email = scanner.nextLine();
        }
        return email;


    }

    public static int inputYearOfBirth() {
        int yearOfBirth;
        do {
            System.out.print("Enter the year of birth between 1900 and 2021 : ");
            yearOfBirth = Integer.parseInt(scanner.nextLine());
        } while (yearOfBirth > 2021 || yearOfBirth < 1900);
        return yearOfBirth;
    }

    static public String inputPhone() {
        System.out.print("Enter a phone number starting with 84 : ");
        String phone = scanner.nextLine();
        while (!Pattern.matches("^84\\d{9}$", phone)) {
            System.out.println("No matches");
            System.out.print("Enter a phone number starting with 84 : ");
            phone = scanner.nextLine();
        }
        return phone;
    }

    public static int checkExpInYear() {
        int expInYear;
        do {
            System.out.print("Enter the expInYear of between 0 and 100 : ");
            expInYear = Integer.parseInt(scanner.nextLine());
        } while (expInYear > 100 || expInYear < 0);
        return expInYear;
    }

    public static String choiceGraduationRank() {
        String graduationRank = "";

        System.out.println("Choice Graduation Rank");
        System.out.println("1. Excellent");
        System.out.println("2. Good");
        System.out.println("3. Fair");
        System.out.println("4. Poor");
        System.out.print("Enter your choice : ");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                graduationRank = "Excellent";
                break;
            case 2:
                graduationRank = "Good";
                break;
            case 3:
                graduationRank = "Fair";
                break;
            case 4:
                graduationRank = "Poor";
                break;
        }
        return graduationRank;
    }
}
